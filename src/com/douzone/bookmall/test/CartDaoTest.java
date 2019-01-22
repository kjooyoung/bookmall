package com.douzone.bookmall.test;

import java.util.List;

import com.douzone.bookmall.dao.CartDao;
import com.douzone.bookmall.vo.CartVo;

public class CartDaoTest {
	public static void main(String[] args) {
//		insertTest(1, 2, 1);
//		insertTest(1, 1, 2);
		getListTest();
	}
	
	public static void insertTest(int memberNo, int bookNo, int count) {
		CartVo vo = new CartVo();
		vo.setMemberNo(memberNo);
		vo.setBookNo(bookNo);
		vo.setCount(count);
		new CartDao().insert(vo);
	}
	
	public static void getListTest() {
		List<CartVo> list = new CartDao().getList();
		for(CartVo vo : list) {
			System.out.println(vo);
		}
	}
}
