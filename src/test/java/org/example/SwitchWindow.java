package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class SwitchWindow {
    public static void main(String[] args) {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        for (int i=1;i<5;i++)
        {
            driver.findElement(By.xpath("//*[@id=\"social-icons\"]/a["+i+"]/img")).click();
        }
        Set<String> winList= driver.getWindowHandles();
        for(String a : winList)
        {
            String name = driver.switchTo().window(a).getTitle();
            if(name.contains("YouTube"))
            {
                System.out.println("Window is switched to youtube");
            }
        }
    }
}