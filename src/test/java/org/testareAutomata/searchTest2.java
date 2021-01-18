package org.testareAutomata;

import org.AppConfig;
import org.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class searchTest2 extends TestBase {

   @Test
    public void simpleSearch2 () {

       //search test with several words in chrome browser + add item to basket
        System.setProperty("webdriver.chrome.driver", AppConfig.getChromeDriverPath());

        driver.get(AppConfig.getSiteurl1());
        driver.findElement(By.id("searchboxTrigger")).sendKeys("controller wireless playstation" + Keys.ENTER);

        driver.findElement(By.xpath("//*[@id=\"card_grid\"]/div[1]/div/div/div[3]/div[3]/form/button")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("/html/body/div[13]/div/div/div[2]/div/div[3]/a")).sendKeys(Keys.ENTER);


    }
}
