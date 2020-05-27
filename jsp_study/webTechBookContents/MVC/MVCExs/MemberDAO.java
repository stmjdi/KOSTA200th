package sec01.ex01;

import java.sql.*;
import java.util.*;
import javax.sql.*;
import javax.naming.*;
import java.sql.Date;

public class MemberDAO {
	private DataSource dataFactory;
	private Connection conn;
	private PreparedStatement pstmt;
	
	public MemberDAO() {
		try {
			Context ctx = new InitialContext();
			Context envContext = (Context) ctx.lookup("java:/comp/env");
			dataFactory = (DataSource) envContext.lookup("jdbc:dbcpTestDB");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public List<MemberVO> listMembers(){
		List<MemberVO> memberList = new ArrayList<MemberVO>();
		try {
			conn=dataFactory.getConnection();
			String query = "select * from t_member order by joinDate desc";
			System.out.println("query");
			pstmt=conn.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String name = rs.getString("name");
				String email = rs.getString("email");
				Date joinDate = rs.getDate("joinDate");
				MemberVO memberVO = new MemberVO(id,pwd,name,email,joinDate);
				memberList.add(memberVO);
			}
			rs.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return memberList;
	}
	
	public void addMember(MemberVO m) {
		try {
			conn=dataFactory.getConnection();
			String id= m.getId();
			String pwd= m.getPwd();
			String name= m.getName();
			String email= m.getEmail();
			String query= "INSERT INTO T_MEMBER(ID,PWD,NAME,EMAIL) VALUES(?,?,?,?)";
			System.out.println(query);
			
			pstmt=conn.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			pstmt.setString(3, name);
			pstmt.setString(4, email);
			
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

