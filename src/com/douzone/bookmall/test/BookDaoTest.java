package com.douzone.bookmall.test;

import java.util.List;

import com.douzone.bookmall.dao.BookDao;
import com.douzone.bookmall.vo.BookVo;

public class BookDaoTest {
	public static void main(String[] args) {
//		insertTest("이것이 자바다", 20000, 3);
//		insertTest("서양 미술사", 13000, 4);
//		insertTest("안드로이드 완전정복", 40000, 3);
//		insertTest("아큐정전", 10000, 1);
		getListTest();
	}
	
	public static void insertTest(String title, int price, int categoryNo) {
		BookVo vo = new BookVo();
		vo.setTitle(title);
		vo.setPrice(price);
		vo.setCategoryNo(categoryNo);
		new BookDao().insert(vo);
	}
	
	public static void getListTest() {
		List<BookVo> list = new BookDao().getList();
		for(BookVo vo : list) {
			System.out.println(vo);
		}
	}
}
