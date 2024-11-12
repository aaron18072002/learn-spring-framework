package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.learn_spring_framework.beans.Address;
import com.in28minutes.learn_spring_framework.beans.Person;

@Configuration
public class HelloWorldConfiguration {
	@Bean
	public String rangaName() {
		return "Ranga";
	}
	
	@Bean
	public int rangaAge() {
		return 50;
	}
	
	@Bean
	public Address rangaAddress() {
		return new Address("Main Street","Utrecht");
	}
	
	@Bean
	public Person rangaPerson() {
		return new Person(this.rangaName(), this.rangaAge(), this.rangaAddress());
	}
	
	@Bean
	public Person person(String name, int age, Address address) {
		return new Person(name,age,address);
	}
}
