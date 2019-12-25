package com.day12.session1.ex1;
import java.util.*;
import java.util.function.Predicate;

public class FarmHouse {
	public static List<Apple> getApplesOnCondition(List<Apple> apples,
			Predicate<Apple> predicate){
		List<Apple> selectedApples=new ArrayList<Apple>();
		for(Apple temp: apples){
			if(predicate.test(temp)){
				selectedApples.add(temp);
			}
		}
		return selectedApples;
	}

}














