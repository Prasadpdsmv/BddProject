package org.hrmWebsiteStepdefinitions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

    static WebDriver driver;

    public  void seteupDriver(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        //System.setProperty("ebdriver.chrome.driver", "./asd.exe");
        driver.manage().window().maximize();
        System.out.println("driver initialization started");
    }

}
