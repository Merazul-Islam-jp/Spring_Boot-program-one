package com.example.Loc;

import jakarta.annotation.PreDestroy;

public class Coder {
	private int id;
	private String name,Language;
	private Computer computer;
	public Coder(int id, String name, String language,Computer computer) {
		super();
		this.id = id;
		this.name = name;
		Language = language;
		System.out.println("All-arg constructor (Coder class)");
	}
	public Coder() {
		super();
		// TODO Auto-generated constructor stub
		
		System.out.println("No-arg constructor (Coder class)");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
	}
	
	public Computer getComputer() {
		return computer;
	}
	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	@PreDestroy
	
	public void destroy() {
		System.out.println("Coder class object");
	}
	

}
