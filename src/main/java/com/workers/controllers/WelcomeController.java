package com.workers.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/auth/welcome.jsp")
public class WelcomeController {

	@GetMapping("/hello")
	public String welcomePage() {
		System.out.println("helloooo");
		return "welcome";
	}

}

///https://github.com/Tivotal/Resposnive-Admin-Dashboard-in-HTML-CSS-JavaScript