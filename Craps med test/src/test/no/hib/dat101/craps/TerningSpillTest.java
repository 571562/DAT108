package no.hib.dat101.craps;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Tester om terningsspillet spiller riktig.
 * 
 * @author Atle Geitung
 */
public class TerningSpillTest {
    
    private static final Integer ANTALL_KAST = 1000000;
    private TerningSpill spill;

    /**
     * Initialiserer spillet.
     */
    @Before
    public void setUp() {
        spill = new TerningSpill();
    }

    /**
     * Tester spillet.
     */
    @Test
    public void erSpillRiktig() {
        for (int i = 0; i < ANTALL_KAST; i++) {
            spill.spill();
            assertEquals(spill.getVerdi() == 7, spill.getSeier());
        }
    }

}
