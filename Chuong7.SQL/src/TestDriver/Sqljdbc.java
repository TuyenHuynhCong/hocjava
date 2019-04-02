package TestDriver;

import java.sql.*;

import javax.swing.JOptionPane;

public class Sqljdbc {

	public static void main(String[] args) {

		String db = "ued"; // Tạo ra trước!

		String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

		String url = "jdbc:sqlserver://NDT\\SQLEXPRESS;databaseName=" + db + ";";

		String user = "TH";

		String pass = "1234";

		// Phụ thuộc tên DataBase Server và cài đặt Security cho CSDL

		Connection conn = null;

		try {

			Class.forName(driver);

			conn = DriverManager.getConnection(url, user, pass);

			JOptionPane.showMessageDialog(null, "Connected to UED");

		} catch (Exception ex) {

			JOptionPane.showMessageDialog(null, ex.toString());

		}

	}

}