package test;

import java.sql.SQLException;

import SIEUTHISACH.Connect;

public class testConnect {

	public static void main(String[] args) throws SQLException {
		Connect con = new Connect("SIEUTHISACH", "tuyen","1234");
		if(con != null) System.out.println("KẾT NỐI THÀNH CÔNG");
//		int x=con.excuteInsertUpdateQuerry("insert into SinhVien values('S11','Phạm Văn Hải','Tam Kỳ,Quảng Nam','1234')");
//		System.err.println(x);
		
	}

}
