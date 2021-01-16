package org.testareAutomata;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class searchTest2 {

   @Test
    public void simpleSearch2 () {

       //search test with several words in chrome browser + add item to basket
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.emag.ro/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("searchboxTrigger")).sendKeys("controller wireless playstation" + Keys.ENTER);

        driver.findElement(By.xpath("//*[@id=\"card_grid\"]/div[1]/div/div/div[3]/div[3]/form/button")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("/html/body/div[13]/div/div/div[2]/div/div[3]/a")).sendKeys(Keys.ENTER);

        driver.quit();

    }
}
