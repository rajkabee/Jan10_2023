package com.example.J2SE.multiThreading;

public class App {
	public static void main(String[] args) {
		MyThread thread1 = new MyThread(1);
		thread1.start();
		MyThread thread2 = new MyThread(2);
		thread2.start();
		MyRunnable thread3 = new MyRunnable(3);
		thread3.run();
	}
}
