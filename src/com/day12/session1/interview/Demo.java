package com.day12.session1.interview;

class A{
	static void print(){
		System.out.println("print of class A");
	}
}
class B extends A{
	static void print(){
		System.out.println("print of class B");
	}
}

class C extends B{
	
}
public class Demo {

	public static void main(String[] args) {
		C c=new C();
		c.print();
	}
}
