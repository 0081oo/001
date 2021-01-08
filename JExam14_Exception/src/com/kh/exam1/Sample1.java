package com.kh.exam1;

import java.io.*;

/*
 *  throws
 *  	- 예외 처리하는 것을 상위 메소드에 미루는 의미를 가지지만
 *  	  예외가 발생한다는 것을 상위 메소드에 알려서 올바른 코드를 작성할 수 있도록 명시하는 목적도 있다.
 *  
 *  throw
 *  	- 강제로 예외를 발생 시키기 위해 사용
 *  	- 데이터 확인(Check)를 통해 사용할 수 없는 형식의 데이터가 생성된 경우
 *   	  강제로 예외를 발생 시켜서 올바른 데이터가 입력될 수 있게 만든다.
 */

class SamClass{
	public int division(int x, int y) throws ArithmeticException{
		return x / y;
	}
}

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SamClass sa = new SamClass();
		try {
			int res = sa.division(10, 1);
			System.out.println("Result : "+ res);
			return;
		} 
//		catch(IOException e)
		catch(ArithmeticException e) {
//			e.printStackTrace(); // Error 출력해줘라
			System.out.println("0으로 나눌 수 없습니다.");
		}
//		finally {
//			System.out.println("Exception 발생 유무 따지지 않고 무조건 실행");
//		}
		
		System.out.println("Try에 return 존재하고 예외발생 하지 않으면 이 구문 실행안됨. 그래서 finally 사용.");
	}

}
