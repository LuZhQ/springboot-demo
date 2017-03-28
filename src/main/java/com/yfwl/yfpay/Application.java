package com.yfwl.yfpay;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@ServletComponentScan
@MapperScan("com.yfwl.yfpay.mapper")
public class Application {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication sa = new SpringApplication();
		sa.setAddCommandLineProperties(false);
		SpringApplication.run(Application.class, args);
	}

}
