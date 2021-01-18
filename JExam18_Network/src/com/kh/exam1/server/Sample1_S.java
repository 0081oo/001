package com.kh.exam1.server;

import java.io.IOException;
import java.net.*;

public class Sample1_S {

	public static void main(String[] args) {
		/*
		 *  UDP
		 *  Server						Cliect
		 *  	1. 소켓생성					1. 소켓생성
		 *  	2. 포트 바인딩					2. 포트 바인딩(옵션)
		 *  	3. 수신 대기					3. 송신
		 *  	4. 송신(필요한 경우)			4. 수신대기
		 *  	5. 3-4 과정 반복				5. 3-4 과정 반복
		 *  	6. 종료						6. 종료
		 */
		
		// UDP 소켓 생성 _ 생성과 동시에 51000번 포트에 바인딩
		try {
			DatagramSocket dSocket = new DatagramSocket(51000);
			
			while(true) {
				// 수신 대기 _ DatagramPacket 필요
				byte[] buffer = new byte[512];
				DatagramPacket dPacket = new DatagramPacket(buffer, buffer.length);
				System.out.println("서버 동작 완료. 수신 대기중 입니다.");
				dSocket.receive(dPacket);
				
				// 수신 받은 메시지를 문자열로 변환
				String recv = new String(dPacket.getData(), 0, dPacket.getLength());
				System.out.println("[" + dPacket.getAddress() + ":" + dPacket.getPort() + "]");
				System.out.println(recv);
				
				// 수신 잘 받았음을 클라이언트에 송신
//				String send = "수신 완료";
//				dPacket = new DatagramPacket(send.getBytes(), send.getBytes().length, 
//						dPacket.getAddress(), dPacket.getPort());
			}
		} catch (SocketException e) {
			// DatagramSocket 사용 위해 필요
			e.printStackTrace();
		} catch (IOException e) {
			// receive 사용 위해 필요
			e.printStackTrace();
		}
		

	}

}
