package univController;

import java.sql.*;
import java.util.Scanner;

public abstract class AbsController {
	Scanner ss;
	
	protected Connection conn=null;
	protected Statement stmt=null;
	protected PreparedStatement pstmt=null;
	protected ResultSet rs=null;
	protected ResultSetMetaData rsmd=null; // to deal Object class objs
	
	abstract boolean insert(Object obj) throws SQLException;
	abstract boolean delete(Object obj) throws SQLException;
	abstract boolean update(Object obj) throws SQLException;
	abstract boolean selectAll(Object obj) throws SQLException;
	
	public void operControl(Object obj) throws SQLException, ClassNotFoundException {
		Connect();
		int n=0;
		
		while(n!=5) {
			System.out.println("Choose the option you want to operate");
			System.out.println("1.insert 2.delete 3.update 4.selectAll 5.Exit");
			System.out.print(">> "); n=ss.nextInt();
			
			switch(n) {
			case 1:
				insert(obj);
				break;
			case 2:
				delete(obj);
				break;
			case 3:
				update(obj);
				break;
			case 4:
				selectAll(obj);
				break;
			case 5:
				System.out.println("Mode Finished");
				break;
			default:
				System.out.println("not-allowed number is typed. try again.");
			}
		}
		ConnectionClose();
	}
	
	public void Connect() throws ClassNotFoundException, SQLException{
		if(conn!=null) return;
		
		ss=new Scanner(System.in);
		
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("Driver Load Success");
		
		String url="jdbc:oracle:thin:@127.0.0.1:1521:XE";
		System.out.print("ID : ");String uid=ss.next();
		System.out.print("Password : ");String pwd=ss.next();
		
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
		System.out.println("Break Connection");
	}
}
