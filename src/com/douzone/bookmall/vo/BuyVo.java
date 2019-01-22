package com.douzone.bookmall.vo;

public class BuyVo {
	private int no;
	private String dest;
	private int totalPrice;
	private int memberNo;
	private String name;
	private String email;
	
	public BuyVo() {}

	public BuyVo(String dest, int totalPrice, int memberNo) {
		super();
		this.dest = dest;
		this.totalPrice = totalPrice;
		this.memberNo = memberNo;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
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

	@Override
	public String toString() {
		return no+". "+name+"/"+email+", "+ totalPrice+", "+dest;
	}

}
