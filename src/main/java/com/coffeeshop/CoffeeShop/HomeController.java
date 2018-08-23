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
		return new ModelAndView("index","products", dao.findAllProd());
	}
	
	@RequestMapping("/register")
	public ModelAndView registerPage() {
		return new ModelAndView("register","members",dao.findAllMem());
	}
	
	
	@RequestMapping("addnewmember")
	public ModelAndView addNew(@RequestParam("userName") String userName,
			@RequestParam("email") String email) {
		dao.insertMember(userName, email);
		
		return new ModelAndView("register", "Members", dao.findAllMem());
	}
	
//	@RequestMapping("displayproducts")
//	public ModelAndView addNew(@RequestParam("name") String name,
//			@RequestParam("description") String description, @RequestParam("price") String price) {
//		
//		
//		return new ModelAndView("index", "products", dao.findAllProd());
//	}
	
	
	
}
