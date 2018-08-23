package com.coffeeshop.CoffeeShop.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.coffeeshop.CoffeeShop.entity.Members;
import com.coffeeshop.CoffeeShop.entity.Products;



@Repository
public class MemberDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	// select * from Members
	public List<Members> findAllMem() {
		return jdbcTemplate.query("select * from Members", new BeanPropertyRowMapper<Members>(Members.class));

	}
	
	public List<Products> findAllProd() {
		return jdbcTemplate.query("select * from Products", new BeanPropertyRowMapper<Products>(Products.class));

	}
	
	public int insertMember(String userName, String email) {
		String insertQuery = "INSERT INTO Members(UserName, Email)"
				+ " values(?,?)";
			return jdbcTemplate.update(insertQuery, userName, email);
	}
	
	
}
