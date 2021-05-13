package com.amey.arrays;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] elements = {5,20,100,435,600};
		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();
		int indexOfTarget = linearSearch(elements,target);
		if(indexOfTarget != -1) {
			System.out.println("Index of target : "+ indexOfTarget);
		}else {
			System.out.println("Element not found..");
		}
		
		
		
	}

	private static int linearSearch(int[] elements, int target) {
		// TODO Auto-generated method stub
		for(int i=0; i< elements.length;i++) {
			if(target == elements[i]) {
				return i;
			}
		}
		return -1;
	}

}
