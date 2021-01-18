package org;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppConfig {

    private static Properties properties = new Properties();

    static {
        InputStream inputStream = AppConfig.class.getClassLoader().getResourceAsStream("production.properties");

        try {
            properties.load(inputStream);
        } catch (IOException e) {
            System.out.println("Failed to load properties from configuration file");
        }

    }

    private static String chromeDriverPath = properties.getProperty("chrome.driver.path");
    private static String geckoDriverPath = properties.getProperty("gecko.driver.path");
    private static String internetExplorerDriverPath = properties.getProperty("ie.driver.path");
    private static String siteurl1 = properties.getProperty("site.url1");
    private static String siteurl2 = properties.getProperty("site.url2");
    private static String siteurl3 = properties.getProperty("site.url3");
    private static String siteurl4 = properties.getProperty("site.url4");
    private static String siteurl5 = properties.getProperty("site.url5");

    public static String getChromeDriverPath() {
        return chromeDriverPath;
    }

    public static String getGeckoDriverPath() {
        return geckoDriverPath;
    }

    public static String getInternetExplorerDriverPath() {
        return internetExplorerDriverPath;
    }

    public static String getSiteurl1() {
        return siteurl1;
    }

    public static String getSiteurl2() {
        return siteurl2;
    }

    public static String getSiteurl3() {
        return siteurl3;
    }

    public static String getSiteurl4() {
        return siteurl4;
    }

    public static String getSiteurl5() {
        return siteurl5;
    }

}
