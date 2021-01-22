package com.kh.exam3;

/*
 *  GUI를 사용하여 Local PC의 파일 또는 디렉토리의 정보를 보여주는 프로그램
 *  모든 내용은 라벨에 작성
 *  
 *  아 나 잘못만들었다. 디렉토리 정보가 아니라 파일 읽어오는거 만들었네..
 */

/*
import java.io.*;
import javax.swing.*;

class MainWindow{
	private JFrame f;
	private JLabel lb;
	
	public MainWindow(){
		init();
	}
	
	public void init() {
		f = new JFrame("Sample.txt");
		f.setLayout(new BoxLayout(f.getContentPane(), BoxLayout.Y_AXIS));
		f.setSize(250,100);
		
		lb = new JLabel();
		f.add(lb);
	}
	
	public void setlabel(String txt) {
		lb.setText(txt);
	}
	
	public void show() {
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}

public class Sample {
	
	

	public static void main(String[] args) {
		MainWindow w = new MainWindow();
		File f = new File("/Users/heeminchun/Desktop/Sample.txt");
		try {
			if(!f.exists()) {
				f.createNewFile();
			}
			FileReader fr = new FileReader(f);
			
			String str = "";
			int read;
			char[] cArr = new char[512];
			while((read = fr.read(cArr)) != -1) {
				str += new String(cArr, 0, read);
			}
			
			w.setlabel(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		w.show();

	}

}
*/