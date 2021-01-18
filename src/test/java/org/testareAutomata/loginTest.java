package org.testareAutomata;

import org.AppConfig;
import org.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class loginTest extends TestBase {

    @Test
    public void loginAttempt () {

        //login attempt with dummy text in chrome browser
        System.setProperty("webdriver.chrome.driver", AppConfig.getChromeDriverPath());

        driver.get(AppConfig.getSiteurl4());

        driver.findElement(By.id("session_key")).sendKeys("adrian" + Keys.ENTER);
        driver.findElement(By.id("session_password")).sendKeys("adrianpassword" + Keys.ENTER);

        driver.findElement(By.id("session_key")).clear();
        driver.findElement(By.id("session_password")).clear();

        driver.findElement(By.id("session_key")).sendKeys("diana" + Keys.ENTER);
        driver.findElement(By.id("session_password")).sendKeys("dianapassword" + Keys.ENTER);

        driver.findElement(By.id("session_key")).clear();
        driver.findElement(By.id("session_password")).clear();

        driver.findElement(By.id("session_key")).sendKeys("anca" + Keys.ENTER);
        driver.findElement(By.id("session_password")).sendKeys("ancapassword" + Keys.ENTER);

        driver.findElement(By.id("session_key")).clear();
        driver.findElement(By.id("session_password")).clear();

        driver.findElement(By.id("session_key")).sendKeys("adi_tofan@yahoo.com" + Keys.ENTER);
        driver.findElement(By.id("session_password")).sendKeys("??????" + Keys.ENTER);

    }
}
