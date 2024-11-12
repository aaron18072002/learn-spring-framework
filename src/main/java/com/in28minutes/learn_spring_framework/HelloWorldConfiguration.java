package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.learn_spring_framework.beans.Person;

@Configuration
public class HelloWorldConfiguration {
	@Bean
	public String name() {
		return "Ranga";
	}
	
	@Bean
	public Person ranga() {
		return new Person("Range",50);
	}
}
