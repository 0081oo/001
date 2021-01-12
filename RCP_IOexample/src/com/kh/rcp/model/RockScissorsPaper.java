package com.kh.rcp.model;

import java.io.*;

public class RockScissorsPaper {
	private File f = new File("/Users/heeminchun/Desktop/RCP.txt");
	
	public void writeResult(int win, int lose, int draw) {
		try {
			FileWriter fw = new FileWriter(f);
			fw.write(Integer.toString(win) + "," + Integer.toString(lose) + "," + Integer.toString(draw));
			fw.close();
		} catch (IOException e) {
			System.out.println("IOException Error");
		}
	}
	
	public String readResult() {
		if(!f.exists()) {
			System.out.println("There's any file in this directory.");
		}
		else {
			try {
				FileReader fr = new FileReader(f);
				
				String res = "";
				int read;
				char[] cArr = new char[20];
				while((read = fr.read(cArr)) != -1) {
					res += new String(cArr, 0, read);
				}
				fr.close();
				return res;
			} catch (FileNotFoundException e) {
				System.out.println("FileNotFOundExceotion Error");
			} catch (IOException e) {
				System.out.println("IOException Error");
			}
		}
		
		return "";
	}
}
