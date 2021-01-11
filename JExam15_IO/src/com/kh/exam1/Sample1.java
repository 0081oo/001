package com.kh.exam1;

import java.io.*;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("/Users/heeminchun/Desktop/Sample.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("IOException 에러 발생");
		}

		System.out.println(f.getName() + " 읽기? : " + f.canRead());
		System.out.println(f.getName() + " 쓰기? : " + f.canWrite());
		System.out.println(f.getName() + " 실행? : " + f.canExecute());
		System.out.println(f.getName() + " 디렉토리? : " + f.isDirectory());
		System.out.println(f.getName() + " 파일? : " + f.isFile());
		System.out.println(f.getName() + " 숨김? : " + f.isHidden());
		System.out.println(f.getName() + " 바이트 크기 : " + f.length());
		System.out.println(f.getName() + " 마지막 수정날짜(millisecond) : " + f.lastModified());
		
		f = new File("/Users/heeminchun/Desktop");
		String[] fileList = f.list();
		for(int i = 0; i < fileList.length; i++) {
			System.out.println(fileList[i]);
		}

		System.out.println("\n====listFiles()====");
		File[] fList = f.listFiles();
		for(int i = 0; i < fList.length; i++) {
			System.out.println(fList[i] + "\t" + fList[i].isHidden());
		}
		
		f = new File("/Users/heeminchun/Desktop/newFolder");
		f.mkdir();
		
		f = new File("/Users/heeminchun/Desktop/newFolder/sample");
		f.mkdir();
		
		f = new File("/Users/heeminchun/Desktop/newFolder/sample2");
		f.mkdir();
		
		new File("Users/heeminchun/Desktop/newFolder/sample2").delete();
	}
}
