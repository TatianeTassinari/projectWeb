package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverTestBase {

    protected static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
            driver = new ChromeDriver();
        }

        return driver;
    }


    public void tearDown() {
        driver.close();
    }

    public static void quitDriver() {
        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();
    }
}
