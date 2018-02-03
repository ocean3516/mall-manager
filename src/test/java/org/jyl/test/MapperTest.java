package org.jyl.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.jyl.mall.entity.ItemCat;
import org.jyl.mall.mapper.ItemCatMapper;
import org.jyl.mall.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class MapperTest {
	@Autowired
	private ItemCatMapper itemCatMapper;
	@Autowired
	private ItemCatService itemCatService;
	@Autowired DataSourceTransactionManager transactionManager;
	@Test
	public void testMapper() {
		//	System.out.println(itemCatMapper);
		ItemCat itemCat = new ItemCat();
		itemCat.setCreated(new Date());
		itemCat.setIsDel(false);
		itemCat.setIsParent(false);
		itemCat.setLevel(1);
		itemCat.setName("商品1号");
		itemCat.setOrder(1);
		itemCat.setParentId(0);
		itemCat.setUpdated(new Date());
		itemCatMapper.insert(itemCat);
		System.out.println(itemCat.getId());
	}
	
	@Test
	public void testService() {
		ItemCat itemCat = new ItemCat();
		itemCat.setCreated(new Date());
		itemCat.setIsDel(false);
		itemCat.setIsParent(false);
		itemCat.setLevel(1);
		itemCat.setName("商品1号");
		itemCat.setOrder(1);
		itemCat.setParentId(0);
		itemCat.setUpdated(new Date());
		itemCatService.insertItemCat(itemCat);
		System.out.println(itemCat.getId());
		System.out.println(transactionManager);
	}

}
