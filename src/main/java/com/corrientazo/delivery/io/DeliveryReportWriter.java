package com.corrientazo.delivery.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class DeliveryReportWriter {
    /**
     * Writes report using the List of Locations given
     * @param fileName the name of the report
     * @param reports a List of the Locationsthat the dron reached
     */
    public static void writeReport(String fileName, List<String> reports){
        if(reports.size()>0) {
            try {
                FileWriter fileWriter = new FileWriter(fileName);
                PrintWriter printWriter = new PrintWriter(fileWriter);
                for (String report : reports) {
                    printWriter.println(report);
                }
                printWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
