package com.Utlities;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Reporting implements ITestListener{

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("test started successfully");
        ITestListener.super.onTestStart(result);
    }


}
