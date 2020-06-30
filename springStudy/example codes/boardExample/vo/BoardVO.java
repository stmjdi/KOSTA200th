package com.spring.vo;

import org.springframework.stereotype.Component;

@Component("boardVO")
public class BoardVO {
	private String title;
	private String username;
	private String contents;
	private String joinDate;

	public BoardVO() {}
	
	public BoardVO(String title, String username) {
		this(title,username,"none");
	}
	
	public BoardVO(String title, String username, String contents) {
		this(title,username,contents,"0/0/0");
	}
	
	public BoardVO(String title, String username, String contents, String joinDate) {
		this.title=title;
		this.username=username;
		this.contents=contents;
		this.joinDate=joinDate;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof BoardVO) {
			BoardVO temp = (BoardVO) obj;
			return this.title.equals(temp.title) && this.username.equals(temp.username)
					&& this.contents.equals(temp.contents) && this.joinDate.equals(temp.joinDate);
		}
		
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return title.hashCode() + username.hashCode();
	}

	@Override
	public String toString() {
		return title + ", " + username + ", " + contents + ", " + joinDate;
	}

}
