package com.douzone.bookmall.test;

import java.util.List;

import com.douzone.bookmall.dao.CategoryDao;
import com.douzone.bookmall.vo.CategoryVo;

public class CategoryDaoTest {
	public static void main(String[] args) {
//		insertTest("소설");
//		insertTest("수필");
//		insertTest("컴퓨터/IT");
//		insertTest("예술");
		getListTest();
	}
	
	public static void insertTest(String title) {
		CategoryVo vo = new CategoryVo();
		vo.setTitle(title);
		new CategoryDao().insert(vo);
	}
	
	public static void getListTest() {
		List<CategoryVo> list = new CategoryDao().getList();
		for(CategoryVo vo : list) {
			System.out.println(vo);
		}
	}
}
