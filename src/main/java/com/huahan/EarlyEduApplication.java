package com.huahan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = { "com.huahan.mapper" })
@SpringBootApplication
public class EarlyEduApplication {

	public static void main(String[] args) {
		SpringApplication.run(EarlyEduApplication.class, args);
	}

}
