package com.kh.exam1.client;

import java.io.IOException;
import java.net.*;
import java.util.*;

public class Sample1_C {
	
	public static Scanner sc = new Scanner(System.in);

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
		
		byte[] ip = new byte[] {127, 0, 0, 1};
		InetAddress serverIp = null;
		
		try {
			serverIp = InetAddress.getByAddress(ip);
			
			// UDP 소켓 생성 _ 랜덤 포트 사용
			DatagramSocket dSocket = new DatagramSocket();
			
			while(true) {
				// 수신 잘 받았음을 클라이언트에 송신
				System.out.println(">>> ");
				String send = sc.nextLine();
//				String send = "Hello Server";
				DatagramPacket dPacket = new DatagramPacket(send.getBytes(), send.getBytes().length, 
						serverIp, 51000);
				dSocket.send(dPacket);
							
				// 수신 대기 _ DatagramPacket 필요
//				byte[] buffer = new byte[512];
//				dPacket = new DatagramPacket(buffer, buffer.length);
//				System.out.println("서버에 메세지를 전송했습니다. 서버로부터의 응답을 기다립니다.");
//				dSocket.receive(dPacket);
				
				// 수신 받은 메시지를 문자열로 변환
//				String recv = new String(dPacket.getData(), 0, dPacket.getLength());
//				System.out.println("[" + dPacket.getAddress() + ":" + dPacket.getPort() + "]");
//				System.out.println(recv);
			}
		
			
		} catch (SocketException e) {
			// DatagramSocket 사용 위해 필요
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// InetAddress.getByAddress(ip) 사용하기 위해 필요x
			e.printStackTrace();
		}catch (IOException e) {
			// receive 사용 위해 필요
			e.printStackTrace();
		}

	}

}
