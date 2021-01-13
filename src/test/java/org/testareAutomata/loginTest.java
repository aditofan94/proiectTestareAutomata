package org.testareAutomata;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class loginTest {

    @Test
    public void loginAttempt () {

        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //login attempt with dummy text
        driver.get("https://www.linkedin.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.id("session_key")).sendKeys("123testemail" + Keys.ENTER);
        driver.findElement(By.id("session_password")).sendKeys("123testpassword" + Keys.ENTER);

    }
}
