package kr.co.rland.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HomeController {
	
//	@ResponseBody
	@RequestMapping("index")
	public String index() {
		return "index";
	}
}
