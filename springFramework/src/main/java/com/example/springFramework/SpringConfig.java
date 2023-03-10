package com.example.springFramework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages = "com.example.springFramework")
public class SpringConfig {
	@Bean
	public Distributor getDistributor() {
		return new Distributor(1323, "Kantipur", "pan-65437289gf");
	}
	@Bean
	public Date getDate() {
		return new Date(12,3,2000);
	}
}
