package com.example.Loc;

import jakarta.annotation.PreDestroy;

public class Computer {
	private String brand;

	public Computer() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("No-arg constructor (Computer class)");
	}

	public Computer(String brand) {
		super();
		this.brand = brand;
		System.out.println("All-arg constructor (Computer class)");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	@PreDestroy
	
	public void destroy() {
		System.out.println("Computer class object");
	}

}
