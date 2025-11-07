package org.prog.session10;

import org.testng.annotations.Test;

import java.sql.*;

public class DBTets {

    @Test
    public void DBTet() throws SQLException {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/db", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet resultSet = stmt.executeQuery("select FirstName, LastName from Persons");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("FirstName") + " "
                        + resultSet.getString("LastName"));
            }
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
    }
}
