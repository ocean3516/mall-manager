package org.jyl.mall.service.impl;

import java.util.List;

import org.jyl.mall.entity.Item;
import org.jyl.mall.mapper.ItemMapper;
import org.jyl.mall.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private ItemMapper itemMapper;

	@Override
	public List<Item> selectAllItem() {
		List<Item> itemList = itemMapper.selectAll();
		return itemList;
	}

}
