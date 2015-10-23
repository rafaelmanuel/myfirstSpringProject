package com.wear.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wear.library.Item;
import com.wear.library.*;


@Controller
@RequestMapping("/")
public class RafaelController {

	private Item item1;
	
	@RequestMapping(method = RequestMethod.GET)
	public String displayMethod(ModelMap model , HttpServletRequest request){
		item1 = new Item("11" , "raf" , "blaghlagkalg" , 1 , 2.2 , 2.2);
		model.addAttribute("item", item1);
		return "hello";
	}
	
	@RequestMapping(value = "/helloAgain" , method = RequestMethod.GET)
	public String displayMethodAgain(ModelMap model){
		model.addAttribute("greeting", "helloworld");
		return "hello";
	}

}
