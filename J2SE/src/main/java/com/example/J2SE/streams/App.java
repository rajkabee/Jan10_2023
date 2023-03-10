package com.example.J2SE.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Saugat", 27, Gender.Male),
				new Person("Binod", 39, Gender.Male),
				new Person("Reena", 42, Gender.Female),
				new Person("Gopal", 54, Gender.Male),
				new Person("Sarita", 64, Gender.Female),
				new Person("Sarala", 14, Gender.Female),
				new Person("Mohan", 4, Gender.Male),
				new Person("Manisha", 34, Gender.Female),
				new Person("Alina", 24, Gender.Female),
				new Person("Sarita", 64, Gender.Female),
				new Person("Sarala", 14, Gender.Female),
				new Person("Mohan", 4, Gender.Male),
				new Person("Manisha", 34, Gender.Female),
				new Person("Alina", 24, Gender.Female)	
				);
		
		System.out.println("Sorting: ");
		List<Person> sorted= people.stream()
				.sorted(Comparator.comparing(Person::getAge).reversed())
				.collect(Collectors.toList());
				
		sorted.forEach(item->{
			System.out.println(item);
		});	
		
		
		System.out.println("Filtered: ");
		people.stream()
				.filter(item->item.getAge()>18)
				.collect(Collectors.toList())
				.forEach(System.out::println);
				
		System.out.println("All Match: ");
		boolean allAbove20 = people.stream()
								.allMatch(item->item.getAge()>20);	
		System.out.println("Everyone above 20: "+allAbove20);
				
		System.out.println("Any Match: ");
		boolean anyMinors = people.stream()
								.anyMatch(item->item.getAge()<18);	
		System.out.println("Anyone below 18: "+anyMinors);
		
		System.out.println("None Match: ");
		boolean noMinors = people.stream()
				.noneMatch(item->item.getAge()<18);	
		System.out.println("no one below 18:  "+noMinors);
		
		System.out.println("Minimum: ");
		Person pMin = people.stream()
				.min(Comparator.comparing(Person::getAge)).get();		//Person->Class
		System.out.println(pMin);	
		
		System.out.println("Maximum: ");
		Person pMax = people.stream()
				.max(Comparator.comparing(Person::getAge)).get();		//Person->Class
		System.out.println(pMax);
		
		System.out.println("Grouping: ");
		Map<Gender, List<Person>> groupedByGender=
		people.stream()
				.collect(Collectors.groupingBy(Person::getGender));
		
		groupedByGender.forEach((gender, genderList)->{
			System.out.println(gender);
			genderList.forEach(System.out::println);
		});
		
		
//		System.out.println("Distinct: ");
//		people.stream()
//				.sorted(Comparator.comparing(Person::getAge))
//				.distinct()
//				.collect(Collectors.toList())
//				.forEach(System.out::println);
//		
//		
				
	}
}
