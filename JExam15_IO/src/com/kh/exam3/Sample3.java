package com.kh.exam3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Sample3 {

	public static void main(String[] args) {
		/*
		 *  FileReader / FileWriter
		 *  	- 파일로부터 문자 단위의 데이터 읽기 / 쓰기
		 *  	- 주로 텍스트 파일에 대한 처리를 담당
		 */
		
		try {
			File f = new File("/Users/heeminchun/Desktop/Sample.txt");
			FileReader fr = new FileReader(f);
			int read;
			char[] cArr = new char[4];
			// 4바이트씩 끊어서 -1이 들어오지 않을때까지 계속 돌리기 때문에
			// abc def ab 라는 문자열이 있다면
			// "abc " 이렇게 공백포함 4글자니까 한번 이렇게 출력되고 
			// 그다음이 "def " 이렇게 그다음이 "ab"인데 4개가 되려면 2글자가 남는다. 
			// 따라서 앞에있던 문자들까지 해서 4글자 즉 "f ab"이렇게 출력된다.
//			while((read = fr.read(cArr)) != -1) {
//				System.out.print(cArr);
//			}
			String str = "";
			StringBuffer sb = new StringBuffer();
			while((read = fr.read(cArr)) != -1) {
				str += new String(cArr, 0, read);
				sb.append(cArr, 0, read);
//				if(cArr.length == read) {
//					str += new String(cArr); // String은 char[] 자료형을 String으로 만들어주는생성자가 있다
//					sb.append(cArr);
//				} else {
//					for(int i = 0; i < read; i++) {
//						str += cArr[i];
//						sb.append(cArr[i]);
//					}
//				}
				
			}
			System.out.println(str);
			System.out.println(sb.toString());
			fr.close();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFound Error");
		} catch (IOException e) {
			System.out.println("IOException Error");
		} 
		
		// 파일 쓰기
//		try {
//			File f = new File("/Users/heeminchun/Desktop/Sample.txt");
//			FileWriter fw = new FileWriter(f);
//			fw.write("파일에 문자열 쓰기");
//			fw.close();
//		} catch (FileNotFoundException e) {
//			System.out.println("FileNotFound Error");
//		} catch (IOException e) {
//			System.out.println("IOException Error");
//		} 
		
	}

}
