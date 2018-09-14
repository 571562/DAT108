package no.hvl.dat108.f06;

import java.util.Random;
//class minRunnable implements Runnable{

//	@Override							//For at det skal gå å bruka runnable må ein laga ein "klasse" inni klassen
//	public void run() {
//		Eksempel1_Oppgave.doSomeWildStuff();		
//	}
//	
//}

public class Eksempel1_Oppgave {

	public static void main(String[] args) {
		/*
		 * Opprett og start 2 tråder som kjører doSomeWildStuff() samtidig.
		 */
//		Runnable r = new Runnable() {	//Kan gjer det slik som her eller slik som det er gjort over klassestart.
//		@Override
//		public void run() {
//			doSomeWildStuff();
//		}
//		};
		
		Runnable r = () -> doSomeWildStuff();
			//Enda ein måte å gjer det på! Her skrive som eit lambda-uttrykk
		
		
	
		Thread tread1 = new Thread(r);
		Thread tread2 = new Thread(r);
		
		tread1.start();
		tread2.start();
		
		
	}
	
	public static void doSomeWildStuff() {
		Random r = new Random();
		for (int i=1; i<=10; i++) {
				System.out.println(i);
			try {
				Thread.sleep(r.nextInt(100));
			} catch (InterruptedException e) {
			}
		}
	}
}

