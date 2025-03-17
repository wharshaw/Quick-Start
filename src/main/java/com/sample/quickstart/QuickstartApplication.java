package com.sample.quickstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class QuickstartApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(QuickstartApplication.class, args);

		Subject subject = (Subject) context.getBean("subject");
		subject.say();
	}



}
