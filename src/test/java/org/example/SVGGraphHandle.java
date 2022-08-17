package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class SVGGraphHandle {
    public static void main(String[] args) {

        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://www.google.com/search?q=covid+cases+in+india&rlz=1C1JJTC_enIN1013IN1013&oq=covid+cases&aqs=chrome.3.69i57j0i402l2j0i433i512l2j0i512j0i433i512j69i61.3980j0j7&sourceid=chrome&ie=UTF-8");
        List<WebElement> list = driver.findElements(By.xpath("//*[name()='svg']//*[local-name()='rect']"));
        Actions act = new Actions(driver);
        for (WebElement rec : list)
        {
            act.moveToElement(rec).build().perform();
            String text = driver.findElement(By.xpath("//div[@class='ExnoTd']")).getText();
            System.out.println(text);
//            rec.getAttribute("")
        }
    }
}
