package com.korea.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO
{
    String id = "ROOT";
    String pw = "1234";
    String url = "jdbc:oracle:thin:@localhost:1521:XE";

    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    DAO()
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver Loading Success!");
            conn = DriverManager.getConnection(url, id, pw);
            System.out.println("DB Connected..");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
