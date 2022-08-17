package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class SVGComplexGraphHandle {
    public static void main(String[] args) {

        //need to check

        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://www.google.com/search?q=covid+cases+in+india&rlz=1C1JJTC_enIN1013IN1013&oq=covid+cases&aqs=chrome.3.69i57j0i402l2j0i433i512l2j0i512j0i433i512j69i61.3980j0j7&sourceid=chrome&ie=UTF-8");
        driver.manage().window().fullscreen();
        Actions ac = new Actions(driver);
        WebElement graph=driver.findElement(By.xpath("(//*[name()='svg' and @class='uch-psvg'])[2]"));
        int x =(graph.getSize().getHeight()/2)-graph.getSize().getHeight();
        int y=(graph.getSize().getWidth()/2)-graph.getSize().getWidth();
        for (int i = 0 ;i<=100;i++) {
            ac.moveToElement(graph, x+i, y);
            String text = driver.findElement(By.xpath("//table[@class='swWWne']")).getText();
            System.out.println(text);
            System.out.println(" ");
        }
    }
}
