package org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {

    public static WebDriver getDriver(String browser){
        WebDriver driver;

        switch (browser) {
            default:
                System.out.println("Using deafult broswer: Chrome");
            case "chrome":
                System.setProperty("webdriver.chrome.driver", AppConfig.getChromeDriverPath());
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", AppConfig.getGeckoDriverPath());
                driver = new FirefoxDriver();
            case "ie":
                System.setProperty("webdriver.ie.driver", AppConfig.getInternetExplorerDriverPath());
                driver = new InternetExplorerDriver();
                break;
        }

        return driver;

    }
}
