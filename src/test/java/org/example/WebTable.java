package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTable {
    public static void main(String[] args) {
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://www.w3schools.com/html/html_tables.asp");
//        driver.findElement(By.xpath("//table[@id=\"customers\"]//tb"));
        int rowCount=driver.findElements(By.xpath("//table[@id=\"customers\"]//tr")).size();
        int colCount=driver.findElements(By.xpath("//table[@id=\"customers\"]//th")).size();
        for (int i=1;i<rowCount;i++)
        {
            for (int j=1;j<=colCount;j++)
            {
                String actValue = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr["+(1+i)+"]/td["+j+"]")).getText();
                if (actValue.equals("Mexico"))
                {
                 System.out.println(i+"  "+j);
                }
            }
        }

    }
}
