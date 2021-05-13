package com.amey.arrays;

import java.util.Scanner;

//Problm 8 : Finding Leaders of array: Element is largest than anyone on right
public class ArrayProblm8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter size of array: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("Enter elements of an array: ");
		for(int i=0;i<array.length;i++) {
			array[i]= sc.nextInt();
		}
		// Businness Logic
		int k=0;
		int[] leaderArray= new int[size];
	//	boolean elementIsNotLeader = false;
		
		for(int i=0;i<array.length-1;i++) {
			//System.out.println("Inside first for loop: value of i "+i);
			boolean elementIsLeader = true;
			for(int j=i+1;j<array.length;j++) {
				//System.out.println("Inside 2nd for loop: value of i "+j);
				
				if(array[j]>=array[i]) {
					elementIsLeader = false;
					//System.out.println("If  condn is true and elementIsLeader "+elementIsLeader);
					break;
				}
			}
			 if(elementIsLeader) { 
				// System.out.println("Value of array element "+array[i]);
				 leaderArray[k] = array[i];
				// System.out.println("Element is leader: "+leaderArray[k]);
				 k++; 
			 }
		}
		leaderArray[k]=array[array.length-1];
		System.out.println("Leader elements in an Array: ");
		for(int i=0;i<leaderArray.length;i++) {
			if(leaderArray[i] != 0) {
				System.out.println(" "+leaderArray[i]);
			}
		}
	}

}
