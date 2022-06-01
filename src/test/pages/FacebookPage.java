package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FacebookPage extends BasePage {

    public FacebookPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String titleFacebook = "The Weather Channel - Home | Facebook";
}
