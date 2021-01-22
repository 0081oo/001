package com.kh.exam2;

import java.net.*;
import javax.swing.*;

/*
 *  GUI 사용하여 자신의 pc의 Ip주소를 라벨에 출력하여 보여주는 프로그램
 */

class MainWindow{
	// 프레임 컨테이너 참조변수 생성
	private JFrame f;
	
	// 프레임에 배치할 라벨 컴포넌트 참조변수 생성
	private JLabel lbl_Ip;
	
	// 기본 생성자
	public MainWindow() {
		init();
	}
	
	public void init() {
		f = new JFrame("나의 IP주소");
		
		// 박스 레이아웃 : Y_AZIS : 세로축 방향으로 나열
		f.setLayout(new BoxLayout(f.getContentPane(), BoxLayout.Y_AXIS));
		
		f.setSize(250,100);
		
		lbl_Ip = new JLabel();
		f.add(lbl_Ip);
		
	}
	
	// 라벨에 텍스트를 설정하기 위한 메소드
	public void setlabelIp(String ip) {
//		lbl_Ip.setText(ip);
		// 라벨에 텍스트 설정
		lbl_Ip.setText("IP Address : " + ip);
	}
	
	// 프레임은 가시화 되어 있지 않기 때문에 가시화 시켜주기 위한 메소드
	public void show() {
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}

public class Sample2 {

	public static void main(String[] args) {
		MainWindow w = new MainWindow();
		
		try {
			String myIp = InetAddress.getLocalHost().getHostAddress();
			w.setlabelIp(myIp);
		} catch (UnknownHostException e) {
			
		}
		
		w.show();

	}

}
