package com.rahul.rahulReactJavaApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class RahulReactJavaAppApplication {

	public static void main(String[] args) {
		//SpringApplication.run()  will  create a container called IOC container/spring container inside JVM, within which spring will hold all the created objects

	//  ||. Dependency Injection :=>
		ApplicationContext context = SpringApplication.run(RahulReactJavaAppApplication.class, args);
		Dev obj = context.getBean(Dev.class);
		obj.build();

	//  ||. AutoWiring :=>


	}
}
