package com.kh.exam1;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  Wrapper 클래스
		 *  	- 기본 데이터 타입을 객체화 해주는 클래스
		 *  	- 객체로 감싸서(Wrapper) 사용할 수 있도록 한다.
		 */
		
		String str;
		
		// 문자열을 기본 자료형으로 변환
		str = "65";
		byte b = Byte.parseByte(str);
		short s = Short.parseShort(str);
		int i = Integer.parseInt(str);
		long l = Long.parseLong(str);
		float f = Float.parseFloat(str);
		double d = Double.parseDouble(str);
		boolean bool = Boolean.parseBoolean(str);
		char c = str.charAt(0);
		
		// 기본 자료형을 문자열로 변환
		str = Byte.valueOf(b).toString(); // 바이트 자료형을 바이트 객체화 후 문자열로 변환
		str = Character.valueOf(c).toString();
		// 다른 자료형도 형식 동일
		
		// 기본 데이터를 객체화 하는 방법
		Integer num1 = new Integer(10); //Boxing
		Integer num2 = 20; //Auto Boxing
		
		// 객체화된 데이터를 기본 데이터로 만드는 방법
		int num3 = num1.intValue(); //Unboxing
		int num4 = num2; // Auto Unboxing
	}

}
