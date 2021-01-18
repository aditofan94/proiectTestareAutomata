package org.testareAutomata;

import org.AppConfig;
import org.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;

public class submitWebFormTest extends TestBase {


    @Test
    public void completeWebForm () {

        //complete all steps in the web form and then click the "submit" button
        System.setProperty("webdriver.chrome.driver", AppConfig.getChromeDriverPath());

        driver.get(AppConfig.getSiteurl5());

        driver.findElement(By.id("first-name")).sendKeys("Adrian");
        driver.findElement(By.id("last-name")).sendKeys("Tofan");
        driver.findElement(By.id("job-title")).sendKeys("International Sign-Up Support");

        driver.findElement(By.id("radio-button-3")).click();
        driver.findElement(By.id("checkbox-1")).click();
        driver.findElement(By.xpath("//*[@id=\"select-menu\"]/option[3]")).click();
        driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[4]/td[1]")).click();
        driver.findElement(By.xpath("/html/body/div/form/div/div[8]/a")).click();

    }
}
