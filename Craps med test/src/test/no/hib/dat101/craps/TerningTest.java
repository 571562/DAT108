package no.hib.dat101.craps;

import static org.junit.Assert.fail;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Tester om terningen er ok.
 * 
 * @author Atle Geitung
 */
public class TerningTest {

    private Terning terning;
    private static final Integer ANTALL_KAST = 1000000;
    private static final Double VARIASJON = 0.01;
    private int[] verdier = new int[6];

    /**
     * Initialisering for hver test.
     */
    @Before
    public void setUp() {
        terning = new Terning();
    }

    /**
     * Test om terningverdien er i verdiområdet [1, ANTALL_VERDIER]. Triller den ANTALL_KAST ganger og regner med hvis
     * den er innenfor ANTALL_KAST ganger, så vil den forbli det.
     */
    @Test
    public void erVerdiRiktig() {
        for (int i = 0; i < ANTALL_KAST; i++) {
            terning.trill();
            if (terning.getVerdi() < 1 || terning.getVerdi() > 6) {
                fail("Terningen har feil verdi");
            }
        }
    }

    /**
     * Test om terningverdien er jevnt fordelt. Triller den ANTALL_VERDIER ganger ANTALL_KAST ganger, og ser om det er
     * under forventet avvik.
     */
    @Test
    public void erVerdiJevntFordelt() {
        for (int i = 0; i < 6 * ANTALL_KAST; i++) {
            terning.trill();
            verdier[terning.getVerdi() - 1]++;
        }
        Double middel = ANTALL_KAST.doubleValue();
        Double sum = 0.;
        for (int verdi : verdier) {
            sum += (verdi - middel) * (verdi - middel);
        }
        Double stdAvvik = Math.sqrt(sum / 6);

        assertTrue(stdAvvik < (ANTALL_KAST * VARIASJON));
    }

}
