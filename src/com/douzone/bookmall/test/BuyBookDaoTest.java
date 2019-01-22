package com.douzone.bookmall.test;

import java.util.List;

import com.douzone.bookmall.dao.BuyBookDao;
import com.douzone.bookmall.vo.BuyBookVo;

public class BuyBookDaoTest {
	public static void main(String[] args) {
//		insertTest(1,1);
//		insertTest(2,1);
		getListTest();
	}
	
	public static void insertTest(int bookNo, int buyNo) {
		BuyBookVo vo = new BuyBookVo();
		vo.setBookNo(bookNo);
		vo.setBuyNo(buyNo);
		new BuyBookDao().insert(vo);
	}
	
	public static void getListTest() {
		List<BuyBookVo> list = new BuyBookDao().getList();
		for(BuyBookVo vo : list) {
			System.out.println(vo);
		}
	}
}
