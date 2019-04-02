/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Admin
 */
public class Connect {
    public Connection   getConnection()
    {
        Connection conn=null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://ADMIN\\SQLEXPRESS;databaseName=UED;user=tuyen;password=1234";
		            
            conn = DriverManager.getConnection(url);
            if(conn!=null)
            {
                System.out.println("Ket noi thanh cong");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return conn;
    } 
}
