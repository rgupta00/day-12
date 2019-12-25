package com.day12.session2.ex5;

import java.util.Optional;

import com.day12.session2.ex3.Emp;

public class OptionalInJava8 {

	public static void main(String[] args) {

		Optional<String> o1=Optional.ofNullable(null);
		
		
		
		
		// optional is a container that hold an object
		// is is used to be protect from problems due to NPEx

		
		
		Optional<Emp> empOpt = getEmpById(4);
		System.out.println(empOpt.map(e -> e.getName())
				.orElse("name not found"));
	}

	// let say this code i have not written
	static Optional<Emp> getEmpById(int i) {
		return Optional.ofNullable(null);
	}

}














