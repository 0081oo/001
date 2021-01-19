package kh.model.vo;

import java.io.*;
import java.util.ArrayList;


class Book implements Serializable{
	private String title;
	private int price;
	
	public Book() {}
	public Book(String title, int price) {
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
	
	public void fileSave(String fileName) {
		Book myBook1 = new Book("자바를 정복하자", 35000);
		
		try {
			File f = new File("D:/fileName.txt");
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			
			oos.writeObject(myBook1);
			
			oos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void fileSave() {
		ArrayList<Book> bookList = new ArrayList<>();
		bookList.add(new Book("자바를 잡아라", 30000));
		bookList.add(new Book("오라클 정복", 35000));
		bookList.add(new Book("웹표준 2.0", 27500));
		bookList.add(new Book("자바 Servlet/JSP", 28000));
		bookList.add(new Book("ajax 사용법", 15000));
		
		for(int i = 0; i < bookList.size(); i++) {
			System.out.println(bookList.get(i).toString());
		}
	}
	


}
