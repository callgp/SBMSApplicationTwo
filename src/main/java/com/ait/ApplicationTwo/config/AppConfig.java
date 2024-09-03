package com.ait.ApplicationTwo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.ait.ApplicationTwo.demo.MovieFinder;

@Configuration
@ComponentScan(basePackages="com.ait")
@PropertySource("application.properties")
public class AppConfig {

	
	//@Bean
//	public MovieFinder mvFinder() {
//		return new MovieFinder();
		
//	}
}
