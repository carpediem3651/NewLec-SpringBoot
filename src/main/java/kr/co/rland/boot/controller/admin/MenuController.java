package kr.co.rland.boot.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("adminMenuController")
@RequestMapping("/admin/menu")
public class MenuController {
	
//	@ResponseBody
	@RequestMapping("list")
	public String list() {
		return "/admin/menu/list";
	}
	
//	@ResponseBody
	@RequestMapping("detail")
	public String detail() {
		return "/admin/menu/detail";
	}
}
