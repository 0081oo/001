package com.kh.exam1;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String choice;
		
		while(true) {
			System.out.println("프로그램 실행중");
			System.out.println("종료하시겠어요 ?(yes or no) : ");
			choice = sc.next();
			// choice = sc.next().toLowerCase(); 이용해서 애초에 모든입력을 소문자로 바꿔 처리해도
			
			if(choice.equalsIgnoreCase("yes")) {
				System.out.println("종료합니다.");
				break;
			}
			else if(choice.equalsIgnoreCase("no")) {
				continue;
			}
		}
		
	}

}
