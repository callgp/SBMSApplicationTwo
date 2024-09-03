package com.ait.ApplicationTwo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ait.ApplicationTwo.config.AppConfig;
import com.ait.ApplicationTwo.demo.MovieLister;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);

	MovieLister bean = (MovieLister) ctx.getBean("movieLister");
	bean.printMovies();
	}

}
