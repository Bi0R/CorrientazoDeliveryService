package com.corrientazo.delivery.dron;

import com.corrientazo.delivery.bean.Coordenate;
import com.corrientazo.delivery.bean.Location;
import com.corrientazo.delivery.io.DeliveryReportWriter;
import com.corrientazo.delivery.movement.MovementPerformer;
import com.corrientazo.delivery.movement.OrderInstructionsPerformer;
import com.corrientazo.delivery.order.OrderQueue;
import com.corrientazo.delivery.util.ConfigConstants;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DronMessenger extends Thread{
    private static final int MAX_ORDERS = ConfigConstants.MAX_ORDERS_PER_DRON;
    private List<String> orders = new ArrayList<>();
    private List<String> reports = new ArrayList<>();

    public DronMessenger(String name){
        this.setName(name);
    }

    @Override
    /**
     * Tries to read and deliver as many orders as the ones established by the Max orders
     */
    public void run(){
        Location origin;
        //first load orders delimited by MAX_ORDERS
        for (int i =0; i<MAX_ORDERS;i++){
            String order = OrderQueue.getNextOrder();
            if(order!=null){
                orders.add(order);
            }else{
                break;
            }
        }
        //Then deliver the orders
        reports = new ArrayList<>();
        for(String order:orders){
            reports.add(OrderInstructionsPerformer.performInstructions(order));
        }
        String fileName=ConfigConstants.REPORT_PATH+ File.separator+this.getName()+".txt";
        DeliveryReportWriter.writeReport(fileName, reports);
    }
}
