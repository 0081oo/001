package com.kh.exam3;

import java.util.Date;
// import java.lang.String;

public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("");
		
		Date stDate = new Date();
		int max = 9999999;
		
		for(int i = 0; i < max; i++) {
			s1 += "1";
		}
		Date edDate = new Date();
		
		System.out.println("문자열 + 연산 : " + ((long)edDate.getTime()  - (long)stDate.getTime()));
		
		
		stDate = new Date();
		
		String s2 = new String("");
		for(int i = 0; i < max; i++) {
			s1.concat("1");
		}
		
		edDate = new Date();
		
		System.out.println("문자열 concat 이용 : " + ((long)edDate.getTime()  - (long)stDate.getTime()));
	}

}
