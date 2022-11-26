package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbContext implements AutoCloseable{


    private String url = "jdbc:mysql://localhost:3306/test?useSSL=false";
    private Connection connection;
    private Statement statement;

    public DbContext() throws SQLException {
        connection = DriverManager.getConnection(url, "root", "EgbdF123#");
        statement = connection.createStatement();
    }

    public List<Persoana> Get() throws SQLException {
        List<Persoana> list = new ArrayList<>();
        String sql="select * from persoane";

        ResultSet rs = statement.executeQuery(sql);

        while(rs.next()){
            Persoana p = new Persoana(rs.getInt("idpersoane"),rs.getString("nume"), rs.getInt("varsta"));
            list.add(p);
        }

        rs.close();
        return list;
    }
    //INSERT INTO `test`.`persoane` (`idpersoane`, `nume`, `varsta`) VALUES ('3', 'Admin', '12');
    public void Post(Persoana p) throws SQLException {
        String sql = "INSERT INTO persoane VALUES('"+p.getId()+"', '"+p.getNume()+"', '"+p.getVarsta()+"')";
        statement.executeUpdate(sql);
    }

    //DELETE FROM persoane WHERE idpersoane='
    public void Delete(int Id) throws SQLException {
        String sql = "DELETE FROM persoane WHERE idpersoane='"+Id+"'";
        statement.executeUpdate(sql);
    }

    @Override
    public void close() throws Exception {
        System.out.println("closed");
        connection.close();
        statement.close();

    }
}
