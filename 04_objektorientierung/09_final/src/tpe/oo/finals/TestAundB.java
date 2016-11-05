package tpe.oo.finals;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestAundB {
    @Test
    public void testA(){
        A a = new A();

        assertEquals(8,a.add(5, 3));
        assertEquals(2,a.add(5, -3));
        assertEquals(-2,a.add(-5, 3));
        assertEquals(3,a.add(0, 3));
        assertEquals(5,a.add(5, 0));
    }
    @Test
    public void testB(){
        B b = new B();
        assertEquals(8,b.add(5, 3));
        assertEquals(2,b.add(5, -3));
        assertEquals(-2,b.add(-5, 3));
        assertEquals(3,b.add(0, 3));
        assertEquals(5,b.add(5, 0));

        assertEquals(305,B.sub(5, 300));
        assertEquals(497,B.sub(500, -3));
        assertEquals(-94,B.sub(-5, 99));
        assertEquals(101,B.sub(0, 101));
        assertEquals(-5,B.sub(5, 0));
    }
}

