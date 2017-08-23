package com.usedmarket.web.service;

import java.util.List;
import com.usedmarket.web.dao.ItemDAOImpl;
import com.usedmarket.web.domain.ItemBean;

public class ItemServiceImpl implements ItemService {
	public static ItemServiceImpl getInstance() {return new ItemServiceImpl();}
	private ItemServiceImpl() {}

	@Override
	public String addItem(ItemBean item) {
		return ItemDAOImpl.getInstance().insertItem(item);
	}

	@Override
	public ItemBean findBySeq(String seq) {
		return ItemDAOImpl.getInstance().selectBySeq(seq);
	}

	@Override
	public List<?> findByName(String name) {
		return ItemDAOImpl.getInstance().selectByName(name);
	}

	@Override
	public List<?> getList(Object o) {
		return null;
	}

	@Override
	public String countItems() {
		return ItemDAOImpl.getInstance().count();
	}

	@Override
	public String modify(ItemBean item) {
		return null;
	}

	@Override
	public String remove(String seq) {
		return null;
	}

}
