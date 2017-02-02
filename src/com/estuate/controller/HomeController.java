package com.estuate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
     
	@RequestMapping({"/","/index","/login/index"})
	public String getHome(){
    	 return "index";
     }
	
}
