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
		
//		Demo demo = new Demo();
//		log.info("{}", demo.sendMessage(100));
//		
//		List<String> names = Arrays.asList("jeong", "pro", "jdk", "java");
//		int count = 0;
//		for(String name : names) {
//			if(name.contains("o")) {
//				count++;
//			}
//		}
//		log.info("{}", count);
//		log.info("{}", names.stream().filter(x -> x.contains("o")).count());
//		
//		names.stream()
//			.filter(x -> x.contains("o"))
//			.map(x -> x.concat("s"))
//			.forEach(x -> System.out.println(x));
		
//		String a = "a";
//		String b = "a";
//		String comp_a = new String("a");
//		String comp_b = new String("a");
//		
//		log.info("{}", a == b);
//		log.info("{}", a == comp_a);
//		log.info("{}", comp_a == a);
//		log.info("{}", comp_a == comp_b);
//		
//		log.info("{}", a.equals(b));
//		log.info("{}", a.equals(comp_a));
//		log.info("{}", comp_a.equals(a));
//		log.info("{}", comp_a.equals(comp_b));
		
//		Integer a = 1;
//		Integer b = 1;
//		Integer comp_a = new Integer(1);
//		Integer comp_b = new Integer(1);
//		
//		log.info("{}", a == b);
//		log.info("{}", a == comp_a);
//		log.info("{}", comp_a == a);
//		log.info("{}", comp_a == comp_b);
//		
//		log.info("{}", a.equals(b));
//		log.info("{}", a.equals(comp_a));
//		log.info("{}", comp_a.equals(a));
//		log.info("{}", comp_a.equals(comp_b));
		
		int a = 1;
		int b = 1;
		Integer comp_a = 1;
		Integer comp_b = 1;
		
		log.info("{}", a == b);
		log.info("{}", a == comp_a);
		log.info("{}", comp_a == a);
		log.info("{}", comp_a == comp_b);
		
//		log.info("{}", a.equals(b));
//		log.info("{}", a.equals(comp_a));
		log.info("{}", comp_a.equals(a));
		log.info("{}", comp_a.equals(comp_b));
	}
}

//class Demo {
//	public Integer sendMessage(Integer x) {
//		return add(x);
//	}
//	
//	private Integer add(Integer x) {
//		Integer results = 0;
//		for(int i=1; i<x; i++) {
//			results = results + i;
//		}
//		return results;
//	}
//}