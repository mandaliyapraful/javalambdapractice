/**
 * 
 */
package com.java.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Mandaliya
 *
 */
public class UntilExcercise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				 new Person("Praful", "Mandaliya", 27),
				 new Person("wre", "Mandaliya", 27),
				 new Person("sdf", "ocreandaliya", 27),
				 new Person("were", "eandaliya", 27),
				 new Person("qwe", "Mandaliya", 27),
				 new Person("avxc", "Mandaliya", 27),
				 new Person("Deepak", "Mandaliya", 27)
				);
		
		//sort by last name
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		
		//create method that prints all elements in list
		printAll(people);
		
		//create a method that prints all the elements with last name starting with M
		printLastnameBeginWithC(people);
	
	}

	private static void printLastnameBeginWithC(List<Person> people) {
		// TODO Auto-generated method stub
		for (Person person : people) {
			if(person.getLastName().startsWith("M"))
			{
				System.out.println(person);
			}
		}
		
	}

	private static void printAll(List<Person> people) {
		// TODO Auto-generated method stub
		for (Person person : people) {
			System.out.println(person);
		}
	}

}
