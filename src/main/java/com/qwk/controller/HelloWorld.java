package com.qwk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("Hello")
public class HelloWorld {
	@RequestMapping("/SayHello")
	public String SayHello(Model model){
		model.addAttribute("message", "Hello SpringMVC!");
		System.out.println(model.containsAttribute("message"));//是否成功赋值
		return "hello";
	}
}
