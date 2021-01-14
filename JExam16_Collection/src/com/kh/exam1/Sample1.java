package com.kh.exam1;

/*
 *  Generic
 *  	- <E>	: Element 약자. 컬랙션에 저장할 데이터 타입
 *  	- <T>	: Type 약자. 데이터 타입
 *  	- <K, V>: Key, Value. 컬랙션 map 자료에 저장할 데이터 타입
 *  	- <N>	: Number. 숫자와 관련된 데이터 타입
 *  	- <?>	: 와일드 카드. 타입 제한 없음
 *  	- <? extends T> : T 타입과 T 타입의 파생 타입만 사용
 *  	- <? super T>	: T 타입과 T 타입의 상위 타입만 사용  
 */


import java.util.*;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> intList = new ArrayList<>();
		ArrayList<String> strList = new ArrayList<>();
		
		intList.add(1);
		intList.add(10);
		strList.add("heemn");
		
		System.out.println("전체 데이터 : " + intList.toString() + ", 0번째 데이터 : " +  intList.get(0));
	}

}
