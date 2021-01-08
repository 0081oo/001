package com.kh.exam2;

import java.io.*;

/*
 *  사용자 정의 Exception 만들기
 */

class NegativeException extends Exception{
	public NegativeException() {}
	public NegativeException(String msg) {
		super(msg);
	}
	
	@Override
	public String getMessage() {
		return "음수 값을 사용하면 안됩니다";
	}
}

class NegativeExceptionCheck{
	public void check(int i) throws NegativeException{
		if(i < 0) throw new NegativeException();
	}
}

class SamClass{
	public int sum(int x, int y) /*throws NegativeException*/ {
		try {
			new NegativeExceptionCheck().check(x);
			new NegativeExceptionCheck().check(y);
		}
		catch(NegativeException e) {
			e.printStackTrace();
			return -1;
		}
		
		return x + y;
	}
}

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SamClass sa = new SamClass();
		int res = 0;
//		try {
			res = sa.sum(10, 20);
//		}
//		catch (NegativeException e) {
//			e.printStackTrace();
//		}
		System.out.println("Result : " + res);
	}

}
