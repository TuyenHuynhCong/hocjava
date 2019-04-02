import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Connect {

	public static Connection connect(String sql) throws ClassNotFoundException {
		Connection conn = null;
		String user = "tuyen";
		String password="1234";
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String url="jdbc:sqlserver://localhost:1433;databaseName=Book";
		try {
			conn = DriverManager.getConnection(url,user,password);
			JOptionPane.showMessageDialog(null," thanh cong");
			Access.main(null);
			//System.out.println("ok");
		} catch (SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null," that bai");
			
		}
		return null;
	}
	public static void main(String[] args) throws ClassNotFoundException {
		Connection conn;
		connect(null);
	
	}
}
