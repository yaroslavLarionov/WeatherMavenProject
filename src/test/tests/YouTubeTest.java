package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.YouTubePage;

public class YouTubeTest extends BaseTest {
    HomePage homePage;
    YouTubePage youTubePage;

    @BeforeMethod
    public void localSetUp() {
        homePage = new HomePage(getDriver());
        youTubePage = new YouTubePage(getDriver());
    }

    @Test (testName = "US-04", description = "Verify the title of the Youtube page")
    public void test07() {
        homePage.click(homePage.youtubeBtn);
        homePage.switchToNextWindow();
        Assert.assertEquals(getDriver().getTitle(), youTubePage.youtubeTitle);
    }
}
