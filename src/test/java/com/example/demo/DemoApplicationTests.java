package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {		
//		BinaryOperator stringSum=(x, y)->x+" "+y;
//		System.out.println(stringSum.apply("Welcome","Heejin blog"));
		
//		new Thread(new Runnable() {
//			public void run() {
//				System.out.println("Annoymous Thread");
//			}
//		}).start();
//		new Thread(()->System.out.println("Lambda Thread")).start();
		
		Demo demo = new Demo();
		log.info("{}", demo.sendMessage(100));
		
		List<String> names = Arrays.asList("jeong", "pro", "jdk", "java");
		int count = 0;
		for(String name : names) {
			if(name.contains("o")) {
				count++;
			}
		}
		log.info("{}", count);
		log.info("{}", names.stream().filter(x -> x.contains("o")).count());
		
		names.stream()
			.filter(x -> x.contains("o"))
			.map(x -> x.concat("s"))
			.forEach(x -> System.out.println(x));
	}
}

class Demo {
	public Integer sendMessage(Integer x) {
		return add(x);
	}
	
	private Integer add(Integer x) {
		Integer results = 0;
		for(int i=1; i<x; i++) {
			results = results + i;
		}
		return results;
	}
}