package com.amey.demo.hashmapsorting;

public class Country implements Comparable{

	String name;
	long population;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	public Country(String name, long population) {
		super();
		this.name = name;
		this.population = population;
	}
	@Override
	public String toString() {
		return "Country [name=" + name + ", population=" + population + "]";
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Country country = (Country) o;
		return this.getName().compareTo(country.getName());
	}

}
