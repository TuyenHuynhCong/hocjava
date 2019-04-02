package Business;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class TestConnection {
    static Connection conn = null;
    public static Connection getConnectionDB(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;"+"databaseName=UED;", "tuyen", "1234");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex.toString());
        }
        return conn;
    }
    
}