//package com.seassoon.suichao;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.builder.SpringApplicationBuilder;
//import org.springframework.boot.web.support.SpringBootServletInitializer;
//
//import com.seassoon.suichao.xny.Test1;
//
//@SpringBootApplication
//public class EncSpringTestApplication_tomcat extends SpringBootServletInitializer {
//
//	public static void main(String[] args) {
//		Test1 test0 = new Test1();
//		String str0 = test0.getStr();
//		System.out.println("start str=" + str0);
//		SpringApplication.run(EncSpringTestApplication_tomcat.class, args);
//		Test1 test1 = new Test1();
//		String str = test1.getStr();
//		System.out.println("start str=" + str);
//	}
//
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(EncSpringTestApplication_tomcat.class);
//	}
//}
