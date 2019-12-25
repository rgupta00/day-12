package com.day12.session2.ex2;

import java.util.function.Supplier;

import com.day12.session1.ex1.Apple;

public class DemoSupplier {

	public static void main(String[] args) {
		
		//Factory design pattern*
		//Supplier dont take anything and retun an object*
		Supplier<String> supplier=()->  "hello world";
			
		Supplier<Apple> appleSuppler=()-> new Apple();
			
		
	}
}
