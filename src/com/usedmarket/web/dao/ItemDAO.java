package com.usedmarket.web.dao;

import java.util.List;
import java.util.Map;

import com.usedmarket.web.domain.ItemBean;

public interface ItemDAO {
	public String insertItem(ItemBean item);
	public List<ItemBean> selectAll(String[] rows);
	public List<ItemBean> selectByName(String name);
	public ItemBean selectBySeq(String seq);
	public String count();
	public String update(ItemBean item);
	public String delete(String seq);
}
