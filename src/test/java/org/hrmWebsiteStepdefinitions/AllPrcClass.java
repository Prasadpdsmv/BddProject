package org.hrmWebsiteStepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class AllPrcClass extends BaseClass{

    @Test
    public void test1(){
        System.out.println("test1 is running");
        seteupDriver();
        driver.get("https://webdriveruniversity.com/Datepicker/index.html");

        driver.findElement(By.xpath("//i[@class=\"glyphicon glyphicon-calendar\"]")).click();

        //click on  month and year
        driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']")).click();

        // click on year
        driver.findElement(By.xpath("//div[@class=\"datepicker-months\"]//th[@class=\"datepicker-switch\"]")).click();
        // select year
        driver.findElement(By.xpath("//span[@class='year' and contains(text(), '2022')]")).click();

        // click on month
        driver.findElement(By.xpath("//span[@class='month' and contains(text(),'Jun')]")).click();

        //click on day
        driver.findElement(By.xpath("//div[@class='datepicker-days']//td[@class='day' and contains(text(),'13')]")).click();




    }
    @Test
    public void test2(){
        System.out.println("test2 is running");
        seteupDriver();
        driver.get("https://webdriveruniversity.com/Data-Table/index.html");

        WebElement table=driver.findElement(By.xpath("//table[@id='t01']"));
        List<WebElement> allRows=table.findElements(By.tagName("tr"));
        List<WebElement> allCol=table.findElements(By.tagName("td"));

        System.out.println("all row values are:");
        for (WebElement row:allRows){
            System.out.println(row.getText());
        }
        System.out.println("all column values are:");
         for (WebElement col:allCol) {
             System.out.println(col.getText());
         }

        System.out.println("assertion started");

        //Assert.assertEquals(allCol.get(1).getText(),"Sth");
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(allCol.get(1).getText(),"Sth");


        System.out.println("test2 is completed");

        softAssert.assertAll();

    }

}
