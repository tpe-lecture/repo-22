package tpe.oo.vararg.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import tpe.oo.vararg.Statistik;

/**
 * Testet die Median-Methoden.
 */
public class TestMedian {

    /** Genauigkeit bei double-Vergleichen. */
    public static final double PRECISION = 0.0001;

    /**
     * Testet den Median für int-Werte.
     */
    @Test
    public void testIntMedian() {

        assertEquals(5, Statistik.median(4, 4, 4, 1, 2, 5, 15));
        assertEquals(9, Statistik.median(4, 1, 37, 2, 1));
        assertEquals(7, Statistik.median(7));
        assertEquals(8, Statistik.median(7, 9));
        assertEquals(5, Statistik.median(9, 2, 7, 3));

    }

    /**
     * Testet den Median für double-Werte.
     */
    @Test
    public void testDoubleMedian() {

        assertEquals(5.0, Statistik.mediand(4.0, 4.0, 4.0, 1.0, 2.0, 5.0, 15.0),
               PRECISION);
        assertEquals(9.0, Statistik.mediand(4.0, 1.0, 37.0, 2.0, 1.0),
               PRECISION);
        assertEquals(7.0, Statistik.mediand(7.0), PRECISION);
        assertEquals(8.0, Statistik.mediand(7.0, 9.0), PRECISION);
        assertEquals(5.25, Statistik.mediand(9.0, 2.0, 7.0, 3.0), PRECISION);

    }
}
