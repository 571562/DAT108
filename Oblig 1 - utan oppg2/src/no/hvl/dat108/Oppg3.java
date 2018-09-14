package no.hvl.dat108;

import java.util.function.Function;
/**
 * 
 * @author herbo
 *
 */

public class Oppg3 {
	
	public static void main (String[] args) {
		
		Tilsett t1 = new Tilsett("Ola", "Nordmann", 'M', 500000, "Markedsføring");
		Tilsett t2 = new Tilsett("Kari", "Nilsen", 'K', 600000, "Salg");
		Tilsett t3 = new Tilsett("Marie", "Hansen", 'K', 550000, "Økonomi");


		
		Function<Double, Double> kronetillegg = n -> n + 50000;
		Function<Double, Double> prosenttillegg = n -> n * 1.2;
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println();
		
		t1.endreLon(kronetillegg);
		t2.endreLon(prosenttillegg);
		t3.endreLon(fastkrone());
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		
	}
	
	private static Function<Double, Double> fastkrone(){
		return ( n -> n + 100000);
		
	}

}
