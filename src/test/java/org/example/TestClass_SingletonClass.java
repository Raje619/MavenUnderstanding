package org.example;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass_SingletonClass {
WebDriver driver;

    @BeforeTest
    public void setUp()
    {
         DriverInit_SingletonClass D=DriverInit_SingletonClass.getInstance();

          driver = D.getBrowser("edge");
    }

    @Test
    public void openUrl()
    {
        driver.get("https://google.co.in");
        String a = driver.getTitle();
    }

    @AfterTest
    public void tearDown()
    {
        driver.quit();
    }

}
