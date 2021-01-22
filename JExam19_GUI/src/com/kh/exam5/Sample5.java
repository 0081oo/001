package com.kh.exam5;

/*
 * LOGIN 창 만들기
 */

/*
 * + 참고
 * setpreferredSize라는 함수를 이용해서 txt상자 크기를 만들 수 있다.
 * Dimension s = 텍스트필드변수명.getPreferredSize();
 * s.setSize(275, s.getHeight()+5);
 * 텍스트필드변수.setPreferredSize(s);		
 */

import java.awt.*;
import javax.swing.*;

class Window{
	private JFrame frm;
	
	public Window() {
		init();
	}
	
	private void init() {
		frm = new JFrame("Login");
		frm.setSize(300, 150);
		frm.setLayout(new BorderLayout());
		
		JPanel pan0 = new JPanel();
		frm.add(pan0);
		pan0.add(new JLabel("Username:"));
		pan0.add(new JTextField(15));
		pan0.add(new JLabel("Password:"));
		pan0.add(new JTextField(15));
		
		JPanel pan1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		frm.add(pan1, BorderLayout.SOUTH);
		pan1.add(new JButton("Login")); 
		pan1.add(new JButton("Cancel")); 
		
	}
	
/*
 * 선생님 코드
 		private void init() {
			frm_main = new JFrame("Login");
			frm_main.setSize(new Dimension(350, 110));
			frm_main.setLayout(new BorderLayout());
		
			JPanel pan_input = new JPanel(new BorderLayout());
			JPanel pan_button = new JPanel(new FlowLayout(FlowLayout.CENTER));
			
			frm_main.add(pan_button, BorderLayout.CENTER);
		
			JPanel pan_user = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
			JPanel pan_pass = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
			pan_input.add(pan_user, BorderLayout.NORTH);
			pan_input.add(pan_pass, BorderLayout.CENTER);
		
			JLabel lbl_username = new JLabel("Username : ");
			JTextField txt_username = new JTextField();
			JLabel lbl_password = new JLabel("Password : ");
			JTextField txt_password = new JTextField();
		
			pan_user.add(lbl_username);	pan_user.add(txt_username);
			pan_pass.add(lbl_password);	pan_pass.add(txt_password);
		
			JButton btn_login = new JButton("Login");
			JButton btn_cancel = new JButton("Cancel");
			pan_button.add(btn_login);	pan_button.add(btn_cancel);
		
			Dimension s = txt_username.getPreferredSize();
			s.setSize(275, s.getHeight() + 2);
			txt_username.setPreferredSize(s);
			txt_password.setPreferredSize(s);
		}
 */
	
	public void show() {
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setResizable(false); // 사용자가 창 크기를 마우스드래그로 조정못하게
		frm.setVisible(true);
	}
}

public class Sample5 {

	public static void main(String[] args) {
		Window w = new Window();
		w.show();
	}

}
