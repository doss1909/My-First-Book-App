package com.das.DTO;

public class BookDTO {
	
	Integer id;
	
	String name;
	
	Double price;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BookDTO [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	

}
