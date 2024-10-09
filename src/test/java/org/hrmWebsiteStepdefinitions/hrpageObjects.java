package org.hrmWebsiteStepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class hrpageObjects {

    WebDriver driver;

    public hrpageObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

//    WebElement logo=driver.findElement(By.xpath("//a[@class='navbar-brand nav-logo']"));
    @FindBy(how = How.XPATH, using = "//a[@aria-current=\"page\" and contains(text(), 'Solutions')]")
    WebElement Solutions;

    @FindBy(how = How.XPATH, using = "//a[@aria-current=\"page\" and contains(text(), 'Resources')]")
    WebElement Resources;

    @FindBy(how = How.XPATH, using = "")
    WebElement Company;

    @FindBy(how = How.XPATH, using = "//li[contains(text(),'People Management')]")
   // @FindBy(how = How.XPATH, using = "//div[@class=\"menu-title-row-view-platform\"]/parent::li/div[1]")
    WebElement PeopleManagement;

    @FindBy(how = How.XPATH, using = "//h6[@class=\"list-sub-menu-title\"]/a[contains(text(),'HR Administration')]")
    WebElement HRAdministration;
    @FindBy(how = How.XPATH, using = "//button[@class=\"btn btn-ohrm\"]")
    WebElement bookAdemoButton;
    @FindBy(how = How.XPATH, using = "//div[@class=\"platform-slider-content\"]")
    WebElement HrPageTitle;
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'People Management')]")
   // @FindBy(how = How.XPATH, using = "//div[@class=\"menu-title-row-view-platform\"]/parent::li/div[2]")
    WebElement TalentManagemt;
    @FindBy(how = How.XPATH, using = "//*[@class=\"list-sub-menu-title\"]/a[contains(text(),'Onboarding')]")
    WebElement OnBording;

    @FindBy(how = How.XPATH, using = "//*[@class=\"extra-menu-title\"]//a[.='STARTER (Open-Source)']")
            WebElement starter;
    //WebElement starter=driver.findElement(By.xpath("//*[@class=\"extra-menu-title\"]//a[.='STARTER (Open-Source)']"));

    @FindBy(how = How.XPATH, using = "//h6[@class=\"list-sub-menu-title\"]/a[ contains(text(), 'Performance Management')]")
            WebElement PerformanceManagement;
    @FindBy(how = How.XPATH, using = "//h6[@class=\"list-sub-menu-title\"]/a[ contains(text(), 'Training')]")
    WebElement Training;

    Actions act;
    public void mouseHoverSolutions(){
        act = new Actions(driver);
        act.moveToElement(Solutions).perform();

    }
    public void navigateToHrAdministration(){

        // this method changed

     /*   Actions act1 = new Actions(driver);

        WebDriverWait wait=new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(PeopleManagement));
        act1.moveToElement(PeopleManagement).perform();
        wait.until(ExpectedConditions.visibilityOf(HRAdministration));
        HRAdministration.click();*/

        //creating new method



        act.moveToElement(starter).build().perform();
        act.moveToElement(PeopleManagement, 190,170);
        HRAdministration.click();
    }
    public boolean
    verifyDemoButton(){
        return bookAdemoButton.isDisplayed();
       // return true;
    }
    public void openHomePage(){
        driver.manage().window().maximize();
        driver.get("https://www.orangehrm.com/");
    }
    public void navigateToOnboarding(){
        act=new Actions(driver);
        act.moveToElement(starter).build().perform();
        act.moveToElement(TalentManagemt, 190,190).perform();
        OnBording.click();
    }

    public void navigateToPerformanceManagement(){
        act=new Actions(driver);
        act.moveToElement(starter).build().perform();
        act.moveToElement(PerformanceManagement).perform();
        PerformanceManagement.click();
    }
    public void navigateToTraining(){
        act=new Actions(driver);
        act.moveToElement(starter).build().perform();
        act.moveToElement(Training).perform();
        Training.click();
    }



}
