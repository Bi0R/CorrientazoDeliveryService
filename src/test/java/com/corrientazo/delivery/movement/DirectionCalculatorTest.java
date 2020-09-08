package com.corrientazo.delivery.movement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class DirectionCalculatorTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testPorperRightRotations()
    {
        assertEquals(DirectionCalculator.calulateDirection('N','D'),'O');
        assertEquals(DirectionCalculator.calulateDirection('O','D'),'S');
        assertEquals(DirectionCalculator.calulateDirection('S','D'),'P');
        assertEquals(DirectionCalculator.calulateDirection('P','D'),'N');
    }

    @Test
    public void testProperLeftRotations(){
        assertEquals(DirectionCalculator.calulateDirection('N','I'),'P');
        assertEquals(DirectionCalculator.calulateDirection('P','I'),'S');
        assertEquals(DirectionCalculator.calulateDirection('S','I'),'O');
        assertEquals(DirectionCalculator.calulateDirection('O','I'),'N');
    }
}
