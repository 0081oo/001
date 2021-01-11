package com.kh.practice.file.view;

import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();

	public void mainMenu() {
		String name, before, after;
		String menu = "";
		menu += "1. 파일 목록 보기\n";
		menu += "2. 파일 생성\n";
		menu += "3. 파일 읽기\n";
		menu += "4. 파일 수정\n";
		menu += "5. 파일 삭제\n";
		menu += "9. 프로그램 종료\n";
		menu += "메뉴 선택 : ";
		System.out.print(menu);
		switch(sc.next()) {
			case "1" : 
				// FileController의 listFile 메소드 호출하여 파일 목록 보기
				fc.listFile();
				break;
			case "2" : 
				// FileController의 addFile 메소드 호출하여 파일 생성
				System.out.print("생성할 파일 이름 입력하세요 : ");
				name = sc.next();
				fc.addFile(name);
				break;
			case "3" : 
				// FileController의 readFile 메소드 호출하여 파일 내용 출력
				System.out.print("읽을 이름 입력하세요 : ");
				name = sc.next();
				fc.readFile(name);
				break;
			case "4" : 
				// FileController의 editFile 메소드 호출하여 파일 수정
				System.out.print("수정할 파일 이름 입력하세요 : ");
				name = sc.next();
				System.out.print("변경 전 내용 입력하세요 : ");
				before = sc.next();
				System.out.print("변경 후 내용을 입력하세요 : ");
				after = sc.next();
				fc.editFile(name, before, after);
				break;
			case "5" : 
				// FileController의 deleteFile 메소드 호출하여 파일 삭제
				System.out.print("삭제할 파일 이름 입력하세요 : ");
				name = sc.next();
				fc.deleteFile();
				break;
			case "9" : 
				System.exit(0);
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		}
	}
}
