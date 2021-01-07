package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	public TokenController() {}
	
	public String afterToken(String str) {
		StringTokenizer st = new StringTokenizer(str, " ");
		boolean isFirst = true;
		String result = st.nextToken();
		
		while(st.hasMoreTokens()) {
			if(isFirst) {
				isFirst = false;
				continue;
			}
			else result += st.nextToken();
		}
		return result;
	}
	
	// 첫문자만 대문자로 Capitalize
	public String firstCap(String input) {
		String firstString = input.substring(0, 1);
		String remain = input.substring(1, input.length());
		firstString = firstString.toUpperCase();
		return firstString + remain;
	}
	
	public int findChar(String input, char one) {
		int count = 0;
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == one) count++;
		}
		return count;
	}
	
}
