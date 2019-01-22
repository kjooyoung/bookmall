package com.douzone.bookmall.vo;

public class BookVo {
	private int no;
	private String title;
	private int price;
	private int categoryNo;
	private String categoryTitle;
	
	public BookVo() {}

	public BookVo(String title, int price, int categoryNo) {
		super();
		this.title = title;
		this.price = price;
		this.categoryNo = categoryNo;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCategoryNo() {
		return categoryNo;
	}

	public void setCategoryNo(int categoryNo) {
		this.categoryNo = categoryNo;
	}

	public String getCategoryTitle() {
		return categoryTitle;
	}

	public void setCategoryTitle(String categoryTitle) {
		this.categoryTitle = categoryTitle;
	}

	@Override
	public String toString() {
		return no+". "+title+", "+categoryTitle+", "+price;
	}

}
