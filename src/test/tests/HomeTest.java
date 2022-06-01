package tests;

import base.BasePage;
import base.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomeTest extends BaseTest {
    HomePage homePage;
    BasePage basePage;

    @BeforeMethod
    public void localSetUp() {
        homePage = new HomePage(getDriver());
    }

    @Test (testName = "US-01", description = "Validate the title of the page")
    public void test01() {
        Assert.assertEquals(getDriver().getTitle(), homePage.title);
    }

    @Test (testName = "US-02", description = "Verify popup text")
    public void test02() {
        // Wait until pop-up window appears
        homePage.waitForElementVisibility(homePage.alertMsg);
        // Get the text of the pop-up window and close it
        System.out.println(homePage.alertMsg.getText());
    }
}
