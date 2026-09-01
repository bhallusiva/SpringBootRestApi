package com.example.SpringWeb.Cntroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/")
	public String showData()
	{
		return "Well Come to Spring Web";
	}
	@RequestMapping("About")
	public String about()
	{
		return "There is nothing to say";
	}
}
