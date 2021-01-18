package com.kh.exam2.server;

import java.io.*;
import java.net.*;

public class Server {

	public static void main(String[] args) {
		try {
			String recv = "";
			char[] buffer = new char[512];
			
			// 서버 소켓 생성 _ 포트 바인딩 _ TCP LISTEN 상태
			ServerSocket sSocket = new ServerSocket(51000);
			
			// 클라이언트의 접속 요청 올때까지 대기. 요청 오면 승인하고 새로운 소켓을 생성
			Socket sock = sSocket.accept();
			System.out.println("접속 클라이언트 정보 : " + sock.getInetAddress() + ":" + sock.getPort());
			
			// 통신용 입출력 스트림 생성
			BufferedReader sockIn = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			BufferedWriter sockOut = new BufferedWriter(new OutputStreamWriter(sock.getOutputStream()));
			
			while(true) {
				if(sockIn.ready()) {
					int len = sockIn.read(buffer);
					recv = new String(buffer, 0, len);
					System.out.println("[" + sock.getInetAddress() + ":" + sock.getPort() + "]" 
							+ recv);
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}