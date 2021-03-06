package com.kh.exam2.client;

import java.io.*;
import java.net.*;
import java.util.*;

public class Client {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		try {
			String recv = "", send = "";
//			char[] buffer = new char[512];
			
			// 서버 접속용 소켓 생성. 127.0.0.1은 서버의 주소! (통신하고자 하는 서버의 주소)
			// 51000도 서버가 열어두고 있는 포트이다. 
			Socket sock = new Socket("127.0.0.1", 51000);
			
			// 통신용 입출력 스트림 생성
			BufferedReader sockIn = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			BufferedWriter sockOut = new BufferedWriter(new OutputStreamWriter(sock.getOutputStream()));
			
			while(true) {
				System.out.print("Client > ");
				send = sc.nextLine();
				
				// 출력 스트림을 사용하여 서버에 메시지 전송
				sockOut.write(send);
				
				// 버퍼에 쌓여있는 문자열을 즉시 전송하기 위해 사용
				sockOut.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
