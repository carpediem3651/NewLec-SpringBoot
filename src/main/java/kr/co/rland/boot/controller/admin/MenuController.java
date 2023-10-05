package kr.co.rland.boot.controller.admin;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import kr.co.rland.boot.entity.Menu;
import kr.co.rland.boot.service.MenuService;

@Controller("adminMenuController")
@RequestMapping("/admin/menu")
public class MenuController {
	
	@Autowired
	private MenuService service;
	
//	@ResponseBody
	@RequestMapping("list")
	public String list() {
		return "/admin/menu/list";
	}
	
//	@ResponseBody
//	@RequestMapping("detail")
	@RequestMapping("detail")
	public String detail() {
		return "/admin/menu/detail";
	}
	
	@GetMapping("reg")
	public String reg() {

		return "/admin/menu/reg";
	}
	
	@PostMapping("reg")
	public String reg(
			@RequestParam(name="img-file") MultipartFile imgFile,
			@RequestParam(name="kor-name", required=true) String korName,
			@RequestParam(name="eng-name", required=true) String engName,
			@RequestParam(defaultValue="0") int price,
			String description,
			@RequestParam(name="is-small") boolean isSmall,
			Model model
			) throws IOException {
		
		Menu menu = Menu.builder()
					.korName(korName)
					.engName(engName)
					.price(price)
					.description(description)
					.isSmall(isSmall)
					.img("coffee.png")
					.memberId(1L)
					.build();
				
		
		service.add(menu);
		System.out.println(imgFile.isEmpty());
		System.out.println(imgFile.getOriginalFilename());
		
		InputStream fis = imgFile.getInputStream();
		OutputStream fos = new FileOutputStream("c:\\"+imgFile.getOriginalFilename());
		
		int size = 0;
		byte[] buf = new byte[1024];
		while((size = fis.read(buf))!=-1)
			fos.write(buf, 0, size);
		
		fis.close();
		fos.close();
		
		return "redirect:list";
	}
}
