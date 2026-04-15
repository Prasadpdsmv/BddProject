package org.hrmWebsiteStepdefinitions;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.File;
import java.time.Duration;
import java.util.*;

public class forpractice {
    WebDriver driver;


    @Test

    @DataProvider(name = "uaser&password&output")
    public Object[][] userdata(){


        return new Object[][]
        {

                {"sds",3,true},
                {"fsg",4,false}
        };
    }
    @Test(dataProvider = "uaser&password&output")
    public void datamethod(){

    }
    @Test
    @Parameters
    public void methoddata(){

    }
    public void method11() {

        WebDriver driver = new ChromeDriver();

        driver.findElement(By.xpath("pahe"));
        driver.get("page");
        driver.getTitle();

        driver.findElements(By.xpath("fhbbfd"));

        WebElement elemens;

        List<WebElement> allFunction = new ArrayList<>();

        allFunction = driver.findElements(By.xpath(""));

    }

    public void method2() {

        String S = "Samsung";

        char ch = toString().charAt(2);
        System.out.println(ch);

        int a = 10;
        int b = 9;

        a = a + b;
        b = a - b;
        a = b - a;
        System.out.println(a);
        System.out.println(b);
    }

    public void method3() {
        switch (1) {
            case 1: {
            }
            case 2: {
            }
            case 3: {
            }
        }
        }
    public void method4(){

       JavascriptExecutor js = (JavascriptExecutor)driver;

       js.executeScript("document.getelementByid('valur').click;");
       js.executeAsyncScript("window.scrollby(0, 500);");



        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File f =screenshot.getScreenshotAs(OutputType.FILE);

        WebDriverWait waitfor=new WebDriverWait(driver, Duration.ofSeconds(5));

        waitfor.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("path")));

        Map<String, Integer> map=new HashMap<>();
        map.put("dfihid",5);

        String hand=driver.getWindowHandle();
        driver.switchTo().window(hand);

        Set<String> allHand=driver.getWindowHandles();
        allHand.iterator();
        Iterator<String> itr=allHand.iterator();

        itr.hasNext();
    }
    public void interviewQuest(){
        int i;
        for (int k=0; k<10;k++){
            System.out.println(k);
            if (k>1){
                System.out.print(k);
                k=1;
            }

        }
    }


        public static void main (String[]args){
            forpractice obj = new forpractice();
           // obj.method2();
            obj.interviewQuest();

        }

}
