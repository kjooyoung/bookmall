package com.douzone.bookmall.test;

import java.util.List;

import com.douzone.bookmall.dao.MemberDao;
import com.douzone.bookmall.vo.MemberVo;

public class MemberDaoTest {

	public static void main(String[] args) {
//		insertTest("둘리", "010-1111-1111", "k11@gmail.com", "1234");
//		insertTest("또치", "010-2222-2222", "abc33@naver.com", "1q2w3e4r");
//		insertTest("마이콜", "010-3333-3333", "mycall@nate.com", "112233");
		getListTest();
	}
	
	public static void insertTest(String name, String number,
			String email, String password) {
		MemberVo vo = new MemberVo();
		vo.setName(name);
		vo.setNumber(number);
		vo.setEmail(email);
		vo.setPassword(password);
		new MemberDao().insert(vo);
	}
	
	public static void getListTest() {
		List<MemberVo> list = new MemberDao().getList();
		for(int i=0; i<list.size(); i++) {
			String pass = "";
			for(int j=0; j<list.get(i).getPassword().length(); j++) {
				pass += "*";
			}
			list.get(i).setPassword(pass);
		}
		for(MemberVo vo : list) {
			System.out.println(vo);
		}
	}
}
