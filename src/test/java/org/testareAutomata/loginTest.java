package org.testareAutomata;

import org.AppConfig;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class loginTest {

    @Test
    public void loginAttempt () {

        //login attempt with dummy text in chrome browser
        System.setProperty("webdriver.chrome.driver", AppConfig.getChromeDriverPath());
        WebDriver driver = new ChromeDriver();

        driver.get(AppConfig.getSiteurl4());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

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

        driver.quit();

    }
}
