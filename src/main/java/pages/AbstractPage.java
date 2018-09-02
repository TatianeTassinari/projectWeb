package pages;

import org.openqa.selenium.WebDriver;
import util.WebDriverTestBase;

public abstract class AbstractPage {
    protected WebDriver driver;
    //protected String websiteValue;

    public AbstractPage() {
        driver = WebDriverTestBase.getDriver();


    }
}
