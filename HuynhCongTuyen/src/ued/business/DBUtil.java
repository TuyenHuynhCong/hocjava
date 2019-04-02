package ued.business;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

import murach.db.DBException; // phải viết thêm ở trên

public class DBUtil {

static private Connection con;

private DBUtil(){} // hàm dựng

static synchronized Connection getConnection(String catRDB) throws DBException{

// Giả sử CSDL murach của MySQL và SQL Server là như nhau!

if(con!=null) { return con; }

else {

try{

if(catRDB=="MySQL"){

String url="jdbc:mysql://localhost:3306/murach"+

"?&characterEncoding=utf-8&useUnicode=true"+

"&verifyServerCertificate=false"+

"&useSSL=true"; // cái này cần cho CSDL với charset-utf8 Tiếng Việt và MySQL 5.6 á

String user="root";

String pass="";

con=DriverManager.getConnection(url,user,pass);

} else if(catRDB=="SQLServer"){

String url = "jdbc:jtds:sqlserver://NDT:1433;instance=SQLExpress;DatabaseName=murach";

con = DriverManager.getConnection(url,"TH","1234");

/* -----------------------------------------------------------------------------------------------------------------------

NDT là tên Database Server, bạn hãy lấy tên phù hợp máy của mình. Java cũng cho phép xác

định Database Server Name và Instance Name (nếu có), hãy tìm!

Nhớ tạo user (TH, 1234) và phân quyền phù hợp, bạn có thể tạo user khác.

Trong SQL Server bạn không quan tâm đến Tiếng Việt có dấu như MySQL!

-------------------------------------------------------------------------------------------------------------------------*/

}

return con;

} catch(SQLException ex){ throw new DBException(ex.toString()); }

} //else if else

} //end getConnection

static synchronized void closeConnection() throws DBException{

if(con!=null){

try{ con.close(); }

catch(SQLException ex){ throw new DBException(ex.toString()); }

finally { con=null; }

} // end if

} // end of closeConnection

} // end class
