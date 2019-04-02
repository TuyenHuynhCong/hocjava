package SIEUTHISACH;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connect {
	private Connection conn;
	private String url,db;
	private String user,pass;
	public Connection getConn() {
		return conn;
	}
	public String getDb() {
		return db;
	}
	public String getUser() {
		return user;
	}
	public String getPass() {
		return pass;
	}
	public void connect() throws SQLException {
		conn=DriverManager.getConnection(url, user, pass);
	}
	public Connect( String db, String user, String pass) throws SQLException {
		super();
		this.db = db;
		this.user = user;
		this.pass = pass;
		url="jdbc:sqlserver://ADMIN\\SQLEXPRESS;databaseName="+db+";";
		connect();
	}
	public Connect(String url) throws SQLException {
		super();
		this.url = url;
		connect();
	}
	
	public boolean excuteQuerry(String q) throws SQLException {
		Statement st=conn.createStatement();
		return st.execute(q);
	}
	
	public int excuteInsertUpdateQuerry(String q) throws SQLException {
		Statement st=conn.createStatement();
		return st.executeUpdate(q);
	}
	
	public ResultSet excuteSelect(String q) throws SQLException {
		Statement st=conn.createStatement();
		return st.executeQuery(q);
	}
	
	
	
}