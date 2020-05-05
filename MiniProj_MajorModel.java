package univModels;

public class MajorModel {
	private final String ClassName = "major";

	private int mcode;
	private String mname;

	public String getClassname() {
		return ClassName;
	}

	public int getMcode() {
		return mcode;
	}

	public void setMcode(int mcode) {
		this.mcode = mcode;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MajorModel) {
			MajorModel temp = (MajorModel) obj;
			return this.mcode == temp.mcode;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return mcode;
	}

}
