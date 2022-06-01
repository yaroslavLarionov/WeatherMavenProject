package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomeTest extends BaseTest {
    HomePage homePage;

    @BeforeMethod
    public void localSetUp() {
        homePage = new HomePage(getDriver());
    }

    @Test (testName = "US-01", description = "Validate the title of the page")
    public void test01() {
        Assert.assertEquals(getDriver().getTitle(), homePage.title);

    }
}
