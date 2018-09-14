package no.hvl.dat108.f06;
/* Kopiert fra javabrains.io sitt Java 8 Lambda Basics kurs */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

//VIDEO 14!!! SJ� DEN 
public class Eksempel2_Oppgave {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51), new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39));

		// 1: Sorter personene p� etternavn.
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

		// 2: Skriv ut alle personene, �n linje per person.
		// Lag en egen hjelpemetode printAll(...) som gj�r dette.
		
		printAll(people);
		System.out.println();
		
		// 3: Skriv ut alle personene som har etternavn som begynner p� C.
		// Lag en egen hjelpemetode printLastNameStartsWithC(...) som gj�r dette.
		
		printLastNameStartsWithC(people);
		System.out.println();

		// 4: Skriv ut alle personene som har fornavn som begynner p� C.
		// Vi ser n� at det er tungvint � lage �n utskriftsmetode per
		// spesialtilfelle. Lag en generell hjelpemetode printConditionally(...)
		// gj�r jobben i stedet. Denne tar inn listen + et lambdauttrykk.
		
		printconditionally(people, p -> p.getFirstName().startsWith("C"));
		System.out.println();
		
		// 5: Skriv ut ALLE personene ved � bruke printConditionally(...)
		
		printconditionally(people, p -> true);
		System.out.println();
		
	}
	
	private static void printconditionally(List<Person> people, Predicate<Person> b) {
			for (Person p : people) {
				if (b.test(p)){
					System.out.println(p);
				}
			}
		
	}

	private static void printAll(List<Person> people) {
		for (Person p : people) {
			System.out.println(p);
		}
	}
	
	private static void printLastNameStartsWithC(List<Person> people) {
//		for (Person p : people) {
//			if (p.getLastName().startsWith("C")){
//				System.out.println(p);
//			}
//		}
	}	
}
