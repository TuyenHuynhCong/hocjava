package TestDriver;

import java.sql.*;

import javax.swing.JOptionPane;

public class jTDS {

	public static void main(String[] args) {

		String db = "ued"; // Tạo ra trước!

		String driver = "net.sourceforge.jtds.jdbc.Driver";

		String url = "jdbc:jtds:sqlserver://NDT;databaseName=" + db +

				";instance=SQLEXPRESS";

		String userName = "TH";

		String password = "1234";

		try {

			Class.forName(driver);

			Connection conn = null;

			conn = DriverManager.getConnection(url, userName, password);

			JOptionPane.showMessageDialog(null, "Connected");

		}

		catch (Exception ex) {

			JOptionPane.showMessageDialog(null, "Lỗi kết nối");

		}

	}

}