package com.coffeeshop.CoffeeShop.entity;

public class Products {
	
	private String id;
	private String description;
	private String name;
	private String price;
	
	public Products() {
		
	}
	
	public Products(String id, String description, String name, String price) {
		super();
		this.id = id;
		this.description = description;
		this.name = name;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Products [id=" + id + ", description=" + description + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
}
