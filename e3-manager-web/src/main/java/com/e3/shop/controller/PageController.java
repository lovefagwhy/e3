package com.e3.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.e3.shop.pojo.TbItem;

@Controller
public class PageController {
//	@Autowired
//	private ItemService itemService;
	@RequestMapping("/")
	public String toIndex(){
		return "index";
	}
	@RequestMapping("/item-list")
	public String toItem(){
		return "item-list";
	}
}
