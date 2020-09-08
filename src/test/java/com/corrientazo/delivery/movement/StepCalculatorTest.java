package com.corrientazo.delivery.movement;

import com.corrientazo.delivery.bean.Coordenate;
import com.corrientazo.delivery.bean.Location;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests that the proper step is performed.
 */
public class StepCalculatorTest {
   @Test
    public void testNorthStep(){
       Location origin  = new Location(-1,0,'N');
       Coordenate destiny = new Coordenate(-1,1);
       Coordenate calculated = StepCalculator.calculateStep(origin);
       assertEquals(calculated.getX(), destiny.getX());
       assertEquals(calculated.getY(), destiny.getY());
   }
    @Test
    public void testEastStep(){
        Location origin  = new Location(-1,0,'O');
        Coordenate destiny = new Coordenate(0,0);
        Coordenate calculated = StepCalculator.calculateStep(origin);
        assertEquals(calculated.getX(), destiny.getX());
        assertEquals(calculated.getY(), destiny.getY());
    }

    @Test
    public void testSouthStep(){
        Location origin  = new Location(-1,0,'S');
        Coordenate destiny = new Coordenate(-1,-1);
        Coordenate calculated = StepCalculator.calculateStep(origin);
        assertEquals(calculated.getX(), destiny.getX());
        assertEquals(calculated.getY(), destiny.getY());
    }

    @Test
    public void testWestStep(){
        Location origin  = new Location(-1,0,'P');
        Coordenate destiny = new Coordenate(-2,-0);
        Coordenate calculated = StepCalculator.calculateStep(origin);
        assertEquals(calculated.getX(), destiny.getX());
        assertEquals(calculated.getY(), destiny.getY());
    }
}
