package com.day12.session1;
import java.util.*;

class Book {
	private int id;
	private String title;
	private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Book(int id, String title, double price) {
		this.id = id;
		this.title = title;
		this.price = price;
	}
	public Book() {}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", price=" + price + "]";
	}
	
	

}

public class DemoLamabdaExpession {

	public static void main(String[] args) {
		
		List<Book>books=new ArrayList<Book>();
		books.add(new Book(121, "java", 400));
		books.add(new Book(21, "python", 900));
		books.add(new Book(191, "c++", 500));
		
		Comparator<Book>booksComp=( o1,  o2)->
				 o1.getTitle().compareTo(o2.getTitle());
			
		
		
		Collections.sort(books, booksComp);
		
		for(Book book: books)
			System.out.println(book);
		
		
		//how to move form anno inner class code to lambda expession
		
		
		Runnable runnable=()-> 
				System.out.println("anno inner class imp...");
			
		Thread t=new Thread(runnable);
		
		t.start();
		
	}
}












