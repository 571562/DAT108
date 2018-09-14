package no.hvl.dat108;

import java.util.function.Function;

/**
 * 
 * @author herborg
 *
 */

public class Tilsett {
	private String fornamn;
	private String etternamn;
	private char kjonn;
	private double arslon;
	private String stilling;

	/**
	 * Generate constructor
	 * @param fornamn
	 * @param etternamn
	 * @param kjonn
	 * @param arslon
	 * @param stilling
	 */
	public Tilsett(String fornamn, String etternamn, char kjonn, double arslon, String stilling){
		this.fornamn = fornamn;
		this.etternamn = etternamn;
		this.kjonn = kjonn;
		this.arslon = arslon;
		this.stilling = stilling;
	}


	/**
	 * Generate getters and setters.
	 *
	 */
	public String getFornamn() {
		return fornamn;
	}
	public void setFornamn(String fornamn) {
		this.fornamn = fornamn;
	}
	
	public String getEtternamn() {
		return etternamn;
	}
	public void setEtternamn(String etternamn) {
		this.etternamn = etternamn;
	}
	
	public char getKjonn() {
		return kjonn;
	}
	public void setKjonn(char kjonn) {
		this.kjonn = kjonn;
	}
	
	public double getArslon() {
		return arslon;
	}
	public void setArslon(double arslon) {
		this.arslon = arslon;
	}
	
	public String getStilling() {
		return stilling;
	}
	public void setStilling(String stilling) {
		this.stilling = stilling;
	}
	
	public double endreLon(Function<Double, Double> nyverdi) {
		return this.arslon = nyverdi.apply( getArslon());
		
	}


	/**
	 * Generate toString()
	 */
	@Override
	public String toString() {
		return "Tilsett [fornamn=" + fornamn + ", etternamn=" + etternamn + ", kjonn=" + kjonn + ", arslon=" + arslon
				+ ", stilling=" + stilling + "]";
	}
	
	
}
