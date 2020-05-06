package univModels;

public class EmpModel { // extends DepartModel, it only relate a variable 'dcode' ('dname' is followed by 'dcode')
	private String ClassName = "empl";
	
	private int ecode, pay;
	private String ename,emp_type,pos,tel;
	
	public String getClassName() {
		return ClassName;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof EmpModel) {
			EmpModel temp = (EmpModel)obj;
			return this.ecode==temp.getEcode();
		}
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public int hashCode() {
		return ecode;
	}
	public void setClassName(String className) {
		ClassName = className;
	}
	public int getEcode() {
		return ecode;
	}
	public void setEcode(int ecode) {
		this.ecode = ecode;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEmp_type() {
		return emp_type;
	}
	public void setEmp_type(String emp_type) {
		this.emp_type = emp_type;
	}
	public String getPos() {
		return pos;
	}
	public void setPos(String pos) {
		this.pos = pos;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
}
