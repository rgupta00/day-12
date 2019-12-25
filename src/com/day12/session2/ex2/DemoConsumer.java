package com.day12.session2.ex2;
import java.util.*;
import java.util.function.Consumer;

public class DemoConsumer {

	public static void main(String[] args) {
	
		
		Consumer<String> consumer= name-> System.out.println(name);
			
		//use of consumer
		List<String> names=Arrays.asList("raj","ekta",
				"keshav","gunika","kapil");
		//java 1.5
		for(String name: names){
			System.out.println(name);
		}
		//java 1.8 =>better in performance*
		names.forEach(consumer);
	}
}
















