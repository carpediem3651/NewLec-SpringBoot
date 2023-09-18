package kr.co.rland.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/menu")
public class MenuController {
	
//	@ResponseBody
	@RequestMapping("list")
	public String list() {
		return "menu list!!!";
	}
	
//	@ResponseBody
	@RequestMapping("detail")
	public String detail() {
		return "menu datail";
	}
}
