package com.kh.exam6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Sample6 {

	public static void main(String[] args) {
		/*
		 *  Map
		 *  	- 키와 값의 쌍으로 구성된 객체를 저장 ( key, value 둘 다 객체이다)
		 *  	- 키는 중복 안되고 값은 중복 가능
		 *  	- 사전과 같은 형태의 자료구조
		 *  	- HashMap, Hashtable, LinkedHashMap, TreeMap 
		 */
		
		// HashMap
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("A", 100);
		hm.put("B", 200);
		hm.put("C", 300);
		hm.put("D", 400);
		System.out.println(hm);
		
		// 수정 (동일한 키 사용)
		hm.put("A", 150);
		System.out.println(hm);
		
		// Search
		System.out.println(hm.containsKey("C"));
		System.out.println(hm.containsValue(160));
		
		// 키 값 쌍 추출
		System.out.println(hm.entrySet());
		
		Set<Map.Entry<String, Integer>> entry = hm.entrySet();
		for(Map.Entry<String, Integer> m : entry) {
			System.out.println(m.getKey() + "|" + m.getValue());
		}
		
		// 키만 추출
		System.out.println(hm.keySet());
		// 값만
		System.out.println(hm.values());
		
		Set<String> keys = hm.keySet();
		System.out.println(keys);
		
		// ArrayList 생성자중에 콜랙션을 넣을 수 있는 생성자가 있다
		ArrayList<Integer> values = new ArrayList<Integer>(hm.values());
		System.out.println(values);

		// size
		int res = hm.size();
		
		// remove
		int res2 = hm.remove("A");
		System.out.println(hm + "|" + res2);
		
		// Properties
		// 		- 키와 값의 데이터 타입을 String 으로 제한되어 있다.
		// 		- 프로퍼티 파일에 대한 데이터 처리를 할 때 주로 사용
		//		  프로퍼티 파일 : 특정 프로그램이 동작할 때 추가로 적용 또는 기본적으로 적용된 속성이 저장된 파일
		
		Properties prop = new Properties();
		// insert, modify
		prop.setProperty("A", "10");
		prop.setProperty("B", "20");
		System.out.println(prop);
		
		//Search
		System.out.println(prop.getProperty("A"));
		
		
		// 파일로 저장
		try {
			prop.store(new FileWriter(new File("/Users/heeminchun/Desktop/program.ini")), "Property File");
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		// 저장된 프로퍼티 불러오기
		try {
			prop.load(new FileReader(new File("/Users/heeminchun/Desktop/program.ini")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(prop);
	}

}
