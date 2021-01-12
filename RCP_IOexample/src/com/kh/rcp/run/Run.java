package com.kh.rcp.run;

import java.util.Scanner;

import com.kh.rcp.model.RockScissorsPaper;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Run {

	public static void main(String[] args) {
		RockScissorsPaper rcp = new RockScissorsPaper();
		File f = new File("/Users/heeminchun/Desktop/RCP.txt");
		
		// 바위 : 1 | 가위 : 2 | 보  : 3
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		String user;
		int nUser, nComputer;
		
		
		while(true) {
			// 매 경기마다 초기화
			int win = 0, lose = 0, draw = 0;
			
			System.out.println("가위 바위 보 중 하나를 입력하세요 (exit입력시 종료): ");
			user = sc.next();
			
			if("바위".equals(user)) nUser = 1;
			else if("가위".equals(user)) nUser = 2;
			else if("보".equals(user))nUser = 3;
			else if("exit".equals(user)) {
				nUser = 0;
				System.out.println("Your total Score is (win, lose, draw) : " + rcp.readResult());
				System.exit(0);
			}
			else {
				System.out.println("다시 입력하세요");
				continue;
			}
			
			nComputer = rand.nextInt(3) + 1;
			
			if(nUser == 1) {
				if(nComputer == 2) {
					System.out.println("You Win"); win++;
				}
				else if(nComputer == 3) {
					System.out.println("You Lose"); lose++;
				}
				else  {
					System.out.println("Draw"); draw++;
				}
			}
			else if(nUser == 2) {
				if(nComputer == 3) {
					System.out.println("You Win"); win++;
				}
				else if(nComputer == 1) {
					System.out.println("You Lose"); lose++;
				}
				else  {
					System.out.println("Draw"); draw++;
				}
			}
			else {
				if(nComputer == 1) {
					System.out.println("You Win"); win++;
				}
				else if(nComputer == 2) {
					System.out.println("You Lose"); lose++;
				}
				else  {
					System.out.println("Draw"); draw++;
				}
			}
			
			try {
				if(!f.exists()) {
					f.createNewFile();
					System.out.println("RCP.txt is created.");
					rcp.writeResult(win, lose, draw);
					System.out.println("Now your score is (win,lose,draw) : " + rcp.readResult());
				}
				else {
					// 파일을 읽어와서 문자열 분리후 int로 변환해서 합 더한 뒤에 다시 write 해주기
					String orgResult = rcp.readResult();
					String[] newRes = orgResult.split(",");
					int newWin = Integer.parseInt(newRes[0]) + win;
					int newLose = Integer.parseInt(newRes[1]) + lose;
					int newDraw = Integer.parseInt(newRes[2]) + draw;
					rcp.writeResult(newWin, newLose, newDraw);
					System.out.println("Now your score is (win,lose,draw): " + rcp.readResult());
				}
			} catch (IOException e) {
				System.out.println("IOException Error");
			}
			
		}
	
	}

}
