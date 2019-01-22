package com.douzone.bookmall.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.douzone.bookmall.vo.CartVo;

public class CartDao extends Dao{
	public boolean insert(CartVo vo) {
		boolean result = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = getConnection();
			
			String sql = "insert into cart values(?,?,?)";
			
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, vo.getMemberNo());
			pstmt.setInt(2, vo.getBookNo());
			pstmt.setInt(3, vo.getCount());
			
			int count = pstmt.executeUpdate();
			result = count == 1;
			
		} catch (Exception e) {
			System.out.println("error:"+e);
		} finally {
			try {
				if(pstmt != null)pstmt.close();
				if(conn != null)conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	public List<CartVo> getList(){
		List<CartVo> list = new ArrayList<CartVo>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			
			String sql = "select a.member_no, a.book_no, a.count,"
					+ "b.title, b.price"
					+ " from cart a, book b "
					+ "where a.book_no = b.no";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				CartVo vo = new CartVo();
				vo.setMemberNo(rs.getInt(1));
				vo.setBookNo(rs.getInt(2));
				vo.setCount(rs.getInt(3));
				vo.setBookTitle(rs.getString(4));
				vo.setPrice(rs.getInt(5));
				list.add(vo);
			}
			
		} catch (SQLException e) {
			System.out.println("error:"+e);
		} finally {
			try {
				if(rs != null)rs.close();
				if(pstmt != null)pstmt.close();
				if(conn != null)conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}
}
