package com.douzone.bookmall.vo;

public class CategoryVo {
	private int no;
	private String title;
	
	public CategoryVo() {}

	public CategoryVo(String title) {
		super();
		this.title = title;
	}

	public long getNo() {
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

	@Override
	public String toString() {
		return no+". "+title;
	}
	
}
