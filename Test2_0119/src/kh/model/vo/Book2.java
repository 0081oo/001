package kh.model.vo;

import java.util.*;

public class Book2 {
	private String title;
	private int price;
	
	public Book2() {}
	public Book2(String title, int price) {
		this.title = title;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString() {
		return "\"" + this.title + "\"," + Integer.toString(this.price); 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book2> bookList = new ArrayList<>();

		

		bookList.add(new Book2("자바를 잡아라", 30000));

		bookList.add(new Book2("오라클 정복", 35000));

		bookList.add(new Book2("웹표준 2.0", 27500));

		bookList.add(new Book2("자바 Servlet/JSP", 28000));

		bookList.add(new Book2("ajax 사용법", 15000));

		System.out.println(bookList);

//		for(int i = 0; i < bookList.size(); i++) {
//
//			System.out.println(bookList.get(i).toString());
//
//		}
	}

}
