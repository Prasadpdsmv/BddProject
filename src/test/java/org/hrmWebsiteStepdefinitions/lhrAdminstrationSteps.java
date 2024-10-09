package org.hrmWebsiteStepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class lhrAdminstrationSteps {
    WebDriver driver;
       hrpageObjects hrpage;

    @Given("user opens HRM website")
    public void user_opens_hrm_website() {
        driver=new ChromeDriver();
        hrpage=new hrpageObjects(driver);
        hrpage.openHomePage();
    }


    @Then("user mouse hover on solutions")
    public void user_mouse_hover_on_solutions() {
        hrpage.mouseHoverSolutions();

    }
    @Then("user mouse hover on People management and clich HR Administration")
    public void user_mouse_hover_on_people_management_and_clich_hr_administration() throws InterruptedException {

        hrpage.navigateToHrAdministration();
    }
    @Then("user Verifies Demo button Availability")
    public void user_verifies_demo_button_availability() {
        Assert.assertTrue(hrpage.verifyDemoButton());
        driver.close();
    }
    @Then("user navigates to onbording page")
    public void user_navigates_to_onbording_page() {
        hrpage.navigateToOnboarding();
    }

    @Then("user navigates to performance management")
    public void userNavigatesToPerformanceManagement() {
        hrpage.navigateToPerformanceManagement();
    }

    @Then("user navigates to Trainnigpage")
    public void userNavigatesToTrainnigpage() {
        hrpage.navigateToTraining();
    }
}
