package com.amey.thread;

public class AnonoymousThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread() {
			 public void run() {
					System.out.println("Thread is running..");
				}
		}.start();;
		// Java 1.8 Lambda Expression
		new Thread(
				() -> System.out.println("Thread is running..")
				).start();
	}

}
