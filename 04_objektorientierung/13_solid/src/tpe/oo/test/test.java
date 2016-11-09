package tpe.oo.test;


import static org.junit.Assert.assertEquals;
import org.junit.AfterClass;
import tpe.oo.metropolis.Steuerberater;


/**
 * testet Metropolis.
 *
 */
public class Test {
    /**
     *
     * @throws Exception nö
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    /**
     * testet den Steuerberater.
     */
    @org.junit.Test
    public void eks() {
        Steuerberater sb = new Steuerberater();


        assertEquals(800, sb.testeks(10000));
        assertEquals(1600, sb.testeks(20000));
        assertEquals(3100, sb.testeks(30000));
        assertEquals(4600, sb.testeks(40000));
        assertEquals(6100, sb.testeks(50000));
        assertEquals(7600, sb.testeks(60000));
        assertEquals(12600, sb.testeks(80000));
        assertEquals(17600, sb.testeks(100000));
        assertEquals(22600, sb.testeks(120000));
        assertEquals(30600, sb.testeks(140000));
        assertEquals(34600, sb.testeks(150000));
        assertEquals(54600, sb.testeks(200000));
    }
}
