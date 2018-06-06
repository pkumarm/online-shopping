package com.practice.onlineShoppingPractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	
	@RequestMapping(value={"/","/home","/index"})
	public ModelAndView index(){
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting","Welcome to spring ");
		return mv;
	}
	
/*	@RequestMapping(value="/test")
	public ModelAndView test(@RequestParam(value = "greeting", required=false)String greet){
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting",greet);
		return mv;
	}*/
	
	@RequestMapping(value="/test/{greeting}")
	public ModelAndView test(@PathVariable("greeting")String greet){
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting",greet);
		return mv;
	}
}
