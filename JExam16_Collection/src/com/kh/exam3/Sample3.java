package com.kh.exam3;

import java.util.*;

public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  List 계열
		 *  	- 순서 유지 및 중복 저장이 가능한 컬랙션
		 *  	- ArrayList, Vector, LinkedList가 있다.
		 */
		
		ArrayList<Integer> lst = new ArrayList<>();
		
		// 데이터 추가
		lst.add(10);
		lst.add(20);
		lst.add(30);
		System.out.println(lst);
		
		lst.add(1,15); // 1번 인덱스에 15 추가
		System.out.println(lst);
		
		lst.add(3, 25);
		System.out.println(lst);
		
		lst.add(lst.size(), 35); // 마지막 인덱스에 35 추가
		System.out.println(lst);
		
		// 데이터 수정
		lst.set(0, 12);
		System.out.println(lst);
		
		// 데이터 검색
		System.out.println(lst.get(0));
		System.out.println("12의 위치값 : " + lst.indexOf(12));
		System.out.println("32는 존재하나요? : " + lst.contains(32));
		
		System.out.println("빈 컬렉션인가요? : " + lst.isEmpty());
		
		// 데이터 삭제
/*		lst.remove(0);
		lst.remove(1);
		lst.remove(lst.indexOf(30));
		System.out.println(lst);
		
		lst.remove(new Integer(15)); // 이거 주의. 객체화 해주어야 함
		System.out.print(lst);
*/		
		
		// 리스트 분할
		System.out.println(lst.subList(0, 4)); // 0에서 4번 전까지
		
		// 리스트의 마지막 요소는 뺴고 반복 (for-each 반복)
		for(int x : lst.subList(0, lst.size()-1)) {
			System.out.print(x + " ");
		}
		
		System.out.println();
		// 리스트의 첫 요소는 빼고 반복
		for(int x : lst.subList(1, lst.size())) {
			System.out.print(x + " ");
		}
	}

}
