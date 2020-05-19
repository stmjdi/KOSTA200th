package com.kosta.visitors;

public class BookVO {
	private int num;
	private String name;
	private String email;
	private String home;
	private String contents;
	
	public BookVO() {
		
	}
	
	public BookVO(String[] strs) { // strs.length==5
		this.num=Integer.parseInt(strs[0]);
		this.name=strs[1];
		this.email=strs[2];
		this.home=strs[3];
		contents=strs[4];
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}

	@Override
	public String toString() {
		return num+"|"+name+"|"+email+"|"+home+"|"+contents;
	}
}
