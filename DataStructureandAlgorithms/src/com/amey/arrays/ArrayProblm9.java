package com.amey.arrays;

import java.util.Scanner;

//Finding frequency of each element in a sorted array
public class ArrayProblm9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Input Array
		System.out.println("Enter the size of sorted array: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] inputArray = new int[size];
		System.out.println("Enter elements of an sorted array: ");
		for(int i=0;i<inputArray.length;i++) {
			inputArray[i] = sc.nextInt();
		}
		// Business Logic
		int x = inputArray[0];
		int frequency= 0;
		if(size == 1) {
			System.out.println("Frequency of "+x+" is 1 ");
		}else {
			for(int i=0;i<inputArray.length;i++) {
					if(x==inputArray[i]) {
						frequency++;
					}else {
						System.out.println("Frequency of "+x+" is "+ " "+frequency);
						x= inputArray[i];
						frequency=1;
					}
			}
			System.out.println("Frequency of "+x+" is "+ " "+frequency);
		}
	}

}
