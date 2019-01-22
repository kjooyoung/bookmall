package com.douzone.bookmall.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.douzone.bookmall.vo.BuyBookVo;

public class BuyBookDao extends Dao{
	public boolean insert(BuyBookVo vo) {
		boolean result = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = getConnection();
			
			String sql = "insert into buybook values(?,?)";
			
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, vo.getBookNo());
			pstmt.setInt(2, vo.getBuyNo());
			
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
	
	public List<BuyBookVo> getList(){
		List<BuyBookVo> list = new ArrayList<BuyBookVo>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			
			String sql = "select a.book_no, a.buy_no, c.title, d.count " + 
					"from buybook a, book c, cart d " + 
					"where a.book_no = c.no " + 
					"and c.no = d.book_no";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				BuyBookVo vo = new BuyBookVo();
				vo.setBookNo(rs.getInt(1));
				vo.setBuyNo(rs.getInt(2));
				vo.setBookTitle(rs.getString(3));
				vo.setCount(rs.getInt(4));
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
