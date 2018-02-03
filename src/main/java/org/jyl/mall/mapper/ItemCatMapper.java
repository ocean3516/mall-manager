package org.jyl.mall.mapper;

import org.jyl.mall.entity.ItemCat;

public interface ItemCatMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ItemCat record);

    int insertSelective(ItemCat record);

    ItemCat selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ItemCat record);

    int updateByPrimaryKey(ItemCat record);
}