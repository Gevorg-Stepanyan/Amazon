package configs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    protected static Properties prop = new Properties();
    static FileInputStream ip;
    public static String dataReader(String key) throws IOException {
        try {
            ip = new FileInputStream("src/main/java/configs/config.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        prop.load(ip);
        return prop.getProperty(key);
    }

}
