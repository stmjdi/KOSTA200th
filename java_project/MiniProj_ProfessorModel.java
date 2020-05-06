package univModels;

public class ProfessorModel {
	private final String ClassName="professor";
	
	private int mcode,profno,pay;
	private String name, pos;
	
	public int getMcode() {
		return mcode;
	}
	public void setMcode(int mcode) {
		this.mcode = mcode;
	}
	public int getProfno() {
		return profno;
	}
	public void setProfno(int profno) {
		this.profno = profno;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPos() {
		return pos;
	}
	public void setPos(String pos) {
		this.pos = pos;
	}
	public String getClassname() {
		return ClassName;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ProfessorModel) {
			ProfessorModel temp=(ProfessorModel)obj;
			return this.profno==temp.profno;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return profno;
	}
	
	
}
