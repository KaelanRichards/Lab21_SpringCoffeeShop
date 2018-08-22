package com.coffeeshop.CoffeeShop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.coffeeshop.CoffeeShop.dao.MemberDao;

@Controller
public class HomeController {
	
	@Autowired
	MemberDao dao;
	
	@RequestMapping("/")
	public ModelAndView indexPage() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("/register")
	public ModelAndView registerPage() {
		return new ModelAndView("register","members",dao.findAll());
	}
	
	
	@RequestMapping("addnewmember")
	public ModelAndView addNew(@RequestParam("userName") String userName,
			@RequestParam("email") String email) {
		dao.insertMember(userName, email);
		
		return new ModelAndView("register", "Members", dao.findAll());
	}
	
	
	
}
