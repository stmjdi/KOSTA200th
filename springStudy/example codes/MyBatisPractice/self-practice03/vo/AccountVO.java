package com.spring.account.vo;

public class AccountVO {
	private String name;
	private int balance;
	private int recent;
	
	public AccountVO() {}
	public AccountVO(String name, int balance, int recent) {
		this.name=name;
		this.balance=balance;
		this.recent=recent;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getRecent() {
		return recent;
	}
	public void setRecent(int recent) {
		this.recent = recent;
	}
}
