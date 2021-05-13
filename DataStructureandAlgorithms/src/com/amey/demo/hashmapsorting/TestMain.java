package com.amey.demo.hashmapsorting;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country india=new Country("India",1000);  
		 Country japan=new Country("Japan",10000); 
		 Country france=new Country("France",2000);  
	        Country russia=new Country("Russia",20000);  
	      HashMap<Country, String> countryCapitalMap = new HashMap<Country, String>();
	      countryCapitalMap.put(india,"Delhi");  
	        countryCapitalMap.put(japan,"Tokyo");  
	        countryCapitalMap.put(france,"Paris");  
	        countryCapitalMap.put(russia,"Moscow");
	        
	        System.out.println("Sorting HashMap by passing it to TreeMap constructor");
	        
	       TreeMap<Country, String> sortedTreeMapCountryCapital = new TreeMap<Country, String>(countryCapitalMap);
			/*
			 * Iterator countryCapitalIter =
			 * sortedTreeMapCountryCapital.keySet().iterator();
			 * while(countryCapitalIter.hasNext()) { Country countryObj=(Country)
			 * countryCapitalIter.next(); String capital=countryCapitalMap.get(countryObj);
			 * System.out.println(countryObj.getName()+"----"+capital); }
			 */
	       for(Country c : sortedTreeMapCountryCapital.keySet()) {
	    	   System.out.println(c.toString()+" "+ countryCapitalMap.get(c)); 
	       }
	}

}
