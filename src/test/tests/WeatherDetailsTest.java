package tests;

import base.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.WeatherDetailsPage;

public class WeatherDetailsTest extends BaseTest {
    HomePage homePage;
    WeatherDetailsPage weatherDetailsPage;

    @BeforeMethod
    public void localSetUp() {
        homePage = new HomePage(getDriver());
        weatherDetailsPage = new WeatherDetailsPage(getDriver());
    }

    @Test(testName = "US-05", description = "Verify weather information for 10 day period")
    public void test08() {
        homePage.tenDayBtn.click();
        for (int i = 1; i < weatherDetailsPage.dayList.size(); i++) {
            String eachDay = weatherDetailsPage.dayList.get(i).getText();
            String eachTemp = weatherDetailsPage.tempList.get(i).getText().replace("\n", "");
            String eachDescr = weatherDetailsPage.descrList.get(i).getText();
            System.out.println(eachDay + " - " + eachTemp + " - " + eachDescr);
        }
    }
}
