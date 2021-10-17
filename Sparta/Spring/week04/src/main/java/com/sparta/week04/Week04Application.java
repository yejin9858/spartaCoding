package com.sparta.week04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableJpaAuditing // 시간 자동 반영
@SpringBootApplication
public class Week04Application {

	public static void main(String[] args) {
		SpringApplication.run(Week04Application.class, args);
	}

}
