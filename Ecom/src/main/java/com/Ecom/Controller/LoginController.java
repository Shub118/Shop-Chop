package com.Ecom.Controller;

import org.springframework.web.bind.annotation.GetMapping;

public class LoginController {
	
	@GetMapping("/signin")
	public String signin() {
		return "sign-in succesful";
	}
}
