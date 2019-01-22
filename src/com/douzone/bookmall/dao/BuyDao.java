package com.douzone.bookmall.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.douzone.bookmall.vo.BuyVo;

public class BuyDao extends Dao{
	public boolean insert(BuyVo vo) {
		boolean result = false;
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = getConnection();
			
			String sql = "insert into buy values(null,?,?,?)";
			
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, vo.getDest());
			pstmt.setInt(2, vo.getTotalPrice());
			pstmt.setInt(3, vo.getMemberNo());
			
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
	
	public List<BuyVo> getList(){
		List<BuyVo> list = new ArrayList<BuyVo>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			
			String sql = "select a.no, a.dest, a.price, "
					+ "a.member_no, b.name, b.email " + 
					"from buy a, member b " + 
					"where a.member_no = b.no";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				BuyVo vo = new BuyVo();
				vo.setNo(rs.getInt(1));
				vo.setDest(rs.getString(2));
				vo.setTotalPrice(rs.getInt(3));
				vo.setMemberNo(rs.getInt(4));
				vo.setName(rs.getString(5));
				vo.setEmail(rs.getString(6));
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
