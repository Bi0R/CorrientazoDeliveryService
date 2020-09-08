package com.corrientazo.delivery.io;

import com.corrientazo.delivery.util.ConfigConstants;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {
    InputStream inputStream;
    public Properties getPropValues() {
        Properties properties = new Properties();
        try {
            String propFileName = ConfigConstants.CONFIG_FILE;

            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

            if (inputStream != null) {
                properties.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }

        } catch (Exception e) {

        } finally {
            try {
                inputStream.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return properties;
    }
}
