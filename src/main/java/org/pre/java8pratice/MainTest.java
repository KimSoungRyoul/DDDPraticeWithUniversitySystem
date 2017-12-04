package org.pre.java8pratice;

import java.util.Arrays;

public class MainTest {

	

	public static void main(String[] args) {
		Func add = (int a, int b) -> a + b;

		Func sub = (int a, int b) -> a - b;
	
		// TODO Auto-generated constructor stub
		int result = add.calc(3, 4);
		
		System.out.println(result);
		
		
		Arrays.asList(1,2,3).stream().forEach(System.out::println);
		
		
		Arrays.asList(1,2,3).parallelStream().forEach(System.out::print);
		
	
	
	}

}
