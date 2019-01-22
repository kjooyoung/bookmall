package com.douzone.bookmall.vo;

public class CartVo {
	private int memberNo;
	private int bookNo;
	private int count;
	private String bookTitle;
	private int price;
	
	public CartVo() {}

	public CartVo(int memberNo, int bookNo, int count) {
		super();
		this.memberNo = memberNo;
		this.bookNo = bookNo;
		this.count = count;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return bookNo+". "+bookTitle+", "+count+", "+price;
	}

	
}
