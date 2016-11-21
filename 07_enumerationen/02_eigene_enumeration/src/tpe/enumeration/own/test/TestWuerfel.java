package tpe.enumeration.own.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import tpe.enumeration.own.Wuerfel;
import tpe.enumeration.own.Wuerfeltyp;

/**
 * Test für die Würfel.
 */
public class TestWuerfel {

    /** Anzahl der Durchläufe (Gesetz der großen Zahl!). */
    private static final int RUNS = 1000000;

    /**
     * Testet die Fairness.
     */
    @Test
    public void testFairnessOfAll() {

        for (int i = 0; i < Wuerfeltyp.values().length; i++) {
            internalTestFairness(new Wuerfel(Wuerfeltyp.values()[i]));
        }
    }


    /**
     * Interne Hilfsmethode, um die Fairness zu testen.
     *
     * @param w der zu testende Wuerfel.
     */
    private void internalTestFairness(Wuerfel w) {
        double expected = Wuerfeltyp.valueOf("D" + w.getNumSides()).average();
        long sum = 0;

        for (int i = 0; i < RUNS; i++) {
            sum += w.roll();
        }

        double average = (double) sum / (double) RUNS;

        assertEquals(expected, average, 0.1);
    }
}
