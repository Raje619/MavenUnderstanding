package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class DriverInit_SingletonClass {

    static DriverInit_SingletonClass init=null;
    WebDriver driver ;


    private DriverInit_SingletonClass()
    {

    }

    public WebDriver getBrowser(String browsername)
    {
        if (browsername.equalsIgnoreCase("chrome")){
        driver=WebDriverManager.chromedriver().create();}
        else if (browsername.equalsIgnoreCase("Edge")) {
            driver=WebDriverManager.edgedriver().create();
        }
        return driver;
    }

    public  static DriverInit_SingletonClass getInstance()
    {
        if (init==null)
        {
            init=new DriverInit_SingletonClass();
        }
        return init;
    }

}
