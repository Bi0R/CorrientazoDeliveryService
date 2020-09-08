package com.corrientazo.delivery.io;

import org.junit.Assert;
import org.junit.Test;

import java.util.Properties;
import java.util.concurrent.ConcurrentLinkedQueue;

public class DeliveryOrderFileReaderTest {
    @Test
    public void testReadOrders(){
        DeliveryOrderFileReader reader = new DeliveryOrderFileReader();
        ConcurrentLinkedQueue queue = reader.readOrdersFromFile("input.txt");
        Assert.assertNotEquals(queue.size(), 0);
        Assert.assertNotNull(queue.poll());
    }
}
