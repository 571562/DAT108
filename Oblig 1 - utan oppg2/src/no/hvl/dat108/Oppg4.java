package no.hvl.dat108;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

/**
 * 
 * @author herbo
 *
 */
public class Oppg4 {

	public static void main(String[] args) {
		
		List<Tilsett> personer = Arrays.asList(
				new Tilsett("Ola", "Nordmann", 'M', 500000, "Sjef"),
				new Tilsett("Kari", "Nilsen", 'K', 600000, "Sjef"),
				new Tilsett("Marie", "Hansen", 'K', 550000, "�konomi"),
				new Tilsett("P�l", "Knutsen", 'M', 450000, "IT"),
				new Tilsett("Fredrik", "M�rk", 'M', 430000, "Salg"),
				new Tilsett("Sondre", "Gjesdal", 'M', 540000, "IT"),
				new Tilsett("Simen", "Gjerde", 'M', 500000, "Markedsf�ring"));
		
		/**
		 * Oppg�ve a : Laga ei liste som inneheld kun etternamn
		 */
		List<String> etternamn = personer.stream()
					.map(t -> t.getEtternamn())
					.collect(Collectors.toList()); 
		System.out.println("Lista av tilsette med kun etternamn:");
		etternamn.forEach(System.out::println);
		System.out.println();
		
		/**
		 * Oppg�ve b : finn antal tilsette som er kvinner
		 */
		
		int antalKvinner = (int) personer.stream()
					.filter(t -> t.getKjonn() == 'K')
					.count();
		System.out.println("Antal tilsette som er kvinner:");
		System.out.println(antalKvinner);
		System.out.println();
		
		/**
		 * Oppg�ve c : Rekn gjennomsnitt til kvinnene
		 */
		
		double lonKvinner = personer.stream()
					.filter(t -> t.getKjonn() == 'K')
					.mapToDouble(t -> t.getArslon())
					.average()
					.getAsDouble();
		System.out.println("Gjennomsnitt lon kvinner er : " + lonKvinner);
		System.out.println();

		/**
		 * Oppg�ve d : Gi alle Sjefer ei lonsauking pa 7%
		 */
		
		System.out.println("Gjev alle sjefar ei l�nsauke p� 7%:");
		personer.stream()
			.filter(t -> t.getStilling() == "Sjef")
			.forEach(t -> t.endreLon(n -> n * 1.07));
		
		personer.stream()
		.filter(t -> t.getStilling() == "Sjef")
					.forEach(System.out::println);
		System.out.println();

		/**
		 * Oppg�ve e : Finn ut om nokon tener meir enn 800 000, true/false
		 */
		
		boolean meirEnn = personer.stream()
					.anyMatch(t -> t.getArslon() > 800000);
		System.out.println(meirEnn);
		System.out.println();
		
		/**
		 * Oppg�ve f : Skriv ut alle tilsette ved SYSO utan � bruka l�kka
		 */
		
		System.out.println("");
		personer.stream()
			.forEach(System.out::println);
		System.out.println();
		
		/**
		 * Oppg�ve g : skriv ut den/dei tilsette med l�gast l�n.
		 */
		
		double lagLon = personer.stream()
					.mapToDouble(t -> t.getArslon())
					.min()
					.orElseThrow(NoSuchElementException::new);
		System.out.println(lagLon);
		System.out.println();
		
		/**
		 * Oppg�ve h : Finn og skriv ut summen av alle heiltal i [1, 1000 > som er deleleg med 3 eller 5
		 */
		
		DoubleStream heiltal = IntStream.range(0, 1001)
					.mapToDouble(x -> x);
		System.out.println(heiltal.filter(x -> (x % 3 == 0 || x  % 5 == 0)).sum());
	}

}
