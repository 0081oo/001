package com.kh.exam6;

/*
 *  계산기 레이아웃 만들기
 */

import java.awt.*;
import javax.swing.*;

class CalcWindow{
	private JFrame frm;
	
	public CalcWindow() {
		init();
	}
	
	private void init() {
		frm = new JFrame("Calculator");
		frm.setSize(400, 500);
		frm.setLayout(new BorderLayout());
		
		JPanel inputWindow = new JPanel();
		JPanel middleButton = new JPanel(new GridLayout(1,6));
		JPanel buttonWindow = new JPanel(new GridLayout(6,4));
		
		frm.add(inputWindow, BorderLayout.NORTH);
		frm.add(middleButton, BorderLayout.SOUTH);
		frm.add(buttonWindow, BorderLayout.CENTER);
		
		// setPreferedSize로 컴포넌트 사이즈를 변경해주면 BorderLayout의 크기는 알아서변함
		JTextField txt = new JTextField();
		txt.setPreferredSize(new Dimension(390, 100));
		inputWindow.add(txt);
		
		// 기능버튼
		middleButton.add(new Button("MC"));
		middleButton.add(new Button("MR"));
		middleButton.add(new Button("M+"));
		middleButton.add(new Button("M-"));
		middleButton.add(new Button("MS"));
		middleButton.add(new Button("M-"));
	
		// 연산버튼
		buttonWindow.add(new Button("%"));
		buttonWindow.add(new Button("√"));
		buttonWindow.add(new Button("x²"));
		buttonWindow.add(new Button("1/x"));
		
		buttonWindow.add(new Button("CE"));
		buttonWindow.add(new Button("C"));
		buttonWindow.add(new Button("del"));
		buttonWindow.add(new Button("/"));
		
		buttonWindow.add(new Button("7"));
		buttonWindow.add(new Button("8"));
		buttonWindow.add(new Button("9"));
		buttonWindow.add(new Button("*"));
		
		buttonWindow.add(new Button("4"));
		buttonWindow.add(new Button("5"));
		buttonWindow.add(new Button("6"));
		buttonWindow.add(new Button("-"));
		
		buttonWindow.add(new Button("1"));
		buttonWindow.add(new Button("2"));
		buttonWindow.add(new Button("3"));
		buttonWindow.add(new Button("+"));
		
		buttonWindow.add(new Button("±"));
		buttonWindow.add(new Button("0"));
		buttonWindow.add(new Button("."));
		buttonWindow.add(new Button("="));
		
		
		
	}
	
	public void show() {
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setResizable(false);
		frm.setVisible(true);
	}
}

public class Sample6 {

	public static void main(String[] args) {
		CalcWindow w = new CalcWindow();
		w.show();

	}

}
