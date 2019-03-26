package com.nhc.batisdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.nhc.batisdemo.mapper")
@ComponentScan("com.nhc.batisdemo")
public class BatisdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BatisdemoApplication.class, args);
	}
}
