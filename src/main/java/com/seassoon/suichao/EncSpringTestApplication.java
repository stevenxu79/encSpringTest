package com.seassoon.suichao;
//package com.seassoon.suichao;
//
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.seassoon.suichao.xny.Test1;


@SpringBootApplication
public class EncSpringTestApplication {

	public static void main(String[] args) {
//		Test1 test0 = new Test1();
		String str0 = Test1.getStr();
		System.out.println("start str=" + str0);
		SpringApplication.run(EncSpringTestApplication.class, args);
//		Test1 test1 = new Test1();
		String str = Test1.getStr();
		System.out.println("start str=" + str);
	}

	
}
