package com.kosta.visitors;

import java.sql.*;
import java.util.*;

public class BookDAO {
	Connection conn=null;
	Statement stmt=null;
	PreparedStatement pstmt=null;
	ResultSet rs = null;
	
	public BookDAO() {
		try {
			Connection();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void Connection() throws SQLException, ClassNotFoundException{
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("Driver Load Success");
		
		String url="jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String uid="ssssuu";
		String pwd = "9531";
		
		conn=DriverManager.getConnection(url,uid,pwd);
		System.out.println("Connection Success");
	}
	public void Close() throws SQLException{
		if(rs!=null) rs.close();
		if(pstmt!=null) pstmt.close();
		if(stmt!=null) stmt.close();
	}
	public void ConnectionClose() throws SQLException{
		if(conn!=null) conn.close();
	}
	
	public int insert(String[] strs) throws SQLException{
		int ret=0;
		pstmt=conn.prepareStatement("insert into book values(?,?,?,?,?)");
		
		for(int i=1;i<=strs.length;i++) {
			pstmt.setString(i, strs[i-1]);
		}
		ret=pstmt.executeUpdate();
		Close();
		return ret;
	}
	
	public LinkedList select() throws SQLException{
		stmt=conn.createStatement();
		rs=stmt.executeQuery("select * from book");
		
		ResultSetMetaData rsmd = rs.getMetaData();
		
		
		LinkedList ret = new LinkedList();
		LinkedList<String> strs;// = new LinkedList<>();
		int r=0;
		while(rs.next()) {
			strs=new LinkedList<>();
			for(int i=1;i<=5;i++) {
				strs.add(rs.getString(i));
			}
			ret.add(strs);
		}
		
		return ret;
	}
		
}
