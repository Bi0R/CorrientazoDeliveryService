package com.corrientazo.delivery.order;

import com.corrientazo.delivery.io.DeliveryOrderFileReader;
import com.corrientazo.delivery.util.ConfigConstants;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Singleton queue containing all the delivery orders
 */
public class OrderQueue {

    private static  OrderQueue orderQueue;
    private static  ConcurrentLinkedQueue<String> orders;
    private static String fileName = ConfigConstants.ORDER_FILE_NAME;
    static{
        DeliveryOrderFileReader reader = new DeliveryOrderFileReader();
        orders = reader.readOrdersFromFile(fileName);
    }

    private OrderQueue(){
    }

    /**
     * Gives the next order in the queue
     * @return String with the instructions for the next order, null  if there are no more orders
     */
    public static String getNextOrder(){
        return orders.poll();
    }

}
