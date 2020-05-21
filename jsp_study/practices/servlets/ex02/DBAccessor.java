package login_regi;

import java.sql.*;

public class DBAccessor {
	Connection conn=null;
	Statement stmt=null;
	PreparedStatement pstmt=null;
	ResultSet rs = null;
	ResultSetMetaData rsmd=null;
	
	public DBAccessor() throws SQLException, ClassNotFoundException{
		if(conn==null)
			Connect();
	}
	
	void Connect() throws ClassNotFoundException, SQLException{
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("Driver Load Success");
		
		String url="jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String uid = "ssssuu";
		String pwd = "9531";
		
		conn=DriverManager.getConnection(url,uid,pwd);
		System.out.println("Connection Success");
	}
	
	void closeAll() throws SQLException{
		if(rs!=null) rs.close();
		if(pstmt!=null) pstmt.close();
		if(stmt!=null) stmt.close();
		
	}
	void closeConnect() throws SQLException{
		if(conn!=null) conn.close();
	}
	
	void showAll() throws SQLException{ // for test
		stmt=conn.createStatement();
		rs=stmt.executeQuery("select id,password from Login");

		System.out.println("uid\tpwd\t");
		while(rs.next()) {
			for(int i=1;i<=2;i++) {
				System.out.print(rs.getString(i)+"\t");
			}
			System.out.println();
		}
		System.out.println();
		closeAll();
	}
	
	void getColumnsNames() throws SQLException{ // for test
		stmt=conn.createStatement();
		rs=stmt.executeQuery("select * from Login");
		
		rsmd = rs.getMetaData();
		int colsize = rsmd.getColumnCount();
		for(int i=1;i<=colsize;i++) {
			System.out.print(rsmd.getColumnName(i)+"\t");
		}
	}
	
	boolean findLoginInfo(String uid, String pwd) throws SQLException{
		stmt=conn.createStatement();
		rs=stmt.executeQuery("select id,password from Login");
		
		while(rs.next()) {
			if(rs.getString(1).equals(uid) && rs.getString(2).equals(pwd)) {
				closeAll();
				return true;
			}
		}
		closeAll();
		return false;
	}
	
	void dbInsert(String[] infos) throws SQLException{
		pstmt=conn.prepareStatement("insert into Login values(?,?,?,?,?,?)");
		
		for(int i=1;i<=infos.length;i++) {
			//System.out.println(infos[i-1]);
			pstmt.setString(i, infos[i-1]);
			
		}
		int result = pstmt.executeUpdate();
		System.out.println(result+(result>1?" records":" record")+" inserted.");
		
		closeAll();
	}
}
