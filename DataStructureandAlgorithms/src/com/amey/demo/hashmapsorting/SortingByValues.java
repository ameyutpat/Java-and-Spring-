package com.amey.demo.hashmapsorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortingByValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/*
	 * public static HashMap<String, Integer> sortByValue(HashMap<String, Integer>
	 * hm) { List<Map.Entry<String, Integer> > list = new
	 * LinkedList<Map.Entry<String, Integer> >(hm.entrySet()); // Converted to list
	 * List<Map.Entry<String, Integer>> list1 = new
	 * LinkedList<Map.Entry<String,Integer>>(hm.entrySet());
	 * 
	 * // Sort the list Collections.sort(list1, new
	 * Comparator<Map.Entry<String,Integer>>() {
	 * 
	 * @Override public int compare(Entry<String, Integer> o1, Entry<String,
	 * Integer> o2) { // TODO Auto-generated method stub return
	 * (o1.getValue()).compareTo(o2.getValue()); } });
	 * 
	 * // put data from sorted list to hashmap HashMap<String, Integer> temp = new
	 * LinkedHashMap<String, Integer>(); for (Map.Entry<String, Integer> aa : list)
	 * { temp.put(aa.getKey(), aa.getValue()); } return hm;
	 * 
	 * }
	 */
	public static HashMap<String, Integer> sortByValues(HashMap<String, Integer> hm) {
		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(hm.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		HashMap<String,Integer> temp  = new LinkedHashMap<String, Integer>();
		for(Map.Entry<String,Integer> aa : list) {
			temp.put(aa.getKey(), aa.getValue());
		}
		return temp;
	}

}
