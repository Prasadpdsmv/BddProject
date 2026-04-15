package org.hrmWebsiteStepdefinitions;

import io.cucumber.java.Before;
import org.testng.annotations.BeforeMethod;

public class Hooks extends BaseClass{

    @Before
    public void startDriver(){
        System.out.println("here before hook started");
        seteupDriver();
    }
}
