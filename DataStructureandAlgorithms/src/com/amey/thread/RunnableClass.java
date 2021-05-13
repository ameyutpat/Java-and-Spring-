package com.amey.thread;

public class RunnableClass implements Runnable {

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is running.."+Thread.currentThread().getName());
	}

}
