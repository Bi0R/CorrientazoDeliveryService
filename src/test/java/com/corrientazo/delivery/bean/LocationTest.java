package com.corrientazo.delivery.bean;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test that Location bean is working fine
 */
public class LocationTest {
    @Test
    public void testLocationToString(){
        Location test = new Location(0,0,'N');
        Assert.assertEquals("(0, 0) dirección Norte", test.toString());
    }
}
