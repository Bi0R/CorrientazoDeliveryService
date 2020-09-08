package com.corrientazo.delivery.io;

import org.junit.Assert;
import org.junit.Test;

import java.util.Properties;

public class PropertyReaderTest {
    @Test
    public void testPropertyReader(){
        PropertyReader reader = new PropertyReader();
        Properties properties = reader.getPropValues();
        Assert.assertNotEquals(properties.size(),0);
        Assert.assertEquals(properties.getProperty("order.file.name"),"input.txt");
    }
}
