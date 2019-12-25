package com.day12.session1;
interface X{
	default void foo(){
		System.out.println("I");
	}
}
interface Y{
	default void foo(){
		{
			System.out.println("II");
		}
	}
}
class Z implements X, Y{
	public void foo(){
		X.super.foo();
		Y.super.foo();
		System.out.println("III");
	}
}
public class DiamandProblem {
	public static void main(String[] args) {
		X x=new Z();
		x.foo();
	}
}
