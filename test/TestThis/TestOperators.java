package TestThis;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;
import laborwork1.Operators;

/**
 *
 * @author yural
 */
public class TestOperators {
    Operators ops;
    @Before
    public void preTest() {
        ops = new Operators();
    }
    
    @Test
    public void testAdd() {
        double sum = ops.add(50, 5);
        assertEquals(55, sum, 0.00001);
    }
    
    @Test
    public void testMultiply() {
        double mul = ops.multiply(2, 2);
        assertEquals(4, mul, 0.00001);
    }
    
    
}