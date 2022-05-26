package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	@RequestMapping("/test")
	public ModelAndView hello() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("model", "test");
		mv.setViewName("hello");
		return mv; 
	}
	
}
