/*
 * package com.amey.demo;
 * 
 * import java.util.HashSet;
 * 
 * public class Demo1 {
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * 
 * String s = "Hello world";
 * 
 * String[] sArray = s.split(" ");
 * System.out.println("No. of words : "+sArray.length);
 * 
 * String reverse = ""; for(int i=s.length()-1;i>=0;i--) { reverse = reverse +
 * s.charAt(i); } System.out.println("Reverse of java2blog is: " + reverse);
 * 
 * System.out.println("java2blog has all unique chars : "+
 * hasAllUniqueChars("java2blog"));
 * System.out.println("Apple has all unique chars : "+
 * hasAllUniqueChars("apple"));
 * System.out.println("index has all unique chars : "+
 * hasAllUniqueChars("index"));
 * System.out.println("world has all unique chars : "+
 * hasAllUniqueChars("world")); }
 * 
 * public static boolean hasAllUniqueChars (String word) { HashSet alphaSet=new
 * HashSet(); for(int index=0;index < word.length(); index ++) { char c =
 * word.charAt(index); if(!alphaSet.add(c)) { return false; } } } return true; }
 * 
 * 
 */