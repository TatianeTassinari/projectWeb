package model;

import org.junit.Assert;
import org.openqa.selenium.By;
import pages.AbstractPage;
import util.ComputerName;

public class HomePageModel extends AbstractPage {

    private static final By LOCATOR_ADD_NEW_COMPUTER_BUTTON = By.id("add");
    private static final By LOCATOR_COMPUTER_NAME_FILTER = By.id("searchbox");
    private static final By LOCATOR_COMPUTER_NAME_BUTTON = By.id("searchsubmit");
    private static final By LOCATOR_CONFIRMATION_MESSAGE = By.xpath("//*[@id='main']/div[1]");
    private static final By LOCATOR_FILTER_RESULT = By.xpath("//*[@id='main']/table/tbody/tr/td[1]/a");


    public void accessSampleApplicationWebsite() {

        driver.get("http://computer-database.herokuapp.com/computers");
        driver.manage().window().maximize();
    }

    public void clickOnAddNewComputerButton() {
        Assert.assertTrue(driver.findElement(LOCATOR_ADD_NEW_COMPUTER_BUTTON).isDisplayed());

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(LOCATOR_ADD_NEW_COMPUTER_BUTTON).click();
    }

    public void filterByComputerName() {
        Assert.assertTrue(driver.findElement(LOCATOR_COMPUTER_NAME_FILTER).isDisplayed());

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(LOCATOR_COMPUTER_NAME_FILTER).sendKeys(ComputerName.getUniqueComputerName());
        driver.findElement(LOCATOR_COMPUTER_NAME_BUTTON).click();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Assert.assertTrue(driver.findElement(LOCATOR_FILTER_RESULT).getText().contains(ComputerName.getUniqueComputerName()));
        driver.findElement(LOCATOR_FILTER_RESULT).click();


    }

    public void confirmationMessageIsDisplayed() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (driver.findElement(LOCATOR_CONFIRMATION_MESSAGE).isDisplayed()) {
            Assert.assertTrue("Done", driver.findElement(LOCATOR_CONFIRMATION_MESSAGE).getText().contains("Done"));

        }

        if (driver.findElement(LOCATOR_CONFIRMATION_MESSAGE).getText().contains("delete")) {

            driver.close();
        }
    }


}


