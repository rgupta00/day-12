package com.day12.session2.ex3;
import java.awt.print.Book;
import java.util.*;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.Comparator.*;

class Cat{
	
	private int name;
	@Override
	 void finalize() throws Throwable {
		System.out.println("i run before GC claim a object");
		super.finalize();
	}
	
	
}

public class DemoEmpApp {
	public static void main(String[] args) {
		
		Cat c=new Cat();
		c=null;
		System.gc();
		
		
		
		BooleanSupplier bs=() ->true;
		
		
		
		List<Emp> emps=new ArrayList<Emp>();
		emps.add(new Emp(121, "rajat", 900, "delhi", Dept.IT));
		emps.add(new Emp(1210, "neha", 900, "delhi", Dept.IT));
		emps.add(new Emp(1, "kapil", 400, "banglore", Dept.SALES));
		emps.add(new Emp(101, "geeta", 470, "banglore", Dept.MKT));
		emps.add(new Emp(10, "guru", 450, "banglore", Dept.MKT));
		emps.add(new Emp(91, "ekta", 410, "delhi", Dept.TRAINING));
		emps.add(new Emp(1921, "gunika", 500, "banglore", Dept.IT));
		
		//way in java 1.8
		
		//print the name of all emp
		//select * from emp
	/*	emps.stream()
		.forEach(emp-> System.out.println(emp));*/
		
		//select name from emp where dept=IT limit 2
		
		 emps.stream().parallel()
		.filter(emp-> emp.getDept()==Dept.IT)
		.map(emp-> emp.getName())
		.sorted()
		.skip(10)
		//.limit(2)
		.forEach(name-> System.out.println(name));
	
		
		
		
		
		
		
		
		
		
		//get the names of the emp who is getting 
		//salary less 500 and working in Mkt sorted by their name
		
		//stream procssing of data in java 1.8
		
		
		
		
		
		
		
		/*//first get the list of all emp getting sal less then 500
		List<Emp> tempList=new ArrayList<Emp>();
		for(Emp emp: emps){
			if(emp.getSalary()<500)
				tempList.add(emp);
		}
		//sort them as per name
		Collections.sort(tempList, new Comparator<Emp>() {
			@Override
			public int compare(Emp o1, Emp o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		//finally get the name
		List<String> names=new ArrayList<String>();
		for(Emp emp: tempList){
			names.add(emp.getName());
		}*/
		
		/*//print all the names
		for(String name: names){
			System.out.println(name);
		}*/
	}
}










