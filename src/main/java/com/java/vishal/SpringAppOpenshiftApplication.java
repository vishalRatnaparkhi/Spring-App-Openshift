package com.java.vishal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAppOpenshiftApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAppOpenshiftApplication.class, args);
	}

	@GetMapping("/")
	public String getMethod()
	{
		String name="Hello Rucha, Congratulations!!!! \n I Love You :)";
		return  name;
	}

}
