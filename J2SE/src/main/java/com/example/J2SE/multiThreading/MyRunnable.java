package com.example.J2SE.multiThreading;

public class MyRunnable implements Runnable {

	int threadId;
	public MyRunnable(int threadId) {
		this.threadId=threadId;
	}
	
	@Override
	synchronized public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println("Runnable "+threadId+" Running...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				
			}
		}
	}

}
