package com.kh.exam2;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  StringBuilder의 replace 메소드 활용
		 *  	- StringBuilder의 replace는 지정된 범위에서 문자열을 변경하는 메소드로 동작한다.
		 *  	- String의 replace는 target으로 지정한 문자열을 replacement로 지정한 문자열로 전부 변경한다.
		 *  
		 *  StringBuilder의 replace가 String의 replace처럼 동작할 수 있도록 반복문을 활용하여 문자열 변경되게 하라.
		 */
		
		/*
		 *  1. target 문자열을 설정한다.
		 *  2. replacement 문자열을 설정한다.
		 *  3. target 문자열의 위치를 찾는다.
		 *  4. target 문자열의 위치부터 문자열 길이만큼 replacement로 변경한다.
		 *  5. replacement로 변경한 위치 이후부터 다시 target문자열의 위치를 찾는다.
		 *  6. 3~5번의 과정을 계속 반복하며, indexOf의 결과가 -1이 나오면 종료한다.
		 *  
		 */
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append("First Builder Builder");
		
		System.out.println(sb1);
		
		String target = "Builder";
		String replace = "StringBuilder";
		
		int startIdx = sb1.indexOf(target);
		while(startIdx != -1) {
			sb1.replace(startIdx, startIdx + target.length(), replace);
			//5번과정
			startIdx = sb1.indexOf(target, startIdx + replace.length());
		}
		System.out.println(sb1);
		
		
		

	}

}
