package tpe.oo.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import tpe.oo.metropolis.Steuerberater;

public class test {

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Test
    public void EKS() {
        Steuerberater sb = new Steuerberater();
        assertEquals(800, sb.EKS(10000));
        assertEquals(1600, sb.EKS(20000));
        assertEquals(3100, sb.EKS(30000));
        assertEquals(4600, sb.EKS(40000));
        assertEquals(6100, sb.EKS(50000));
        assertEquals(7600, sb.EKS(60000));
        assertEquals(12600, sb.EKS(80000));
        assertEquals(17600, sb.EKS(100000));
        assertEquals(22600, sb.EKS(120000));
        assertEquals(30600, sb.EKS(140000));
        assertEquals(34600, sb.EKS(150000));
        assertEquals(54600, sb.EKS(200000));
    }
}
