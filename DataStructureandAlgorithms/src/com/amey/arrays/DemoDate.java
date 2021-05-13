package com.amey.arrays;

import java.time.LocalDate;
import java.time.Month;

public class DemoDate {
    
	public static void main(String[] args) {
		 LocalDate date = LocalDate.now();
		  Month  month =date.getMonth();
		 System.out.println("" +month);
	}
	
	 
}
