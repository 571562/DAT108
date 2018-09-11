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
	private int arslon;
	private String stilling;
	
	public Tilsett(String fornamn, String etternamn, char kjonn, int arslon, String stilling){
		this.fornamn = fornamn;
		this.etternamn = etternamn;
		this.kjonn = kjonn;
		this.arslon = arslon;
		this.stilling = stilling;
	}
	

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
	
	public int getArslon() {
		return arslon;
	}
	public void setArslon(int arslon) {
		this.arslon = arslon;
	}
	
	public String getStilling() {
		return stilling;
	}
	public void setStilling(String stilling) {
		this.stilling = stilling;
	}
	
	public int endreLon(Function<Integer, Integer> nyverdi) {
		return this.arslon = nyverdi.apply(getArslon());
		
	}


	@Override
	public String toString() {
		return "Tilsett [fornamn=" + fornamn + ", etternamn=" + etternamn + ", kjonn=" + kjonn + ", arslon=" + arslon
				+ ", stilling=" + stilling + "]";
	}
	
	
}
