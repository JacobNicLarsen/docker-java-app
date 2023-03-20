package com.example.dockerjavaapp;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class DockerJavaAppApplication {

	public static void main(String[] args) {

		getJSON();
		SpringApplication.run(DockerJavaAppApplication.class, args);
	}

	@GetMapping("/")
	private static Map<String, String> getJSON(){
		HashMap<String, String> map = new HashMap<>();
		map.put("id", "1");
		map.put("username", "John Spring");
		return map;
	}

	@PostConstruct
	public void init() {
		Logger log = LoggerFactory.getLogger(DockerJavaAppApplication.class);
		log.info("Application started");
	}

}
