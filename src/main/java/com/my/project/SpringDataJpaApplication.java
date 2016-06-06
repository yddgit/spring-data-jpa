package com.my.project;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import com.my.project.config.AppConfig;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder().sources(SpringDataJpaApplication.class, AppConfig.class).run(args);
	}

}
