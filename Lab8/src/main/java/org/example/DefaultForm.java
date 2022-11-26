package org.example;

import javax.swing.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DefaultForm extends JDialog {
    private JPanel contentPane;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JList list1;
    private JButton Add;
    private JButton deleteButton;
    public DefaultListModel jListModel;

    private DbContext context;
    public DefaultForm() throws SQLException {
        setContentPane(contentPane);
        setModal(true);


        jListModel = new DefaultListModel();
        list1.setModel(jListModel);

        try {
            context = new DbContext();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        List<Persoana> list = new ArrayList<>();

        list = context.Get();

        jListModel.addAll(list);


        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

        Add.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                try {
                    onAdd();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });


        deleteButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                try {
                    onDelete();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    private void onAdd() throws SQLException {
        Persoana p = new Persoana(Integer.parseInt(textField1.getText()),
                                    textField2.getText(),
                                    Integer.parseInt(textField3.getText()));
        context.Post(p);

        jListModel.clear();
        jListModel.addAll(context.Get());
    }

    private void onDelete() throws SQLException {
        Persoana obj = (Persoana) list1.getSelectedValue();
        int index = obj.getId();

        if(index >= 0){
            System.out.println(index);
            context.Delete(index);

            jListModel.clear();
            jListModel.addAll(context.Get());
        }

    }


    public static void main(String[] args) throws SQLException {
        DefaultForm dialog = new DefaultForm();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
