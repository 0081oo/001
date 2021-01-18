package com.kh.exam5;

import java.util.*;

public class Sample5 {

	public static void main(String[] args) {
		
		HashSet<String> hset = new HashSet<>();
		
		hset.add("A");
		hset.add("B");
		
		
		// hashSet을 String 배열로 변환
		String[] sArr = new String[hset.size()];
		hset.toArray(sArr);
		
		// HashSet을 ArrayList로 변환
		sArr = new String[hset.size()];
		hset.toArray(sArr);
		
		ArrayList<String> al = new ArrayList<>(Arrays.asList(sArr));
		System.out.println(al.get(1));
		
		// 삭제
		hset.remove("A");
		System.out.println(hset);
		
		
		/*
		 *  LinkedHashSet
		 *  	- 추가된 데이터의 순서를 유지해준다. 일반 해쉬셋은 그렇게 안됨!
		 */
		
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("A"); lhs.add("B"); lhs.add("C"); lhs.add("D");
		System.out.println(lhs);
		
		// iterator methos
		Iterator<String> itor = lhs.iterator();
		// itor.hasNext() : 반복 할 객체가 있는지 확인
		while(itor.hasNext()) {
			// itor.next()객체를 추출
			System.out.println("iterator : " + itor.next());
		}
		
		/*
		 *  TreeSet
		 *  	- 정렬기능 추가된 Set 객체
		 *  	- HashSet 보다 성능상 느리지만 객체 추가와 동시에 정렬이 이루어 진다.
		 */
		TreeSet<String> ts = new TreeSet<>();
		ts.add("C"); ts.add("E"); ts.add("A"); ts.add("O"); ts.add("G");
		System.out.println(ts);
		System.out.println(ts.descendingSet());
		
		System.out.println("Ascending Order : ");
		for(String s:ts) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		System.out.println("Descending Order : ");
		for(String s:ts.descendingSet()) {
			System.out.print(s + " ");
		}
		System.out.println();
		
	}

}
