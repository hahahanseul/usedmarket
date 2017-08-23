package com.usedmarket.web.dao;

import java.util.List;
import java.util.Map;

import com.usedmarket.web.domain.ItemBean;

public interface ItemDAO {
	public String insertItem(ItemBean item);
	public ItemBean selectBySeq(String seq);
	public List<?> selectByName(String name);
	public List<?> selectAll(Object o);
	public String count();
	public String update(ItemBean item);
	public String delete(String seq);
}
