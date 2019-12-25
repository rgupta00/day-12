package com.day12.session1;

interface A{
	void foof();
	//so that we can new feature without breaking existing api
	default void foof2(){
		System.out.println("i am a default method ...");
	}
	
	//aka helper method ...
	static void foofStatic(){
		System.out.println("static method inside interface...");
	}
}

class B implements A{
	public void foof(){
		System.out.println("method is overriden...");
	}
	 public  void foof2(){
		System.out.println("i am a default method overriden...");
	}
}
 class C implements A{
	public void foof(){
		System.out.println("method is overriden...");
	}
}


public class Demo {
	public static void main(String[] args) {
		A a=new C();
		a.foof2();
	}

}
