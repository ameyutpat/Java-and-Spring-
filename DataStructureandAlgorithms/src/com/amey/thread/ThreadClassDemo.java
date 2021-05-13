package com.amey.thread;

public class ThreadClassDemo  extends Thread{

	public void run(){
		System.out.println("This thread is created using extending Thread class..");
		System.out.println("Thread is started"+Thread.currentThread().getName());
	}
}
