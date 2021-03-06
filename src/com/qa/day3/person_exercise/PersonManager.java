package com.qa.day3.person_exercise;

import java.util.ArrayList;

public class PersonManager {
	
	private ArrayList<Person> pplList = new ArrayList<Person>();
	
	public void addPerson (Person person) {
		this.pplList.add(person);
	}
	
	public ArrayList<Person> getPeople() {
		return pplList;
	}
	
	public void printAll() {
		System.out.println("\n\n-----------------------------");
		System.out.println("----Full list of entries-----");
		System.out.println("-----------------------------");
		for (Person person : pplList) {
			System.out.println(person);
			System.out.println("-----------------------------");
		}
	}
	
	public void search(String name) {
		for (Person person : this.pplList) {
			if (person.getName() == name) {
				System.out.println("--------Person Found!--------");
				System.out.println(person);
				System.out.println("-----------------------------");
			}
		}
	}
}
