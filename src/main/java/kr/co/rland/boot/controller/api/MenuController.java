package kr.co.rland.boot.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kr.co.rland.boot.entity.Menu;
import kr.co.rland.boot.service.MenuService;

@RestController("apiMenuController")
@RequestMapping("/api/menus")
public class MenuController {
	
	@Autowired
	private MenuService service;
	
	
//	@ResponseBody
	@GetMapping
	public List<Menu> list() {
		
		List<Menu> list = service.getList();
		return list;
	}
	
	// 16번 메뉴를 제공하는 API
	// @GetMapping("{id}/kor-name/{name]") 
	// /api/menus/{id}/korname/{name}
	@GetMapping("{id}")
	public Menu detail(
			@PathVariable long id
			// , @PathVariable String name
			) {
		Menu menu = service.getById(16L);
		
		return menu;
	}
	
	// 메뉴를 등록하는 API
	@PostMapping
	public Menu reg(
			// @RequestBody는 통으로 전달되는 JSON을 쪼갠다.
			@RequestBody Menu menu) {
		
		Menu newOne = service.add(menu);
		
		return newOne;
	}
	
	// 메뉴를 수정하는 API
	// api/menus/16
	// 메뉴에는 이미 id가 포함되어있다. id를 쓸 필요없음
	@PutMapping
	public Menu edit(
			@RequestBody Menu menu) {
		System.out.println("edit =============");
		System.out.println(menu);
		Menu mMenu = service.modify(menu);
		System.out.println("after edit==============");
		System.out.println(mMenu);
		return mMenu;
	}
}
