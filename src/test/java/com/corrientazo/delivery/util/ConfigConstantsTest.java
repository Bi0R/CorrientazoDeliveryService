package com.corrientazo.delivery.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * This class check the constants, since those area loaded dynamically from properties
 * this also tests that functionality
 */
public class ConfigConstantsTest {
    @Test
    public void testConstants(){
        Assert.assertEquals(ConfigConstants.ORDER_FILE_NAME,"input.txt");
    }
}
