package univModels;

public class DepartModel {
	private final String ClassName="depart";
	
	private int dcode; // unique value
	private String dname;
	
	public String getClassName() {
		return ClassName;
	}
	
	public int getDcode() {
		return dcode;
	}
	public void setDcode(int dcode) {
		this.dcode = dcode;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof DepartModel) {
			DepartModel temp=(DepartModel)obj;
			return this.dcode==temp.dcode;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return dcode;
	}
}
