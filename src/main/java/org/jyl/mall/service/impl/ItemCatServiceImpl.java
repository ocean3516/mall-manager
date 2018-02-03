package org.jyl.mall.service.impl;

import org.jyl.mall.entity.ItemCat;
import org.jyl.mall.mapper.ItemCatMapper;
import org.jyl.mall.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ItemCatServiceImpl implements ItemCatService {
	@Autowired
	private ItemCatMapper itemCatMapper;
	@Override
	public void insertItemCat(ItemCat itemCat) {
		// TODO Auto-generated method stub
		itemCatMapper.insert(itemCat);
		int i =1/0;
		
		

	}

}
