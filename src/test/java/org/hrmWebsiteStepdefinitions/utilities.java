package org.hrmWebsiteStepdefinitions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class utilities {

    public void gettConnection() throws FileNotFoundException, ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        File fl = new File("");
        FileInputStream fis = new FileInputStream(fl);

        Connection conect = DriverManager.getConnection("");
        Statement st=conect.createStatement();

    }
}
