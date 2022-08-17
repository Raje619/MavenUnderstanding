package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SVG3DImageHandle {
    public static void main(String[] args) {

        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("http://debeissat.nicolas.free.fr/svg3d.php");
        driver.switchTo().frame("svg_result");
        List<WebElement> ele = driver.findElements(By.xpath("//*[name()='svg']//*[local-name()='g']//*[local-name()='path']"));
        for (WebElement a : ele) {
            String value = a.getAttribute("d");
            System.out.println("d attribute value of 3d image " + value);
        }
    }
}
