package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Greetings {

	@RequestMapping("/greetings")
	public @ResponseBody String greetings() {
		return "Hello, Atlast !! .. Phew ";
	}
}
