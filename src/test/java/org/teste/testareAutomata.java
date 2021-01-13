package org.teste;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class testareAutomata {

    @Test
    public void testeAutomate () {

        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //search test with one word
        driver.get("https://www.emag.ro/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("searchboxTrigger")).sendKeys("mouse" + Keys.ENTER);

        //log in attempt
        driver.get("https://www.linkedin.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("session_key")).sendKeys("123testemail" + Keys.ENTER);
        driver.findElement(By.id("session_password")).sendKeys("123testpassword" + Keys.ENTER);
        
        driver.close();

    }
}
