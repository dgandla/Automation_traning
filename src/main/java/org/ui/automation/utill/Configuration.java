package org.ui.automation.utill;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configuration {
    private static final String CONFIG_FILE_PATH = "resources/Config.properties";
    static  InputStream in;
    static Properties prop = loadProperties(CONFIG_FILE_PATH);

    private static Properties loadProperties(String configFilePath){
        try {
            in = new FileInputStream(configFilePath);
            prop = new Properties();
            prop.load(in);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return prop;
    }

    public static String getApplicationUrl(){
        String applicationUrl = prop.getProperty("app.url");
        if(null==applicationUrl){
        }
        return applicationUrl;
    }

    public static String getWebDriverLocation(){
        String webDriverLocation = prop.getProperty("webdriver.location");
        return webDriverLocation;
    }

    public static String getTestBrowser(){
        String testBrowser = prop.getProperty("test.browser");
        return testBrowser;
    }

    public static void main(String[] args) {
        System.out.println(getApplicationUrl());
    }
}
