package com.kh.exam4;

import java.awt.*;
import javax.swing.*;

/*
 *  layout
 *  	- 컴포넌트 배치 위한 방법이 정의된 것
 *  
 * 	FlowLayout
 * 		- 컴포넌트를 배치할 때 왼쪽에서 오른쪽으로 순차배치 or 오른쪽에서 왼쪽으로 순차배치
 * 		- 가운데에 컴포넌트가 위치하도록 배치
 * 		- 창의 크기를 넘기는 컴포넌트들이 사용되면 다음줄로 자동배치
 * 
 *  BorderLayout
 *  	- 컨테이너의 영역을 동 서 남 북 중앙 다섯개의 영역으로 나누어 컴포넌트를 배치
 *  
 *  GridLAyout
 *  	- 주어진 row, col 크기로 컨테이너 영역을 나누어 컴포넌트를 배치
 *  
 *  BoxLayout
 *  	- 컴포넌트를 가로 또는 세로 방향으로 배치
 *  	- 영역을 채우는 형태로 배치
 *  
 *  CardLayout
 *  	- 여러장의 카드를 겹쳐놓은 형태로 컴포넌트를 배치
 *  
 *  GridBagLayout
 *  	- GridLayout과 동일하나 여러 셀을 차지하는 형태로 구성을 할 수 있다
 */

class FlowWindow{
	private JFrame frm_main;
	
	public FlowWindow() {
		init();
	}
	
	private void init() {
		frm_main = new JFrame("FlowLayout Window");
		frm_main.setSize(250,100);
//		frm_main.setLayout(new FlowLayout(FlowLayout.LEFT)); // left->right
//		frm_main.setLayout(new FlowLayout(FlowLayout.RIGHT));
		//												컴포넌트 사이 수평간격, 수직간격
		frm_main.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		
		frm_main.add(new JButton("button1"));
		frm_main.add(new JButton("button2"));
		frm_main.add(new JButton("button3"));
		frm_main.add(new JButton("button4"));
		frm_main.add(new JButton("button5"));
	}
	
	public void show() {
		frm_main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm_main.setVisible(true);
	}
}


class BorderWindow{
	private JFrame frm_main;
	
	public BorderWindow() {
		init();
	}
	
	private void init() {
		frm_main = new JFrame("BorderLayout Window");
		frm_main.setSize(250,100);
//		frm_main.setLayout(new FlowLayout(FlowLayout.LEFT)); // left->right
//		frm_main.setLayout(new FlowLayout(FlowLayout.RIGHT));
		//												컴포넌트 사이 수평간격, 수직간격
		frm_main.setLayout(new BorderLayout());
		
		frm_main.add(new JButton("button1"), BorderLayout.NORTH);
		frm_main.add(new JButton("button2"), BorderLayout.EAST);
		frm_main.add(new JButton("button3"), BorderLayout.SOUTH);
		frm_main.add(new JButton("button4"), BorderLayout.WEST);
		frm_main.add(new JButton("button5"), BorderLayout.CENTER);
	}
	
	public void show() {
		frm_main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm_main.setVisible(true);
	}
}

// 여러 레이아웃 사용하기 : 컨테이너에 컨테이너를 추가하여 사용
class BorderFlowWindow{
	private JFrame frm_main;
	
	public BorderFlowWindow() {
		init();
	}
	
	private void init() {
		frm_main = new JFrame("BorderFlowLayout Window");
		frm_main.setSize(350,100);
		frm_main.setLayout(new BorderLayout());
		
		// Panel 컨테이너 추가
		// Panel 이 NORTH에 생기고 그 안에 버튼 1-1 애들이 FlowLayout 형태로 생긴다
		JPanel pan = new JPanel();
		pan.setLayout(new FlowLayout(FlowLayout.LEFT));
		frm_main.add(pan, BorderLayout.NORTH);
		pan.add(new JButton("Button 1-1"));
		pan.add(new JButton("Button 1-2"));
		pan.add(new JButton("Button 1-3"));
		
//		frm_main.add(new JButton("button1"), BorderLayout.NORTH);
		frm_main.add(new JButton("button2"), BorderLayout.EAST);
		frm_main.add(new JButton("button3"), BorderLayout.SOUTH);
		frm_main.add(new JButton("button4"), BorderLayout.WEST);
		frm_main.add(new JButton("button5"), BorderLayout.CENTER);
	}
	
	public void show() {
		frm_main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm_main.setVisible(true);
	}
}


class GridWindow{
	private JFrame frm_main;
	
	public GridWindow() {
		init();
	}
	
	private void init() {
		frm_main = new JFrame("GridLayout Window");
		frm_main.setSize(250,100);
		frm_main.setLayout(new GridLayout(2, 3)); // 2행 3열로 버튼배열
		
		frm_main.add(new JButton("button1"));
		frm_main.add(new JButton("button2"));
		frm_main.add(new JButton("button3"));
		frm_main.add(new JButton("button4"));
		frm_main.add(new JButton("button5"));
	}
	
	public void show() {
		frm_main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm_main.setVisible(true);
	}
}


public class Sample4 {

	public static void main(String[] args) {
//		FlowWindow flow = new FlowWindow();
//		flow.show();
		
//		BorderWindow br = new BorderWindow();
//		br.show();
		
//		BorderFlowWindow bf = new BorderFlowWindow();
//		bf.show();
		
		GridWindow gw = new GridWindow();
		gw.show();

	}

}
