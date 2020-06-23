package com.spring.vo;

import org.springframework.stereotype.Component;

@Component("giftVO")
public class GiftVO {
	private int gno;
	private String gname;
	private int g_start;
	private int g_end;
	
	public GiftVO() {}
	
	public GiftVO(int gno, String gname, int g_start, int g_end) {
		this.gno=gno;
		this.gname=gname;
		this.g_start=g_start;
		this.g_end=g_end;
	}
	
	public int getGno() {
		return gno;
	}
	public void setGno(int gno) {
		this.gno = gno;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public int getG_start() {
		return g_start;
	}
	public void setG_start(int g_start) {
		this.g_start = g_start;
	}
	public int getG_end() {
		return g_end;
	}
	public void setG_end(int g_end) {
		this.g_end = g_end;
	}
	
}
