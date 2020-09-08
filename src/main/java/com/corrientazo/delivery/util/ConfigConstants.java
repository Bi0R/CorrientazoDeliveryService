package com.corrientazo.delivery.util;

import com.corrientazo.delivery.io.PropertyReader;

import java.util.Properties;

public class ConfigConstants {
    private static final Properties appProperties = new PropertyReader().getPropValues();
    public static final String CONFIG_FILE="app.properties";
    public static final String REPORT_PATH=
            appProperties.getProperty("report.path");
    public static final String REPORT_PREFIX=
            appProperties.getProperty("prefix.report.files");
    public static final int MAX_ORDERS_PER_DRON =
            Integer.valueOf(appProperties.getProperty("max.orders.per.dron"));
    public static final int WAITING_TIME_IN_MILLIS =
            Integer.valueOf(appProperties.getProperty("wait.time.in.millis"));
    public static final int SERVICE_TIME_IN_MILLIS =
            Integer.valueOf(appProperties.getProperty("service.time.in.millis"));
    public static final int MAX_NUMBER_OF_DRONES =
            Integer.valueOf(appProperties.getProperty("max.dron.messengers"));
    public static final int MAX_DISTANCE_IN_BLOCKS =
            Integer.valueOf(appProperties.getProperty("max.distance.in.blocks"));
    public static final String ORDER_FILE_NAME=
            appProperties.getProperty("order.file.name");
    public static final String NUMBER_FORMAT_FOR_FILES=
            appProperties.getProperty("number.format.for.files");
}
