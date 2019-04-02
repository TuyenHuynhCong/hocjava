package Test;

import java.sql.SQLException;

import model.ConnectSQLSever;

public class Test {

	public static void main(String[] args) throws SQLException {
		ConnectSQLSever con = new ConnectSQLSever("QLSach", "tuyen","1234");
		if(con != null) System.out.println("KẾT NỐI OKAY hay");
		
		
		
	}

}
