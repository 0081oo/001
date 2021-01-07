package com.kh.exam2;

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// StringBuffer / STringBuilder
		// 		- 두 클래스의 기능은 동일하나 Thread Safe 기능의 차이만 있다
		//		- 16 문자를 처리하기 위한 크기로 생성(버퍼크기가 16 문자를 처리할 수 있는 크기로 생성)
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append("First StringBuilder");
		System.out.println(sb1);
		
		// String의 경우 앞에 뭘 추가하면 아얘 새로운 메모리에 새롭게 문자열이 생긴다.
		// 반면 이 경우는 그대로 주소고 앞에 추가되는것
		sb1.insert(0, "My");
		System.out.println(sb1);
		
		sb1.insert(2, " ");
		System.out.println(sb1);
		
//		sb1.delete(3, 9);
//		System.out.println(sb1);
		
		String find = "String";
		int startIdx = sb1.indexOf("First");
		System.out.println(sb1.indexOf("First"));
		sb1.delete(startIdx, startIdx + "First".length());
		System.out.println(sb1);
		
		find = "Builder";
		startIdx = sb1.indexOf(find);
		sb1.replace(startIdx, startIdx + find.length(), "StringBuilder");
		System.out.println(sb1);
		
	}

}
