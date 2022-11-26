package org.example;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {

        DefaultForm dialog = new DefaultForm();
        List<Persoana> persoanaList = new ArrayList<Persoana>();

        //DbContext runs close at end of scope
        try(DbContext context = new DbContext()){
            //calls to DB must be made here


        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        dialog.pack();
        dialog.setVisible(true);

    }
}