package univModels;

public class StudentModel {
	private final String ClassName="student";
	
	private int mcode, studno,grade,profno;
	private String name, tel;
	
	public int getMcode() {
		return mcode;
	}
	public void setMcode(int mcode) {
		this.mcode = mcode;
	}
	public int getStudno() {
		return studno;
	}
	public void setStudno(int studno) {
		this.studno = studno;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getProfno() {
		return profno;
	}
	public void setProfno(int profno) {
		this.profno = profno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getClassname() {
		return ClassName;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof StudentModel) {
			StudentModel temp = (StudentModel)obj;
			return this.studno==temp.studno;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return studno;
	}
	
	
}
