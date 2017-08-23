package com.usedmarket.web.service;

import java.util.List;
import java.util.Map;
import com.usedmarket.web.domain.ItemBean;

public interface ItemService {
	public String addItem(ItemBean item);
	public ItemBean findBySeq(String seq);
	public List<?> findByName(String name);
	public List<?> getList(Object o);
	public String countItems();
	public String modify(ItemBean item);
	public String remove(String seq);
}