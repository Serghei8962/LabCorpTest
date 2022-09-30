package com.LabCorp.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    private static WebDriver obj;


    private Driver(){

    }

    public static WebDriver getDriver(){
        String browserName= ConfigReader.read("browser");

        if(obj==null) {
            switch (browserName.toLowerCase().trim()) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    obj = new ChromeDriver();
                    obj.manage().window().maximize();
              obj.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    obj = new FirefoxDriver();
                    obj.manage().window().maximize();
                    obj.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    break;
                default:
                    obj = null;
            }

            return obj;


        }else {
            return obj;
        }
    }


    public static void closeBrowser(){

        if(obj!=null){
            obj.quit();
            obj = null;
        }

    }




}
