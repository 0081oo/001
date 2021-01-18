package com.kh.exam1;

class ThreadSample1 extends Thread{
	private String name;
	private int max;
	
	public ThreadSample1(String name, int max) {
		this.max = max;
		this.name = name;
	}
	
	
	public void total(int max) {
		int tot = 0;
		for(int i = 1; i <= max; i++) {
			tot += i;
		}
		System.out.println("1 ~ " + max + " SUM : " + tot);
	}
	
	@Override
	public void run() {
		this.total(max);
	}
}

class ThreadSample2 implements Runnable{
	private String name;
	private int max;
	
	public ThreadSample2(String name, int max) {
		this.max = max;
		this.name = name;
	}
	
	
	public void total(int max) {
		int tot = 0;
		for(int i = 1; i <= max; i++) {
			tot += i;
		}
		System.out.println("1 ~ " + max + " SUM : " + tot);
	}
	
	@Override
	public void run() {
		this.total(max);
	}
}

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ThreadSample1 ts1 = new ThreadSample1("Non-Thread1");
//		ts1.exec();
//		
//		ThreadSample1 ts2 = new ThreadSample1("Non-Thread2");
//		ts2.exec();
		
		
//		ThreadSample1 ts1 = new ThreadSample1("Thread1", 100);
//		ts1.start();
//		
//		ThreadSample1 ts2 = new ThreadSample1("Thread2", 200);
//		ts2.start();
//		
//		ThreadSample1 ts3 = new ThreadSample1("Thread2", 300);
//		ts3.start();
		
		// Runnable 인터페이스를 사용한 경우
		ThreadSample2 ts1 = new ThreadSample2("Thread1", 100);
		Thread t1 = new Thread(ts1);
		t1.setPriority(10); // 우선순위 부여
		t1.start();
		
		ThreadSample2 ts2 = new ThreadSample2("Thread2", 200);
		Thread t2 = new Thread(ts2);
		t2.start();
		
		ThreadSample2 ts3 = new ThreadSample2("Thread2", 300);
		Thread t3 = new Thread(ts3);
		t3.setPriority(1);
		t3.start();
	}

}
