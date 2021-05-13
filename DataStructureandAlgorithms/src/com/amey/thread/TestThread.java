package com.amey.thread;

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadClassDemo td1 = new ThreadClassDemo();
		td1.start();
		
		ThreadClassDemo td2  = new ThreadClassDemo();
		td2.start();
	}

}
