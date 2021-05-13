package com.amey.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


/*write a program to read a string and print in how many words a character appered
e.g green apple tree g 1, r 2, e 3,n 1, a 1 , p 1 ,l 1  t 1*/
public class Demo1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "green apple tree";
		char[] inputChar = input.toCharArray();
		String[] words = input.split(" ");
		Set<Character> uniqueLetter = new HashSet<Character>();
		for (int i = 0; i < inputChar.length; i++) {
			char s = inputChar[i];
			String space = ""+ s;
			if(!space.equals(" ")) {
				uniqueLetter.add(inputChar[i]);
			}
		}
		Map<Character,Integer> countMap = new HashMap<Character,Integer>();
		for(Character c : uniqueLetter) {
			int count = 0;
			for(String word : words) {
				if(word.contains(""+c)) {
					count++;
				}
				countMap.put(c, count);
			}
		}
		
		System.out.println(countMap);
	}

}
