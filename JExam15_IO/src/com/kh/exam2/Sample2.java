package com.kh.exam2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sample2 {

	public static void main(String[] args) {
		/*
		 *  FileInputStream
		 *  	- 바이트 단위로 파일을 읽기
		 *  	- 주로 그림, 오디오, 비디오 등과 같은 파일을 읽기위해 사용
		 */
		
		
		// 파일을 읽기 위한 반복문 변형
		
		try {
//			FileInputStream fis = new FileInputStream("/Users/heeminchun/Desktop/Sample.txt");
			File f = new File("/Users/heeminchun/Desktop/Sample.txt");
			FileInputStream fis = new FileInputStream(f);
			int read;
//			while(true) {
//				read = fis.read();
//				if(read == -1) break; // 읽은 바이트가 -1이 되면 읽을 데이터가 없다는 뜻
//				System.out.println((char)read); //딱 1바이트만 읽어온다
//
//			}
			
			while((read = fis.read()) != -1) {
//				System.out.println((char)read); //딱 1바이트만 읽어온다

			}
			fis.close();

		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException 에러 발생");
		} catch (IOException e) {
			System.out.println("IOException 에러 발생");
		}
		
		// 파일을 읽기 위한 방법으로 배열을 사용
		// 배열의 크기만큼 데이터를 읽고 처리
		try {
			File f = new File("/Users/heeminchun/Desktop/Sample.txt");
			FileInputStream fis = new FileInputStream(f);
			int read;
			byte[] bArr = new byte[10];
			while ((read = fis.read(bArr)) != -1) {
				System.out.write(bArr); // write 사용하면 byte 배열 출력 가능
			}
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFound Error");
		} catch (IOException e) {
			System.out.println("IOException Error");
		}
	
		/*
		 *  FileOutputStream
		 *  	- 파일에 바이트 단위로 데이터를 저장
		 *  	- 주로 그림, 오디오, 비디오 등과 같은 파일의 쓰기를 위해 사용
		 */
		
		try {
			File f = new File("/Users/heeminchun/Desktop/Sample.txt");
//			FileOutputStream fos = new FileOutputStream(f);	// 기존 파일 내용을 덮어쓴다
			FileOutputStream fos = new FileOutputStream(f, true); // 기존 파일 내용 마지막에 이어쓴다
			byte[] bArr = new byte[] {66, 67, 68, 69};
			fos.write(bArr);
			fos.close();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFound Error");
		} catch (IOException e) {
			System.out.println("IOException Error");
		}
		
	}

}
