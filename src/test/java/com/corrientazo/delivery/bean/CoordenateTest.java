package com.corrientazo.delivery.bean;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test coordenate bean is working fine
 */
public class CoordenateTest {
    @Test
    public void  testCoordenateToString(){
        Coordenate test = new Coordenate(0, 0);
        Assert.assertEquals("(0, 0)",test.toString());
    }
}
