package com.usedmarket.web.service;

import java.util.List;
import java.util.Map;
import com.usedmarket.web.domain.ItemBean;

public interface ItemService {
	public String addItem(ItemBean item);
	public List<ItemBean> getList(String[] rows);
	public List<ItemBean> findByName(String name);
	public ItemBean findBySeq(String seq);
	public String countItems();
	public String modify(ItemBean item);
	public String remove(String seq);
}