package com.kh.exam3;

class Bank implements Runnable{
	private String name;
	private int money;
	private String who;
	private int outMoney;
	
	public Bank(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public synchronized void moneyOut(String who, int money) {
		// 누가 내 통장에서 돈을 출금했나?
		if(this.money - money > 0) {
			System.out.println(who + "가(이)" + name + "의 계좌에서 " + money + "를 출금했습니다.");
			this.money -= money;
		} else {
			System.out.println("잔액이 부족합니다.");
		}
	}
	
	public void setWho(String who) {
		this.who = who;
	}
	
	public void setOutMoney(int money) {
		this.outMoney = money;
	}
	
	@Override
	public void run() {
		moneyOut(who, outMoney);
	}
}

public class Sample3 {

	public static void main(String[] args) {
		Bank b1 = new Bank("Heemin", 50000);
		
		for(int i = 0; i < 10; i++) {
			Thread t1 = new Thread(b1);
			Thread t2 = new Thread(b1);
			Thread t3 = new Thread(b1);
			t1.start();
			t2.start();
			t3.start();
		}
	}

}
