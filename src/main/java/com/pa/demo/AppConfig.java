package com.pa.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class AppConfig {
	
	
	@Bean
	public String greeting() {
		return "Hello, World";
	}
	

}
