package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	
	@GetMapping("/")
	public String greeting() {
		return "hello";
	}
	
	@GetMapping("/greeting")
	//  リクエストの値を取得する
	public String greeting(@RequestParam("message") String message, Model model) {
		// 変数 sample に リクエストの値 messageを格納
		model.addAttribute("sample", message);
		return "hello";
	}
}
