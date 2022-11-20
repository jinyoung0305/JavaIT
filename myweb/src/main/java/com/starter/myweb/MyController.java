package com.starter.myweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	
	@GetMapping("/")		// my로 들어가면
	public String home() {
		return "index";		// 해당 html 파일을 열어줌
	}
	
	@GetMapping("/keyboard")
	public String keyboardPage(Model model) {
		return "keyboard";		// keyboard.html 열기
	}
	
	// [HTML <-> JAVA] 1. jsp 2. thymeleaf
	@GetMapping("/result") 
	public String resultPage(Model model, @RequestParam("id") String name) {
		if(name.equalsIgnoreCase("1234")) {
			model.addAttribute("re", "로그인");		// re = "로그인"
		}else { 
			model.addAttribute("re","아이디없음");		// re = "아이디없음"
		}
		return "result";		// result.html 열기
	}
}
