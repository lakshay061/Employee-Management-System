package ems.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmsController {
	
	@RequestMapping("/")
	public String home() {
		System.out.println("Home Controller Fired...");
		return "index";
	}
}
