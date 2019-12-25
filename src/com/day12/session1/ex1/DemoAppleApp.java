package com.day12.session1.ex1;

import java.util.*;
import java.util.function.Predicate;

public class DemoAppleApp {
	public static void main(String[] args) {

		List<Apple> apples = Arrays.asList(new Apple("green", 400), new Apple(
				"red", 470), new Apple("green", 200), new Apple("red", 200),
				new Apple("red", 380));

		// i want to get all heavy apples
		Predicate<Apple> p1 = apple -> apple.getWeight() >= 300;

		// Predicate for green apple
		Predicate<Apple> p2 = apple -> apple.getColor().equals("green");

		// Heavy as well as green
		Predicate<Apple> p3 = p1.and(p2);

		// Heavy or green
		Predicate<Apple> p4 = p1.or(p2);

		// nighter Heavy nor green
		Predicate<Apple> p5 = p1.or(p2).negate();

		// printing all heavy apples
		System.out.println("-------all heavy apples-------");
		List<Apple> allheavy = FarmHouse.getApplesOnCondition(apples, p1);
		printApples(allheavy);
		System.out.println("-------all green apples-------");
		// printing all green apples
		List<Apple> allGreen = FarmHouse.getApplesOnCondition(apples, p2);
		printApples(allGreen);

		System.out.println("-------all green and heavy apples-------");
		// printing all green apples
		List<Apple> allGreenAndHeay = FarmHouse.getApplesOnCondition(apples, p3);
		printApples(allGreenAndHeay);

	}

	static void printApples(List<Apple> apples) {
		for (Apple apple : apples) {
			System.out.println(apple);
		}
	}
}
