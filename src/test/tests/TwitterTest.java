package tests;

import base.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.TwitterPage;

public class TwitterTest extends BaseTest {
    HomePage homePage;
    TwitterPage twitterPage;

    @BeforeMethod
    public void localSetup() {
        homePage = new HomePage(getDriver());
        twitterPage = new TwitterPage(getDriver());
    }

    @Test (testName = "US-04", description = "Verify the title of Twitter page")
    public void test06() {
        homePage.click(homePage.twitterBtn);
        homePage.switchToNextWindow();
        Assert.assertEquals(getDriver().getTitle(), twitterPage.twitterTitle);
    }
}
