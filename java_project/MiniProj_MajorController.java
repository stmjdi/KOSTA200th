package univController;

import java.sql.SQLException;
import univModels.MajorModel;
import univModels.ProfessorModel;
import univModels.StudentModel;
import java.util.Scanner;

public class MajorController extends AbsController{
	Scanner se = new Scanner(System.in);

	@Override
	boolean insert(Object obj) throws SQLException {
		if(obj instanceof MajorModel) {
			MajorModel mm = (MajorModel)obj;
			pstmt=conn.prepareStatement("insert into "+mm.getClassname()+" values(?,?)");
			
			System.out.print("mcode : "); pstmt.setInt(1, se.nextInt());
			System.out.print("mname : "); pstmt.setString(2, se.next());
			
			int result = pstmt.executeUpdate();
			System.out.println(result+(result<2?" record": " records") + " inserted");
		}
		else if(obj instanceof ProfessorModel) {
			ProfessorModel mm = (ProfessorModel)obj;
			pstmt=conn.prepareStatement("insert into "+mm.getClassname()+" values(?,?,?,?,?)");
			
			System.out.print("mcode : "); pstmt.setInt(1, se.nextInt());
			System.out.print("profno : "); pstmt.setInt(2, se.nextInt());
			System.out.print("name : "); pstmt.setString(3, se.next());
			System.out.print("Position : "); pstmt.setString(4, se.next());
			System.out.print("pay : "); pstmt.setInt(5, se.nextInt());
			
			int result = pstmt.executeUpdate();
			System.out.println(result+(result<2?" record": " records") + " inserted");
		}
		else if(obj instanceof StudentModel) {
			StudentModel mm = (StudentModel)obj;
			pstmt=conn.prepareStatement("insert into "+mm.getClassname()+" values(?,?,?,?,?,?)");
			
			System.out.print("mcode : "); pstmt.setInt(1, se.nextInt());
			System.out.print("studno : "); pstmt.setInt(2, se.nextInt());
			System.out.print("name : "); pstmt.setString(3, se.next());
			System.out.print("grade : "); pstmt.setInt(4, se.nextInt());
			System.out.print("tel : "); pstmt.setString(5, se.next());
			System.out.print("profno : "); pstmt.setInt(6, se.nextInt());
			
			int result = pstmt.executeUpdate();
			System.out.println(result+(result<2?" record": " records") + " inserted");
		}
		
		else {
			System.out.println("Wrong type of Object. it only get type 'StudentModel',"
					+ "'ProfessorModel','MajorModel");
			return false;
		}
		Close();
		return true;
	}

	@Override
	boolean delete(Object obj) throws SQLException {
		if(obj instanceof MajorModel) {
			MajorModel mm = (MajorModel)obj;
			pstmt=conn.prepareStatement("delete from "+mm.getClassname()+" where mcode=?");
			
			System.out.print("what item(mcode) you want to delete : "); pstmt.setInt(1, se.nextInt());
			int result = pstmt.executeUpdate();
			System.out.println(result + (result<2?" record":" records")+" deleted");
		}
		else if(obj instanceof ProfessorModel) {
			ProfessorModel mm = (ProfessorModel)obj;
			pstmt=conn.prepareStatement("delete from "+mm.getClassname()+" where profno=?");
			
			System.out.print("what item(profno) you want to delete : "); pstmt.setInt(1, se.nextInt());
			int result = pstmt.executeUpdate();
			System.out.println(result + (result>1?" records":" record")+" deleted");
		}
		else if(obj instanceof StudentModel) {
			StudentModel mm = (StudentModel)obj;
			pstmt=conn.prepareStatement("delete from "+mm.getClassname()+" where studno=?");
			
			System.out.print("what item(studno) you want to delete : "); pstmt.setInt(1, se.nextInt());
			int result = pstmt.executeUpdate();
			System.out.println(result + (result<2?" record":" records")+" deleted");
		}
		else {
			System.out.println("Wrong type of Object. it only get type 'StudentModel',"
					+ "'ProfessorModel','MajorModel");
			return false;
		}
		
		Close();
		return true;
	}

	@Override
	boolean update(Object obj) throws SQLException { // based on each unique code
		if(obj instanceof MajorModel) {
			MajorModel mm=(MajorModel)obj;
			pstmt=conn.prepareStatement("update "+mm.getClassname()+" set mname=? where mcode=?");
			
			System.out.print("mname to change : "); pstmt.setString(1, se.next());
			System.out.print("what item(mcode) you want to delete : "); pstmt.setInt(1, se.nextInt());
			
			int result = pstmt.executeUpdate();
			System.out.println(result+(result<2?" record":" records")+" updated");
		}
		else if(obj instanceof ProfessorModel) {
			ProfessorModel mm=(ProfessorModel)obj;
			pstmt=conn.prepareStatement("update "+mm.getClassname()+" set pay=? where profno=?");
			
			System.out.print("pay to change : "); pstmt.setInt(1, se.nextInt());
			System.out.print("what item(profno) you want to delete : "); pstmt.setInt(1, se.nextInt());
			
			int result = pstmt.executeUpdate();
			System.out.println(result+(result<2?" record":" records")+" updated");
		}
		else if(obj instanceof StudentModel) {
			StudentModel mm=(StudentModel)obj;
			pstmt=conn.prepareStatement("update "+mm.getClassname()+" set grade=? where studno=?");
			
			System.out.print("grade to change : "); pstmt.setInt(1, se.nextInt());
			System.out.print("what item(studno) you want to delete : "); pstmt.setInt(1, se.nextInt());
			
			int result = pstmt.executeUpdate();
			System.out.println(result+(result<2?" record":" records")+" updated");
		}
		else {
			System.out.println("Wrong type of Object. it only get type 'StudentModel',"
					+ "'ProfessorModel','MajorModel");
			return false;
		}
		
		Close();
		return true;
	}

	@Override
	boolean selectAll(Object obj) throws SQLException {
		int sz=0;
		
		if(obj instanceof MajorModel) {
			MajorModel mm=(MajorModel)obj;
			stmt=conn.createStatement();
			rs=stmt.executeQuery("select * from "+mm.getClassname());
			rsmd=rs.getMetaData();sz=rsmd.getColumnCount();
			for(int i=1;i<=sz;i++) System.out.print(rsmd.getColumnName(i)+"\t");
			System.out.println();
			
			while(rs.next()) {
				for(int i=1;i<=sz;i++) System.out.print(rs.getString(i)+"\t");
				System.out.println();
			}
			System.out.println();
		}
		else if(obj instanceof ProfessorModel) {
			ProfessorModel mm=(ProfessorModel)obj;
			stmt=conn.createStatement();
			rs=stmt.executeQuery("select * from "+mm.getClassname());
			rsmd=rs.getMetaData();sz=rsmd.getColumnCount();
			for(int i=1;i<=sz;i++) System.out.print(rsmd.getColumnName(i)+"\t");
			System.out.println();
			
			while(rs.next()) {
				for(int i=1;i<=sz;i++) System.out.print(rs.getString(i)+"\t");
				System.out.println();
			}
			System.out.println();
		}
		if(obj instanceof StudentModel) {
			StudentModel mm=(StudentModel)obj;
			stmt=conn.createStatement();
			rs=stmt.executeQuery("select * from "+mm.getClassname());
			rsmd=rs.getMetaData();sz=rsmd.getColumnCount();
			for(int i=1;i<=sz;i++) System.out.print(rsmd.getColumnName(i)+"\t");
			System.out.println();
			
			while(rs.next()) {
				for(int i=1;i<=sz;i++) System.out.print(rs.getString(i)+"\t");
				System.out.println();
			}
			System.out.println();
		}
		
		Close();
		return true;
	}
	
}
