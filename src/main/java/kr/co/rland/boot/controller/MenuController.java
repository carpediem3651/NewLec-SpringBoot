package kr.co.rland.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/menu")
public class MenuController {
	
//	@ResponseBody
	@RequestMapping("list")
	public String list(Model model) {
		
		model.addAttribute("test", "Hello");
		
		return "menu/list";
	}
	
//	@ResponseBody
	@RequestMapping("detail")
	public String detail() {
		return "menu/detail";
	}
}
