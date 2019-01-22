package com.douzone.bookmall.vo;

public class BuyBookVo {
	private int bookNo;
	private int buyNo;
	private String bookTitle;
	private int count;
	
	public BuyBookVo() {}

	public BuyBookVo(int bookNo, int buyNo) {
		super();
		this.bookNo = bookNo;
		this.buyNo = buyNo;
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public int getBuyNo() {
		return buyNo;
	}

	public void setBuyNo(int buyNo) {
		this.buyNo = buyNo;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return bookNo+". "+bookTitle+", "+count;
	}

}
