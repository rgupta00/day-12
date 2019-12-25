package com.day12.session1;

interface B3{
	void foof();
}
public class DemoFunctionalInterface {
	
	public static void main(String[] args) {
		//in java many interface is there that can be clamed as functinal interfae
		
		B3 b3=()-> System.out.println("hello");
		
	}
}
