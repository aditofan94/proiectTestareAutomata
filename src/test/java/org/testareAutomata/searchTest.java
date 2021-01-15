package org.testareAutomata;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class searchTest {

    @Test
    public void simpleSearch () {

        //search with one word in chrome browser
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver1 = new ChromeDriver();

        driver1.get("https://www.emag.ro/");
        driver1.manage().window().maximize();
        driver1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver1.findElement(By.id("searchboxTrigger")).sendKeys("mouse" + Keys.ENTER);

        driver1.quit();

        //search with one word in firefox browser
        System.setProperty("webdriver.gecko.driver", "C:\\webdrivers\\geckodriver.exe");
        WebDriver driver2 = new FirefoxDriver();

        driver2.get("https://www.pcgarage.ro/");
        driver2.manage().window().maximize();
        driver2.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver2.findElement(By.id("searchac")).sendKeys("keyboard" + Keys.ENTER);

        driver2.quit();

    }
}
