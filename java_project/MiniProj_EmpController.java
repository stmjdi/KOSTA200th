package univController;

import univModels.DepartModel;
import univModels.EmpModel;
import java.sql.*;
import java.util.Scanner;

/*
 * This Controller is made strictly based on Object Type except 'update' method.
 * Needed informations should be typed on View object.
*/

public class EmpController extends AbsController {
	Scanner se = new Scanner(System.in);
	@Override
	public boolean insert(Object obj) throws SQLException {
		if (obj instanceof DepartModel) {
			DepartModel dm = (DepartModel) obj;
			pstmt = conn.prepareStatement("insert into " + dm.getClassName() + " values(?,?)");
			System.out.print("dcode : "); pstmt.setInt(1, se.nextInt());
			System.out.print("dname : "); pstmt.setString(2, se.next());
			int result = pstmt.executeUpdate();
			System.out.println(result + (result <2 ? " record" : " records") + " inserted");
		} else if (obj instanceof EmpModel) { // or Overloading?
			EmpModel dm = (EmpModel) obj;
			pstmt = conn.prepareStatement("insert into " + dm.getClassName() + " values(?,?,?,?,?,?,?)");
			System.out.print("dcode : "); pstmt.setInt(1, se.nextInt());
			System.out.print("ecode : "); pstmt.setInt(2, se.nextInt());
			System.out.print("ename : "); pstmt.setString(3, se.next());
			System.out.print("emp_type : "); pstmt.setString(4, se.next());
			System.out.print("Position : "); pstmt.setString(5, se.next());
			System.out.print("Tel : "); pstmt.setString(6, se.next());
			System.out.print("Pay : "); pstmt.setInt(7, se.nextInt());

			int result = pstmt.executeUpdate();
			System.out.println(result + (result < 2 ? " record" : " records") + " inserted");
		} else {
			System.out.println("Wrong type of Object. this method get only 'DepartModel' or 'EmpModel'.");
			return false;
		}
		Close();
		return true;
	}

	@Override
	public boolean delete(Object obj) throws SQLException { // remove based on dcode or ecode
		if (obj instanceof DepartModel) {
			DepartModel dm = (DepartModel) obj;

			pstmt = conn.prepareStatement("delete from " + dm.getClassName() + " where dcode=?");
			System.out.print("what item(dcode) you want to delete : "); pstmt.setInt(1, se.nextInt()); // should set value on object and apply this method
			int result = pstmt.executeUpdate();
			System.out.println(result + (result < 2 ? " record" : " records") + " deleted");
		} else if (obj instanceof EmpModel) {
			EmpModel dm = (EmpModel) obj;
			pstmt = conn.prepareStatement("delete from " + dm.getClassName() + " where ecode=?");
			System.out.print("what item(ecode) you want to delete : "); pstmt.setInt(1, se.nextInt());

			int result = pstmt.executeUpdate();
			System.out.println(result + (result < 2 ? " record" : " records") + " deleted");
		} else {
			System.out.println("Wrong type of Object. this method get only 'DepartModel' or 'EmpModel'.");
			return false;
		}
		Close();
		return true;
	}

	@Override
	public boolean update(Object obj) throws SQLException {
		if (obj instanceof DepartModel) {
			DepartModel dm = (DepartModel) obj;
			pstmt = conn.prepareStatement("update " + dm.getClassName() + " set dname=? where dcode=?");
			System.out.print("dname to change : "); pstmt.setString(1, se.next());
			System.out.print("what item(dcode) you want to update : "); pstmt.setInt(2, se.nextInt());
			int result = pstmt.executeUpdate();
			System.out.println(result + (result < 2 ? " record" : " records") + " updated");
		} else if (obj instanceof EmpModel) { // need to fix in this part
			EmpModel dm = (EmpModel) obj;
			pstmt = conn.prepareStatement("update " + dm.getClassName() + " set pay=? where ecode=?");
			System.out.print("Pay to change : "); pstmt.setInt(1, se.nextInt());
			System.out.print("what item(ecode) you want to update : "); pstmt.setInt(2, se.nextInt());

			int result = pstmt.executeUpdate();
			System.out.println(result + (result < 2 ? " record" : " records") + " updated");
		} else {
			System.out.println("Wrong type of Object. this method get only 'DepartModel' or 'EmpModel'.");
			return false;
		}
		Close();
		return true;
	}

	@Override
	public boolean selectAll(Object obj) throws SQLException {
		int sz = 0;

		if (obj instanceof DepartModel) {
			DepartModel dm = (DepartModel) obj;
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from " + dm.getClassName());
			rsmd = rs.getMetaData();
			sz = rsmd.getColumnCount();

			for (int i = 1; i <= sz; i++)
				System.out.print(rsmd.getColumnName(i) + "\t");
			System.out.println();
			
			while (rs.next()) {
				for (int i = 1; i <= sz; i++) {
					System.out.print(rs.getString(i) + "\t");
				}
				System.out.println();
			}
			System.out.println();
		} else if (obj instanceof EmpModel) {
			EmpModel em = (EmpModel) obj;
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from " + em.getClassName());
			rsmd = rs.getMetaData();
			sz = rsmd.getColumnCount();

			for (int i = 1; i <= sz; i++)
				System.out.print(rsmd.getColumnName(i) + "\t");
			System.out.println();
			while (rs.next()) {
				for (int i = 1; i <= sz; i++)
					System.out.print(rs.getString(i) + "\t");
				System.out.println();
			}
			System.out.println();
		}

		else {
			System.out.println("Wrong type of Object. this method get only 'DepartModel' or 'EmpModel'.");
			return false;
		}

		Close();
		return true;
	}

}
