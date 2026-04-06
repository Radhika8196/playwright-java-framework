package utils;

import java.util.Properties;
	
import java.io.InputStream;

public class ConfigReader {

    private static ConfigReader instance;
    private Properties properties;

    public ConfigReader() {
        properties = new Properties();
        try {
            InputStream is = getClass()
                    .getClassLoader()
                    .getResourceAsStream("config.properties");

            if (is == null) {
                throw new RuntimeException("config.properties not found in classpath");
            }

            properties.load(is);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ConfigReader getInstance() {
        if (instance == null) {
            instance = new ConfigReader();
        }
        return instance;
    }

    public String get(String key) {
        return properties.getProperty(key);
    }
}

