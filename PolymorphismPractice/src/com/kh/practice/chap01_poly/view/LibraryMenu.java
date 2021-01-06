package com.kh.practice.chap01_poly.view;

import com.kh.practice.chap01_poly.controller.*;
import com.kh.practice.chap01_poly.model.vo.*;
import java.util.Scanner;

public class LibraryMenu {
	static private Scanner sc = new Scanner(System.in);
	private LibraryController lc = new LibraryController();
	
	public void mainMenu() {
		System.out.print("이름 : ");
		String tmpName = sc.next();
		System.out.print("나이 : ");
		int tmpAge = sc.nextInt();
		System.out.print("성별 : ");
		char tmpGen = sc.next().charAt(0);
		
		Member newMem = new Member(tmpName, tmpAge, tmpGen);
		lc.insertMember(newMem);
		
		while(true) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.print("메뉴 번호 : ");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				System.out.println(lc.myInfo().toString());
				continue;
			}
			else if(choice == 2) {
				selectAll();
				continue;
			}
			else if(choice == 3) {
				searchBook();
				continue;
			}
			else if(choice == 4) {
				rentBook();
				continue;
			}
			else if(choice == 9) {
				System.exit(0);
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
		}	
	}
	
	public void selectAll() {
		Book[] bList = lc.selectAll();
		
		for(int i = 0; i < bList.length; i++) {
			if(bList[i] instanceof AniBook) {
				System.out.println(i + "번 도서 : " + ((AniBook)bList[i]).toString());
				
			}
			else if(bList[i] instanceof CookBook) {
				System.out.println(i + "번 도서 : " + ((CookBook)bList[i]).toString());
			}
		}
	}
	
	public void searchBook() {
		System.out.print("검색할 제목 키워드 : ");
		String key = sc.next();
		
		Book[] searchList = lc.searchBook(key);
		
		for(int i = 0; i < searchList.length; i++) {
			if(searchList[i] instanceof AniBook) {
				System.out.println(((AniBook)searchList[i]).toString());
				
			}
			else if(searchList[i] instanceof CookBook) {
				System.out.println(((CookBook)searchList[i]).toString());
			}
		}
	}
	
	public void rentBook() {
		selectAll();
		
		System.out.print("대여할 도서 번호 선택 : ");
		int index = sc.nextInt();
		
		int flag = lc.rentBook(index);
		
		if(flag == 0) System.out.println("성공적으로 대여되었습니다.");
		else if(flag == 1) System.out.println("나이 제한으로 대여 불가능입니다.");
		else if(flag == 2) System.out.println("성공적으로 대여되었습니다. "
				+ "요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요.");
		else if(flag == 3) System.out.println("성공적으로 대여되었으나 "
				+ "요리학원 쿠폰은 책에 포함되어 있지 않습니다.");
	}
	
}
