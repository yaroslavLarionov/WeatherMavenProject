package pages;

import base.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String title = "National and Local Weather Radar, Daily Forecast, Hurricane and information from The Weather Channel and weather.com";

    @FindBy (xpath = "//section[@id='privacy-data-notice']")
    public WebElement alertMsg;


}
