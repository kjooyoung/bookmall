package com.douzone.bookmall.vo;

public class MemberVo {
	private int no;
	private String name;
	private String number;
	private String email;
	private String password;
	
	public MemberVo() {}

	public MemberVo(String name, String number, String email, String password) {
		super();
		this.name = name;
		this.number = number;
		this.email = email;
		this.password = password;
	}

	public long getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		String str = "";
		for(int i=0; i<password.length(); i++) {
			str += "*";
		}
		this.password = str;
	}

	@Override
	public String toString() {
		return no+". "+name+", "+number+", "+email+", "+password;
	}
	
}
