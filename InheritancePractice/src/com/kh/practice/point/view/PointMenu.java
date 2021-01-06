package com.kh.practice.point.view;

import com.kh.practice.point.controller.*;
import java.util.Scanner;

public class PointMenu {
	private static Scanner sc = new Scanner(System.in);
	
	private CircleController cc = new CircleController();
	private RectangleController rc = new RectangleController();
	
	public void mainMenu() {
		int choice;
		while(true) {
			
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			
			choice = sc.nextInt();
			if (choice != 1 && choice != 2 && choice != 9) {
				System.out.println("다시 입력하십시오");
				continue;
			}
			else if(choice == 1) {
				circleMenu();
				break;
			}
			else if(choice == 2) {
				rectangleMenu();
				break;
			}
			else {
				System.exit(0);
			}
		}
		
	}
	
	public void circleMenu() {
		int choice;
		while(true) {
			
			System.out.println("===== 원 메뉴 =====");
			System.out.println("1. 원 둘레");
			System.out.println("2. 원 넓이");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			
			choice = sc.nextInt();
			if (choice != 1 && choice != 2 && choice != 9) {
				System.out.println("잘못 입력하셨습니다. 초기 메뉴로 돌아갑니다.");
				mainMenu();
				break;
			}
			else if(choice == 1) {
				calcCircum();
				break;
			}
			else if(choice == 2) {
				calcCircleArea();
				break;
			}
			else {
				mainMenu();
				break;
			}
		}
	}
	
	public void rectangleMenu() {
		int choice;
		while(true) {
			
			System.out.println("===== 사각형 메뉴 =====");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 넓이");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			
			choice = sc.nextInt();
			if (choice != 1 && choice != 2 && choice != 9) {
				System.out.println("잘못 입력하셨습니다. 초기 메뉴로 돌아갑니다.");
				mainMenu();
				break;
			}
			else if(choice == 1) {
				calcPerimeter();
				break;
			}
			else if(choice == 2) {
				calcRectArea();
				break;
			}
			else {
				mainMenu();
				break;
			}
		}
	}
	
	public void calcCircum() {
		System.out.print("x 좌표 : ");
		int tmpX = sc.nextInt();
		System.out.print("y 좌표 : ");
		int tmpY = sc.nextInt();
		System.out.print("반지름 : ");
		int tmpR = sc.nextInt();
		
		System.out.println(cc.calcCircum(tmpX, tmpY, tmpR));
		mainMenu();
	}
	
	public void calcCircleArea() {
		System.out.print("x 좌표 : ");
		int tmpX = sc.nextInt();
		System.out.print("y 좌표 : ");
		int tmpY = sc.nextInt();
		System.out.print("반지름 : ");
		int tmpR = sc.nextInt();
		
		System.out.println(cc.calcArea(tmpX, tmpY, tmpR));
		mainMenu();
	}
	
	public void calcPerimeter() {
		System.out.print("x 좌표 : ");
		int tmpX = sc.nextInt();
		System.out.print("y 좌표 : ");
		int tmpY = sc.nextInt();
		System.out.print("높이 : ");
		int tmpH = sc.nextInt();
		System.out.print("너비 : ");
		int tmpW = sc.nextInt();
		
		System.out.println(rc.calcCircum(tmpX, tmpY, tmpH, tmpW));
		mainMenu();
	}
	
	public void calcRectArea() {
		System.out.print("x 좌표 : ");
		int tmpX = sc.nextInt();
		System.out.print("y 좌표 : ");
		int tmpY = sc.nextInt();
		System.out.print("높이 : ");
		int tmpH = sc.nextInt();
		System.out.print("너비 : ");
		int tmpW = sc.nextInt();
		
		System.out.println(rc.calcArea(tmpX, tmpY, tmpH, tmpW));
		mainMenu();
	}
}
