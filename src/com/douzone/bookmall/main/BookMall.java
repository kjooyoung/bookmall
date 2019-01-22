package com.douzone.bookmall.main;

import java.util.List;

import com.douzone.bookmall.dao.BookDao;
import com.douzone.bookmall.dao.BuyBookDao;
import com.douzone.bookmall.dao.BuyDao;
import com.douzone.bookmall.dao.CartDao;
import com.douzone.bookmall.dao.CategoryDao;
import com.douzone.bookmall.dao.MemberDao;
import com.douzone.bookmall.vo.BookVo;
import com.douzone.bookmall.vo.BuyBookVo;
import com.douzone.bookmall.vo.BuyVo;
import com.douzone.bookmall.vo.CartVo;
import com.douzone.bookmall.vo.CategoryVo;
import com.douzone.bookmall.vo.MemberVo;

public class BookMall {
	public static void main(String[] args) {
		
		//1. 회원리스트 - 1명
		new MemberDao().insert(new MemberVo("김주영", "010-2340-4102", "kjyoung4102@gmail.com", "1234"));
		
		System.out.println("회원정보\n");
		List<MemberVo> memberList = new MemberDao().getList();
		for(MemberVo vo : memberList) {
			System.out.println(vo);
		}
		System.out.println("==============================================================================");

		//2. 카테고리 리스트 - 카테고리 4개
		new CategoryDao().insert(new CategoryVo("소설"));
		new CategoryDao().insert(new CategoryVo("수필"));
		new CategoryDao().insert(new CategoryVo("컴퓨터/IT"));
		new CategoryDao().insert(new CategoryVo("예술"));
		
		System.out.println("카테고리 리스트\n");
		List<CategoryVo> categoryList = new CategoryDao().getList();
		for(CategoryVo vo : categoryList) {
			System.out.println(vo);
		}
		System.out.println("==============================================================================");
		
		//3. 상품 리스트 - 책(카테고리, 제목, 가격) 3개
		new BookDao().insert(new BookVo("이것이 자바다", 20000, 3));
		new BookDao().insert(new BookVo("서양 미술사", 13000, 4));
		new BookDao().insert(new BookVo("안드로이드 완전정복", 40000, 3));
		new BookDao().insert(new BookVo("아큐정전", 10000, 1));
		
		System.out.println("상품 리스트\n");
		List<BookVo> bookList = new BookDao().getList();
		for(BookVo vo : bookList) {
			System.out.println(vo);
		}
		System.out.println("==============================================================================");
		
		//4. 카트 리스트 - 카트(도서 제목, 수량, 가격) 2개
		new CartDao().insert(new CartVo(1, 2, 1));
		new CartDao().insert(new CartVo(1, 1, 2));
		
		System.out.println("카트 리스트\n");
		List<CartVo> cartList = new CartDao().getList();
		for(CartVo vo : cartList) {
			System.out.println(vo);
		}
		System.out.println("==============================================================================");
		
		//5. 주문 리스트 - 주문 (주문 번호, 주문회원(), 
		new BuyDao().insert(new BuyVo("부산 북구 구포동 구포동원로얄듀크비스타 APT",53000,1));
		
		System.out.println("주문 리스트\n");
		List<BuyVo> buyList = new BuyDao().getList();
		for(BuyVo vo : buyList) {
			System.out.println(vo);
		}
		System.out.println("==============================================================================");
		
		//6. 주문 도서 리스트 - 책 2개(구매자, 도서번호, 제목, 수량)
		new BuyBookDao().insert(new BuyBookVo(1,1));
		new BuyBookDao().insert(new BuyBookVo(2,1));
		
		System.out.println("주문 도서 리스트\n");
		List<BuyBookVo> buyBookList = new BuyBookDao().getList();
		for(BuyBookVo vo : buyBookList) {
			System.out.println(vo);
		}
		System.out.println("==============================================================================");

	}
}
