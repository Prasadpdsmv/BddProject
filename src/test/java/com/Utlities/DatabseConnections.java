package com.Utlities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabseConnections {

    private  static Connection con;
    private static Statement statement;
    private static String url = "jdbc:mysql://localhost:3306/HRM";
    private static String username = "root";
    private static String password = "root";
    private static ResultSet resultSet;

    public void setUpConnectionToDB(){

        try {
            con = DriverManager.getConnection(url, username, password);
            statement=con.createStatement();
            System.out.println("connection to database is successful");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public void getDataFromDB(String query) {
        try {
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1) + " " + resultSet.getString(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

     public void closeDBConnection() {
         try {
             if (con != null) {
                 con.close();
                 statement.close();
                 resultSet.close();
                 System.out.println("database connection closed successfully");
             }
         } catch (Exception e) {
             e.printStackTrace();
         }
     }


}
