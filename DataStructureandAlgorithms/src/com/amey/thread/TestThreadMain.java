package com.amey.thread;

public class TestThreadMain {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableClass runable1 = new RunnableClass();
		Thread thread1 = new Thread(runable1);
		thread1.start();
		
		Thread thread2 = new Thread(runable1);
		thread2.start();
	}

}
