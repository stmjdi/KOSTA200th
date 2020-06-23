package com.spring.vo;

import org.springframework.stereotype.Component;

@Component("memberVO")
public class MemberVO {
	private String id, pwd;

	public MemberVO() {}
	public MemberVO(String id, String pwd) {
		this.id=id;
		this.pwd=pwd;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
}
