package com.kh.exam7;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

/*
 *  이벤트(Event)
 *  	- 키보드나 마우스를 이용해 클릭과 움직임등의 동작
 *  	- 이벤트가 발생했을 때 이를 처리하기 위한 객체로 Event Listener 
 *  	  또는 Event Adapter 사용
 *  	- 대표적인 이벤트 종류
 *  			ActionEvent : 컴포넌트가 활성화될때 발생하는 이벤트
 *  			ContainerEvent : 컨테이너에 컴포넌트가 추가/삭제될때 발생
 *  			FocusEvent : 컴포넌트에 포커스가 들어오거나 나갈때 발생하는 이벤트
 *  			MouseEvent : 마우스를 움직이거나 클릭할때 발생하는 이벤트
 *  			KeyEvent : 키보드 입력에 의해 발생하는 이벤트
 *  			WindowEvent : 윈도우 창을 열거나 닫을 때 (활성/비활성화) 발생하는 이벤트
 *  
 *  EventListener
 *  	- 발생된 이벤트를 실질적으로 처리하기 위한 코드가 들어간다.
 *  	- 인터페이스로 구현되어있다. 그래서 하나의 기능이라도 안쓰고 싶더라도 재정의는 무조건 해줘야함
 *  	- 그래서 특정 메소드만 구현하고 싶다면 EventAdapter 사용하면 됨
 *  
 *  EventAdapter
 *  	- 발생된 이벤트를 실질적으로 처리하기 위한 코드가 들어간다.
 *  	- 리스너를 상속받아 추상클래스로 구현되어 있다.
 */

class EventWindow1{
	private JFrame frm_main;
	private JLabel lbl_print;
	private JButton btn_event;
	
	public EventWindow1() {
		init();
		addEvent();
	}
	
	private void init() {
		frm_main = new JFrame("Event Test");
		frm_main.setSize(250,200);
		frm_main.setLayout(new BorderLayout());
		
		lbl_print = new JLabel("LABEL");
		btn_event = new JButton("BUTTON 1");
		
		Dimension size = new Dimension(250, 50);
		lbl_print.setPreferredSize(size);
		
		frm_main.add(lbl_print, BorderLayout.NORTH);
		frm_main.add(btn_event, BorderLayout.CENTER);
	}
	
	private void addEvent() {
		// 익명 클래스로 이벤트를 즉석 생성 및 처리 (Listener 인터페이스 사용)	
		btn_event.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// 컴포넌트에서 누르고 동일한 위치에서 마우스 뗐을때
				lbl_print.setText("Mouse Clicked Event" + "("+ e.getX() + "," + e.getY() + ")");
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// 컴포넌트에서 마우스를 누를 때 동작
				lbl_print.setText("Mouse Pressed Event" + e.getButton());
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// 컴포넌트에서 마우스 누른상태에서 약간 움직여서 마우스 뗐을때
				lbl_print.setText("Mouse Released Event");
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// btn_event 객체에 마우스가 진입했을때 동작(컴포넌트에 마우스 진입할떄)
				lbl_print.setText("Mouse Entered Event");
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// 컴포넌트에서 마우스 빠져나갈때 동작
				lbl_print.setText("Mouse Exited Event");
			}
			
		});
	}
	
	public void show() {
		frm_main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm_main.setVisible(true);
	}
}
	
	
class EventWindow2{
	private JFrame frm_main;
	private JLabel lbl_print;
	private JButton btn_event;
	
	public EventWindow2() {
		init();
		addEvent();
	}
	
	private void init() {
		frm_main = new JFrame("Event Test");
		frm_main.setSize(250,200);
		frm_main.setLayout(new BorderLayout());
		
		lbl_print = new JLabel("LABEL");
		btn_event = new JButton("BUTTON 1");
		
		Dimension size = new Dimension(250, 50);
		lbl_print.setPreferredSize(size);
		
		frm_main.add(lbl_print, BorderLayout.NORTH);
		frm_main.add(btn_event, BorderLayout.CENTER);
	}
	
	private void addEvent() {
		// 익명 클래스로 이벤트를 즉석 생성 및 처리 (Adapter 사용)
		btn_event.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				lbl_print.setText(btn_event.getText() + "을 클릭하였습니다.");
			}
		});
	
			
	}
		
	public void show() {
		frm_main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm_main.setVisible(true);
	}
}


class EventWindow3{
	private JFrame frm_main;
	private JLabel lbl_print;
	private JButton btn_event;
	
	public EventWindow3() {
		init();
		addEvent();
	}
	
	private void init() {
		frm_main = new JFrame("Event Test");
		frm_main.setSize(250,200);
		frm_main.setLayout(new BorderLayout());
		
		lbl_print = new JLabel("LABEL");
		btn_event = new JButton("BUTTON 1");
		
		Dimension size = new Dimension(250, 50);
		lbl_print.setPreferredSize(size);
		
		frm_main.add(lbl_print, BorderLayout.NORTH);
		frm_main.add(btn_event, BorderLayout.CENTER);
	}
	
	// 내부 클래스 생성
	private class BtnClickAdapter extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			lbl_print.setText("Button Clicked Event");
		}
	}
	
	private void addEvent() {
		// 내부 클래스로 생성 및 처리
		btn_event.addMouseListener(new BtnClickAdapter());
	}
		
	public void show() {
		frm_main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm_main.setVisible(true);
	}
}


// 독립적인 클래스로 생성 및 처리 (EventWindow4의 내부 변수 접근 어떻게 할지 고민 : 여기선 생성자 이용)
class BtnClickAdapter extends MouseAdapter{
	private JLabel lbl_print;
	
	public BtnClickAdapter(JLabel lbl) {
		this.lbl_print = lbl;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		lbl_print.setText("Button Clicked Event");
	}
}

class EventWindow4{
	private JFrame frm_main;
	private JLabel lbl_print;
	private JButton btn_event;
	
	public EventWindow4() {
		init();
		addEvent();
	}
	
	private void init() {
		frm_main = new JFrame("Event Test");
		frm_main.setSize(250,200);
		frm_main.setLayout(new BorderLayout());
		
		lbl_print = new JLabel("LABEL");
		btn_event = new JButton("BUTTON 1");
		
		Dimension size = new Dimension(250, 50);
		lbl_print.setPreferredSize(size);
		
		frm_main.add(lbl_print, BorderLayout.NORTH);
		frm_main.add(btn_event, BorderLayout.CENTER);
	}
	
	private void addEvent() {
		// 내부 클래스로 생성 및 처리
		btn_event.addMouseListener(new BtnClickAdapter(lbl_print));
	}
		
	public void show() {
		frm_main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm_main.setVisible(true);
	}
}


public class Sample7 {

	public static void main(String[] args) {
		new EventWindow3().show();

	}

}
