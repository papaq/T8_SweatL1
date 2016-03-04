/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestThis;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import laborwork1.Task2Var20;

/**
 *
 * @author yural
 */
public class TestTask2 {
    Task2Var20 t2;
    @Before
    public void preTest() {
        t2 = new Task2Var20();
    }
    
    @Test
    public void testCountDigits() {
        int digits = t2.numberOfDigits(123456);
        assertEquals(6, digits);
    }
    
    @Test
    public void testShift() {
        int number = t2.shiftRight(54321, 2);
        assertEquals(21543, number);
    }
    
    @Test
    public void testNaturalLog() {
        assertEquals(1, t2.nLog(Math.E), 0.0001);
    }
}
