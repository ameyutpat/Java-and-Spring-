package com.amey.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = " Hello world";
		char[] sc = s.toCharArray();
		int length= 0;
		for(char c : sc) {
			length++;
		}
		
		 String str="abbc";
		  System.out.println("All substring of abbc are:");
		  for(int i = 0; i < str.length(); i++) {
			  for(int j = i+1; j <= str.length(); j++) {
				  System.out.println(str.substring(i,j));
			  }
		  }
		  
		  HashMap<Integer,String> empMap = new HashMap<Integer,String>();
		  empMap.put(1, "A");
		  empMap.put(2, "B");
			/*
			 * System.out.println(empMap); for(Integer i : empMap.keySet()) {
			 * System.out.println(i + "Value: "+empMap.get(i)); } for(Map.Entry<Integer,
			 * String> entry : empMap.entrySet()) {
			 * System.out.println(entry.getKey()+" --> "+entry.getValue()); }
			 */
		  System.out.println(""+empMap.keySet());
		  System.out.println(""+empMap.values());
		  System.out.println(""+empMap.entrySet());
		  
		  
		  List<String> list = new ArrayList<String>();
		  list.add("00657");
		  list.add("00632");
		  list.add("00656");
		  list.add("01125");
		 //String[] array =  list.toArray(a);
		  // 1. Typecasting to Integer list
		  // 2. Comparing and reordering
			/*
			 * List<Integer> list2 = new ArrayList<Integer>(); String number = list.get(0);
			 * //(Integer)number //HashMap<String, > String[] input; public list<String>
			 * anagram(List<String> input){ for(String st : input ) { st. } }
			 */
			/*
			 * int num = Integer.parseInt("006570"); System.out.println(""+num);
			 */
		 // Collections.sort(list);
		 List<Integer> listOfInt2 = convertListintoInt(list);
		 for(int i=0;i<list.size();i++) {
			 System.out.println(listOfInt2.get(i));
		 }
		
	}

	public static List<Integer> convertListintoInt(List<String> list){
		List<Integer> listOfInt = new ArrayList<Integer>();
		for(int i=0;i<list.size();i++) {
			 int num = Integer.parseInt(list.get(i));
			 listOfInt.add(num);
		}
		return listOfInt;
		
	}
}
