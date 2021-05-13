package com.amey.arrays;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] elements = {5,20,100,435,600};
		int n = elements.length;
		System.out.println("Enter element want to search: ");
		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();
		int indexOfTarget = binarySearch(elements, 0 ,n-1, target);
		if(indexOfTarget != -1) {
			System.out.println("Element "+target+" is "+indexOfTarget);
		}else {
			System.out.println("Element is not in array..");
		}
	}

	private static int binarySearch(int elements[] ,int left , int right , int target) {
		// TODO Auto-generated method stub
		if(right >= left) {
			int mid = left+ (right-left)/2;
			if(elements[mid]== target) {
				return mid;
			}
			
			if(elements[mid] < target) {
				return binarySearch(elements,mid+1,right,target);
			}
				return binarySearch(elements,left,mid-1,target);
		}
		return -1;
		
	}

}
