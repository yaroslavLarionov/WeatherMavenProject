package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FacebookPage;
import pages.HomePage;

public class FacebookTest extends BaseTest {
    HomePage homePage;
    FacebookPage facebookPage;

    @BeforeMethod
    public void localSetup() {
        homePage = new HomePage(getDriver());
        facebookPage = new FacebookPage(getDriver());
    }

    @Test (testName = "US-04", description = "Verify the title of the Facebook page")
    public void test05() {
        homePage.click(homePage.facebookBtn);
        homePage.switchToNextWindow();
        Assert.assertEquals(getDriver().getTitle(), facebookPage.titleFacebook);
    }
}
