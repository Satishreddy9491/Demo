package com.javaExpress.functions;

public class Bank {
	String name;
	int accNo;
	
	

	public String getName() {
		return name;
	}
	public int getAccNo() {
		return accNo;
	}

	public Bank(String name, int accNo) {
		super();
		this.name = name;
		this.accNo = accNo;
		
	}
	
	@Override
	public String toString() {
		return "Bank [name=" + name + ", accNo=" + accNo + "]";
	}
	
}
