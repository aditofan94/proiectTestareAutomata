package org.example.search;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchTest {

    @Test
    public void searchWithOneWord () {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.emag.ro/");

        driver.findElement(By.id("searchboxTrigger")).sendKeys("mouse" + Keys.ENTER);
    }
}
