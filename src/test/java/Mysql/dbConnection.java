package Mysql;

import java.sql.*;

public class dbConnection {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO Auto-generated method stub

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "root");

        Statement stmt = con.createStatement();

        ResultSet result = stmt.executeQuery("select * from eproduct;");

        while (result.next()) {

            System.out.println("Product Id " + result.getInt("ID"));
            System.out.println("Product name " + result.getString("name"));
        }

        con.close();
    }

}
