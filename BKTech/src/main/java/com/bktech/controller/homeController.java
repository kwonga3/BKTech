package com.bktech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {
	
	@RequestMapping("/")
	public String main() {
		
		return "index.html";
	}
	
	@RequestMapping("/about")
	public String about() {
		
		return "about.html";
	}
	
	@RequestMapping("/portfolio")
	public String portfolio() {
		
		return "portfolio.html";
	}
	
	@RequestMapping("/certification")
	public String certification() {
		
		return "certification.html";
	}
	
	@RequestMapping("/contactus")
	public String contact() {
		
		return "contact.html";
	}
	@RequestMapping("/catalog")
	public String catalog() {
		
		return "catalog.html";
	}
	
	@RequestMapping("/braket")
	public String braket() {
		
		return "braket.html";
	}
	
	@RequestMapping("/pole")
	public String pole() {
		
		return "pole.html";
	}
	
	@RequestMapping("/hamche")
	public String hamche() {
		
		return "hamche.html";
	}

}
