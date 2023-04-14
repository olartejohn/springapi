package com.edu.uniminuto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyFirstProyectApplication {

	public static void main(String[] args) {
		System.getProperties().put("server.port",9524);
		SpringApplication.run(MyFirstProyectApplication.class, args);
	}

}
