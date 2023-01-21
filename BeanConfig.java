package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.Loc.Coder;
import com.example.Loc.Computer;

@Configuration
public class BeanConfig {
	//configuration
	@Bean 
	public Coder coder_one(Computer computer) {
		Coder c1=new Coder();
		c1.setId(1001);
		c1.setName("Merazul Islam");
		c1.setLanguage("JAVA");
		c1.setComputer(computer);
		
		return c1;
		
		
	}
	@Bean
	public Computer computer_one() {
		Computer cm1=new Computer();
		cm1.setBrand("Intel");
		return cm1;
		
	}

}
