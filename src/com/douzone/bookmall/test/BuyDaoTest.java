package com.douzone.bookmall.test;

import java.util.List;

import com.douzone.bookmall.dao.BuyDao;
import com.douzone.bookmall.vo.BuyVo;

public class BuyDaoTest {
	public static void main(String[] args) {
//		insertTest("부산시 북구 구포동 구포동원로얄듀크",53000,1);
		getListTest();
	}
	
	public static void insertTest(String dest, int price, int memberNo) {
		BuyVo vo = new BuyVo();
		vo.setDest(dest);
		vo.setTotalPrice(price);
		vo.setMemberNo(memberNo);
		new BuyDao().insert(vo);
	}
	
	public static void getListTest() {
		List<BuyVo> list = new BuyDao().getList();
		for(BuyVo vo : list) {
			System.out.println(vo);
		}
	}
}
