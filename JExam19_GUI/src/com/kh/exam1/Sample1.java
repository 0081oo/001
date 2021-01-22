package com.kh.exam1;

/*
 *  GUI
 *  	- 사용자가 프로그램을 편하게 사용할 수 있도록 그래픽으로 처리된 인터페이스를 제공할 수 있게 만들어진 라이브러리
 *  	- Java에서 제공하는 GUI 라이브러리 : AWT, Swing, JavaFx, etc....
 *  
 *  컨테이너
 *  	- 윈도우의 창과 같은 역할 수행
 *  	- 다양한 컴포넌트들이 배치가 된다
 *  
 *  컴포넌트
 *  	- 컨테이너에 배치되어 화면을 구성할 요소들
 *  	- 버튼, 텍스트 입력, 라벨, 체크박스, 라디오버튼..
 *  
 *  레이아웃
 *  	- 컨테이너에 컴포넌트를 배치하는 방법에 대한 정의가 되어 있는 요소
 *  	- FlowLayout, GridLayout, BorderLayout etc..
 */

import java.awt.*;

import javax.swing.JButton;
import javax.swing.*;

class MainWindow{
	private JFrame f;
	
	public MainWindow() {
		init();
	}
	
	private void init() {
		// 초기 설정
		this.f = new JFrame("Main Window");
		this.f.setSize(300,250);
		// 창 닫기 버튼 누르면 창도 닫히고 프로그램 자체도 종료됨
		this.f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		// 레이아웃 설정 : 왼쪽에서 오른쪽방향으로 컴포넌트 배치
//		this.f.setLayout(new FlowLayout(FlowLayout.LEFT));
		this.f.setLayout(null); // 레이아웃 사용하지 않고 자유배 할때
		
		// 컴포넌트 생성
		JButton btn = new JButton("BUTTON");
		// 			  x  y width  height  레이아웃을 사용하지 않을때 컴포넌트 위치 및 크기설정
		btn.setBounds(0, 0, 75, 25);
		JLabel lbl = new JLabel("LABEL");
		lbl.setBounds(0, 30, 75, 25);
		JTextField txt = new JTextField("TEXT");
		txt.setBounds(0, 60, 75, 25);
		
		// 생성한 컴포넌트를 컨테이너에 배치 : 레이아웃 설정에 맞추어 배치 됨
		this.f.add(btn);
		this.f.add(lbl);
		this.f.add(txt);
		
		// 컴포넌트의 텍스트 변경
		btn.setText("확인");
		lbl.setText("텍스트를 변경하였습니다.");
		txt.setText("데이터를 입력하세요");
		
		// 컴포넌트의 텍스트 추출
		btn.getText();
		lbl.getText();
		txt.getText();
		
	}
	
	public void show() {
		this.f.setVisible(true);
	}
}

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainWindow w = new MainWindow();
		w.show();
	}

}
