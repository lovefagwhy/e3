package com.e3.shop.service;


import com.e3.shop.common.DataGridResult;
import com.e3.shop.pojo.TbItem;

public interface ItemService {

	DataGridResult getList(int page, int rows);


}
