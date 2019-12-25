package com.day12.session1;
interface A1{
	
	static void foofStatic(){
		System.out.println("i am static method of the interface");
	}
	public default void foo(){
		System.out.println("foo method defult");
	}
}
class B1 implements A1{
	
}
public class Ex3DefaultMethod {
	public static void main(String[] args) {
		
		A1 a=new B1();
		A1.foofStatic();
		// static method of an interface can only be called
		//with name of that interface
		
		a.foo();
	}
}
