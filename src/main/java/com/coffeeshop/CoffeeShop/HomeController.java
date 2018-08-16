package com.coffeeshop.CoffeeShop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/")
	public ModelAndView indexPage() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/register")
	public ModelAndView registerPage() {
		return new ModelAndView("register");
	}
	
	@RequestMapping("/adduser")
	public ModelAndView addUserPage(@RequestParam("firstName") String fName, @RequestParam("lastName") String lName,
			@RequestParam("emailName") String eName, @RequestParam("userPass") String passName
			, @RequestParam("gender") String genderType, @RequestParam("userName") String uName
			, @RequestParam("pNumber") String phoneNumber) {
		return new ModelAndView("adduser", "userInfo", fName + " " + lName + " " + eName);
	}
	
}
