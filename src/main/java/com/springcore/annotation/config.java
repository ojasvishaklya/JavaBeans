package com.springcore.annotation;

import org.springframework.context.annotation.Bean;

public class config {
	
	@Bean(name="myBean")
	public MyBean initiate() {
		return new MyBean();
	}
}
