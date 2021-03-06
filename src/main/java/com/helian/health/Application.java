package com.helian.health;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;


@SpringBootApplication
public class Application extends SpringBootServletInitializer {

	private static Logger logger = Logger.getLogger(Application.class);

	public static void main(String[] args) {
		logger.info("ApplicationDriver start");
		SpringApplication.run(Application.class, args);
		logger.info("ApplicationDriver start success------");
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}
}
