package com.usedmarket.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.usedmarket.web.constants.DB;
import com.usedmarket.web.constants.SQL;
import com.usedmarket.web.domain.ItemBean;

public class ItemDAOImpl implements ItemDAO {
	public static ItemDAOImpl getInstance() {return new ItemDAOImpl();}
	private ItemDAOImpl() {
		try {
			Class.forName(DB.ORACLE_DRIVER);
		} catch (Exception e) {
			System.out.println("DRIVER LOAD FAIL....");
			e.printStackTrace();
		}
	}

	@Override
	public String insertItem(ItemBean item) {
		String result="";
		try {
			PreparedStatement pstmt=DriverManager.getConnection(DB.ORACLE_URL,DB.USERNAME,DB.USERPASS).prepareStatement(SQL.ITEM_INSERT);
			pstmt.setString(1,item.getTitle());
			pstmt.setString(2,item.getWriter());
			pstmt.setString(3,item.getContent());		
			result = String.valueOf(pstmt.executeUpdate());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public ItemBean selectBySeq(String seq) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> selectByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> selectAll(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String count() {
		String result="";
		try {
			ResultSet rs = DriverManager.getConnection(DB.ORACLE_URL,DB.USERNAME,DB.USERPASS).prepareStatement(SQL.ITEM_COUNT).executeQuery();
			if(rs.next()) {
				result=rs.getString("count");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("dao아이템수" +result);
		return result;
	}

	@Override
	public String update(ItemBean item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete(String seq) {
		// TODO Auto-generated method stub
		return null;
	}

}
