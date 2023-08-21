package com.zerock.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	//get방식으로 요청이오면
	@RequestMapping(value = "/", method = RequestMethod.GET)
	//@GetMapping("/")
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		//현제시간
		Date date = new Date();
		//locale 한국형식으로  format을 하겠다.
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		//특정한 키값으로 저장해놓는다.
		model.addAttribute("serverTime", formattedDate );
		
		//views쪽으로  home이라는 곳으로 넘겨라
		return "home";
	}
	
	@GetMapping("ex01")
	public String test() {
		System.out.println("테스트입니다.");
		return "ex01";
	}
	
}
