package com.amey.arrays;

import java.util.Scanner;

//Problm Statement: Left Rotate an array by 1.

public class ArrayProblm6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of arrray: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("Enter elements of array: ");
		for(int i=0;i<array.length;i++) {
			array[i] =sc.nextInt();
		}
		 // Business Logic
		int temp= array[0];
		for(int i=1;i<array.length;i++) {
			array[i-1]=array[i]; 
			} 
		array[array.length-1]=temp;
		System.out.println("Left Rotated array by 1: ");
		for(int i=0;i<array.length;i++) {
			System.out.println(""+array[i]);
		}
		sc.close();
	}

}
