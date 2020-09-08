package com.corrientazo.delivery.io;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.ConcurrentLinkedQueue;

public class DeliveryOrderFileReader {

    public  ConcurrentLinkedQueue<String> readOrdersFromFile(String fileName){
        ConcurrentLinkedQueue<String> orders = new ConcurrentLinkedQueue<>();
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource(fileName).getFile());
            String content = new String(Files.readAllBytes(file.toPath()));
            String[] lines = content.split("\n");
            for(String line: lines){
                orders.offer(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return orders;
    }
}
