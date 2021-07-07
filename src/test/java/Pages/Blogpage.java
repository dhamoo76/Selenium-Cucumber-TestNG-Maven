package Pages;

import WebConnector.webconnector;
import org.openqa.selenium.WebDriver;

public class Blogpage extends BasePage {
    webconnector wc;

    public Blogpage(WebDriver driver) {

        super(driver);
        wc = new webconnector();
    }

    public void verifyPageTitle() {
        try {
            wc.PerformActionOnElement("RecentPosts_BlogPage", "WaitForElementDisplay", "");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}