package com.amey.arrays;

import java.util.Scanner;


// Problm Statement: Left Rotate Array by d places
public class ArrayProlbm7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Initialization
		System.out.println("Enter size of array: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] inputArray = new int[size];
		System.out.println("Enter elements of Array: ");
		for(int i=0;i<inputArray.length;i++) {
			inputArray[i] = sc.nextInt();
		}
		// Business Logic
		System.out.println("With how many places you want to left rotate an array: ");
		int d = sc.nextInt();
		int[] tempArray = new int[d];
		for(int i=0;i<d;i++) {
			tempArray[i]=inputArray[i];
		}
		for(int i=d;i<=inputArray.length-1;i++) {
			inputArray[i-d] = inputArray[i];
		}
		
		
		  for(int i=0;i<tempArray.length;i++) {
		  inputArray[inputArray.length-d]=tempArray[i]; d--; }
		 
		//Output
		System.out.println("Left Rotated Array by {} places: "+ d);
		for(int i=0;i<inputArray.length;i++) {
			System.out.println(" "+inputArray[i]);
		}
	}

}
