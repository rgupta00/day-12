package com.day12.session2.ex5;

import java.util.function.BiFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToLongBiFunction;

public class MCQDiscussion {

	public static void main(String[] args) {
		//return type of lambda exp is function
		Predicate<Integer> p=i-> i%2==0;
		
		
		
		
		ToLongBiFunction<Long, Long>biFun=new ToLongBiFunction<Long, Long>() {

			@Override
			public long applyAsLong(Long t, Long u) {
				return t+u;
			}
		};
		
		Function<String, Integer> fun= name ->name.length();
		BiFunction<String, String, Integer>		fun2=
				( t,  u)-> Integer.compare(t.length(), u.length());
				
		int value=fun2.apply("rajiv", "amit");
		System.out.println(value);
	}
}
