package com.kh.exam2;

class ThreadSample1 implements Runnable{
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 단위 밀리세컨드 그래서 이거 1초
			System.out.println(i);
		}
	}
}

public class Sample2 {

	public static void main(String[] args) {
		ThreadSample1 ts1 = new ThreadSample1();
		Thread t1 = new Thread(ts1);
		while(true) {
			if(Thread.State.NEW == t1.getState()) {
				System.out.println("Thread is created");
			} else if(Thread.State.RUNNABLE == t1.getState()) {
				System.out.println("Thread is ready for execute");
			} else if(Thread.State.TIMED_WAITING == t1.getState()) {
				System.out.println("Thread is waiting");
			} else if(Thread.State.RUNNABLE == t1.getState()) {
				System.out.println("Thread is terminated");
			} 
		}
	}

}
