package org.teste;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class loginTest {

    @Test
    public void loginAttempt () {
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.linkedin.com/");

        driver.findElement(By.id("session_key")).sendKeys("adi_tofan@yahoo.com" + Keys.ENTER);
        driver.findElement(By.id("session_password")).sendKeys("testpassword" + Keys.ENTER);
    }
}
