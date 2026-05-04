package utils;

import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    private static Properties props = new Properties();

    static {
        try {
            InputStream input = ConfigReader.class
                    .getClassLoader()
                    .getResourceAsStream("config.properties");

            props.load(input);

        } catch (Exception e) {
            throw new RuntimeException("Cannot load config file");
        }
    }

    public static String get(String key) {
        return props.getProperty(key);
    }
}