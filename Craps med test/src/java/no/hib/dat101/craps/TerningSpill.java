package no.hib.dat101.craps;

/**
 * Terningsspillet fra læreboken.
 * 
 * @author Atle Geitung
 */
public class TerningSpill {

    private Terning terning1;
    private Terning terning2;
    private Boolean seier;

    /**
     * Lager et nytt terningspill.
     */
    public TerningSpill() {
        terning1 = new Terning();
        terning2 = new Terning();
    }

    /**
     * Spiller spillet.
     */
    public final void spill() {
        terning1.trill();
        Integer verdi1 = terning1.getVerdi();
        terning2.trill();
        Integer verdi2 = terning2.getVerdi();
        seier = (verdi1 + verdi2) == 7;
    }

    /**
     * Henter seier.
     *
     * @return seier
     */
    public Boolean getSeier() {
        return seier;
    }

    /**
     * Henter verdi av kastet.
     *
     * @return verdi
     */
    public Integer getVerdi() {
        return terning1.getVerdi() + terning2.getVerdi();
    }

    /**
     * Viser resultatet.
     */
    private void vis() {
        System.out.println("Terningene viser: " + terning1.getVerdi() + " " + terning2.getVerdi());
        System.out.println("" + (seier ? "Jeg vant" : "Jeg tapte"));
    }

    /**
     * Tilsvarer spilleren i eksempelet.
     * 
     * @param args ikke i bruk
     */
    public static void main(final String[] args) {
        TerningSpill spill = new TerningSpill();
        spill.spill();
        spill.vis();
    }

}
