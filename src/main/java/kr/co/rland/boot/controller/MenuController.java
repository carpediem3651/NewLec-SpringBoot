package kr.co.rland.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.rland.boot.entity.Menu;
import kr.co.rland.boot.entity.MenuView;
import kr.co.rland.boot.service.MenuService;

@Controller
@RequestMapping("/menu")
public class MenuController {
	
	@Autowired
	private MenuService service;
	
//	@ResponseBody
	@RequestMapping("list")
	public String list(Model model) {
		
//		List<Menu> list = service.getList();
		List<MenuView> list = service.getViewList();
		System.out.println(list);
		model.addAttribute("list", list);
//		model.addAttribute("list", service.getList());
		return "menu/list";
	}
	
//	@ResponseBody
	@RequestMapping("detail")
	public String detail(Model model, long id) {
		
		Menu menu = service.getById(id);
		model.addAttribute("menu", menu);
		return "menu/detail";
	}
}
