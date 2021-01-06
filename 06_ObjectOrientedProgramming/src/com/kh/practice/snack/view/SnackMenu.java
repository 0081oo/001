package com.kh.practice.snack.view;

import java.util.Scanner;
import com.kh.practice.snack.controller.*;

public class SnackMenu {
	Scanner sc = new Scanner(System.in);
	SnackController scr = new SnackController();
	
	
	
	public void menu() {
		//지역변수
		String t1, t2, t3;
		int t4, t5;
		char nOry;
		
		System.out.println("스낵류를 입력하세요.");
		System.out.print("종류 : ");
		t1 = sc.next();
		System.out.print("이름 : ");
		t2 = sc.next();
		System.out.print("맛 : ");
		t3 = sc.next();
		System.out.print("개수 : ");
		t4 = sc.nextInt();
		System.out.print("가격 : ");
		t5 = sc.nextInt();
		
		System.out.println(scr.saveData(t1, t2, t3, t4, t5));
		
		System.out.print("저장한 정보를 확인하시겠습니까? (y/n) : ");
		nOry = sc.next().charAt(0);
		
		if(nOry == 'y') {
			System.out.println(scr.confirmData());
		}
		else System.exit(0);
	}
}
