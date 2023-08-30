package no.hvl.dat108.f04;

import static java.util.Comparator.comparing;
import static no.hvl.dat108.f04.People.people;

import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;

/*
 * Eksempel3
 * 
 * I dette eksempelet skal vi se litt på metoden comparing(), og hvordan
 * denne kan brukes der det forventes en Comparator.
 * Vi ser også på hvordan en slik comparing-metode kan implementeres,
 * f.eks. om den ikke allerede fantes.
 */
public class Eksempel3 {

	public static void main(String[] args) {
		
		//1 - Sortering på etternavn ved å gi inn en Comparator som 2. parameter
		Collections.sort(people, (a,b) -> a.getLastName().compareTo(b.getLastName()));
		
		//2 - Ofte ser vi kode som dette
		Collections.sort(people, comparing(p -> p.getLastName()));

		//3 - Eller (enda bedre) ved å bruke metodereferanse
		Collections.sort(people, comparing(Person::getLastName));

		//4 - Hvordan virker egentlig Comparator.comparing()?
		//		Kan vi forstå litt mer ved å lage en slik metode selv?
//		Collections.sort(people, vedAaSammenligne(Person::getFirstName));
		
		System.out.println(people);
	}
	
	/*
	 * Vår egen utgave av Comparator.comparing(...). Gjort og forklart i timen
	 * Sjekk gjerne ut API-doc til Comparator.comparing(), og se om det ligner.
	 */
//TODO	static ??? vedAaSammenligne(???) {
//		return ???;
//	}

}



















