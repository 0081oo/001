package com.kh.practice.chap01_poly.model.vo;

public class Book {
	private String title;
	private String author;
	private String publisher;
	
	public Book() {}
	
	public Book(String title, String author, String publisher) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String toString() {
		return "[Book [title = " + this.title + ", author = " 
				+ this.author + ", publisher = " + this.publisher + ", ";
	}
}
