package com.sk.springboot.jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenkinsApplication {

	public static Logger log = LoggerFactory.getLogger(SpringJenkinsApplication.class);

	@PostConstruct
	public void intt() {
		log.info("Appilication started.......");
	}

	public static void main(String[] args) {
		log.info("Appilication executed.....");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
