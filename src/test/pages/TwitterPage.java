package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TwitterPage extends BasePage {

    public TwitterPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String twitterTitle = "The Weather Channel (@weatherchannel) / Twitter";
}
