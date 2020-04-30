This is a example about simple MVC pattern & how to use database in java code


< Dept View >
-------------

<pre>
<code>

import ex04.mvc.controller.DeptController;

public class DeptView {
	public static void main(String[] args) {
		DeptController empc = new DeptController();
		
		try {
			empc.menu();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

</code>
</pre>
----------------------------------

< Dept Model >
---------------------------

<pre>
<code>

public class DeptModel { // Model
	private final String ClassName="dept2";
	
	private String dcode,dname,pdept,area;

	public String getClassName() {
		return ClassName;
	}

	public String getPdept() {
		return pdept;
	}

	public void setPdept(String pdept) {
		this.pdept = pdept;
	}

	public String getDcode() {
		return dcode;
	}

	public void setDcode(String dcode) {
		this.dcode = dcode;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
}

</code>
</pre>
---------------------------------

< Dept Controller >
-------------------------------
<pre>
<code>


import java.sql.*;
import java.util.Scanner;

import ex04.mvc.model.DeptModel;

public class DeptController {
	static Scanner sc = new Scanner(System.in);
	
	private Connection conn=null;
	private PreparedStatement pstmt=null;
	private ResultSet rs=null;

	public void connect() throws SQLException, ClassNotFoundException{
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("Driver Load Success");
		
		String url="jdbc:oracle:thin:@127.0.0.1:1521:XE";
		System.out.print("uid : ");
		String uid = sc.next();
		System.out.print("password : ");
		String pwd=sc.next();
		
		conn=DriverManager.getConnection(url,uid,pwd);
		System.out.println("Connection Success");
	}
	
	public void close() throws SQLException{
		if(rs!=null) rs.close();
		if(pstmt!=null) pstmt.close();
	}
	
	public void select(String tname) throws SQLException{
		pstmt=conn.prepareStatement("select * from "+tname);
		
		rs=pstmt.executeQuery();
		while(rs.next()) {
			for(int i=1;i<5;i++) System.out.print(rs.getString(i)+"\t");
			System.out.println();
		}
	}
	
	public void insert(String tname) throws SQLException{
		pstmt=conn.prepareStatement("insert into "+tname+" values(?,?,?,?)");
		String[] str = new String[4];
		
		System.out.print("dcode : "); str[0]=sc.next();
		System.out.print("dname : "); str[1]=sc.next();
		System.out.print("pdept : "); str[2]=sc.next();
		System.out.print("area : "); str[3]=sc.next();
		
		for(int i=1;i<5;i++) pstmt.setString(i, str[i-1]);
		
		int result = pstmt.executeUpdate();
		
		System.out.println(result + result>1?" record":"records" + " inserted");
	}
	
	public void delete(String tname) throws SQLException{
		pstmt=conn.prepareStatement("delete from "+tname+" where dcode=?");
		
		System.out.print("dcode : "); String dcode=sc.next();
		pstmt.setString(1, dcode);
		
		int result = pstmt.executeUpdate();
		System.out.println(result + result>1?" record":"records" + " deleted");
	}
	
	public void update(String tname) throws SQLException{
		pstmt=conn.prepareStatement("update "+tname+" set dname=? where dcode=?");
		System.out.print("to What : "); String dname=sc.next();
		System.out.print("from Where : "); String dcode=sc.next();
		
		pstmt.setString(1, dname);
		pstmt.setString(2, dcode);
		
		int result = pstmt.executeUpdate();
		
		System.out.println(result + result>1?" record":"records" + " updated");
	}
	
	public void menu() throws Exception{
		DeptModel emp = new DeptModel();
		connect();
		
		while(true) {
			System.out.println("choose the option");
			System.out.println("1.select 2.insert 3.delete 4.update 5.exit");
			
			int n=sc.nextInt();
			switch(n) {
			case 1:
				select(emp.getClassName());
				break;
			case 2:
				insert(emp.getClassName());
				break;
			case 3:
				delete(emp.getClassName());
				break;
			case 4:
				update(emp.getClassName());
				break;
			case 5:
				System.out.println("Program Exit.");
				close();
				System.exit(0);
				break;
			default: System.out.println("type again");
			}
			close();
			if(n==5) break;
		}
		conn.close();
	}
	
}

</code>
</pre>
