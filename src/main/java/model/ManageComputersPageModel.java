package model;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import pages.AbstractPage;
import util.ComputerName;

public class ManageComputersPageModel extends AbstractPage {

    private static final By LOCATOR_COMPUTER_NAME_FIELD = By.id("name");
    private static final By LOCATOR_CREATE_THIS_COMPUTER_BUTTON = By.xpath("//*[@id='main']/form/div/input");
    private static final By LOCATOR_SAVE_THIS_COMPUTER_BUTTON = By.xpath("//*[@id='main']/form[1]/div/input");
    private static final By LOCATOR_DELETE_THIS_COMPUTER_BUTTON = By.xpath("//input[@value='Delete this computer']");
    private static final By LOCATOR_INTRODUCED_DATE_FIELD = By.id("introduced");
    private static final By LOCATOR_DISCONTINUED_DATE_FIELD = By.id("discontinued");

    public void enterValidComputerName() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ComputerName.setComputerName();
        String newComputerName = ComputerName.getUniqueComputerName();
        Assert.assertTrue(driver.findElement(LOCATOR_COMPUTER_NAME_FIELD).isDisplayed());
        driver.findElement(LOCATOR_COMPUTER_NAME_FIELD).sendKeys(newComputerName);
        System.out.println(newComputerName);

    }

    public void enterValidIntroducedDate() {
        driver.findElement(LOCATOR_INTRODUCED_DATE_FIELD).sendKeys("2018-09-30");

    }

    public void enterValidDiscontinuedDate() {
        driver.findElement(LOCATOR_DISCONTINUED_DATE_FIELD).sendKeys("2018-12-30");

    }

    public void enterValidCompany() {
        Select companyDropDown = new Select(driver.findElement(By.id("company")));
        companyDropDown.selectByIndex(1);
        System.out.println("Company selected: " + companyDropDown.getFirstSelectedOption().getText());


    }

    public void clickOnCreateThisComputerButton() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(driver.findElement(LOCATOR_CREATE_THIS_COMPUTER_BUTTON).isDisplayed());
        driver.findElement(LOCATOR_CREATE_THIS_COMPUTER_BUTTON).click();
    }


    public void changeComputerName() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ComputerName.setComputerName();
        String changedComputerName = ComputerName.getUniqueComputerName();
        driver.findElement(LOCATOR_COMPUTER_NAME_FIELD).clear();
        driver.findElement(LOCATOR_COMPUTER_NAME_FIELD).sendKeys(changedComputerName);
        System.out.println(changedComputerName);


    }


    public void clickOnSaveThisComputerButton() {

        driver.findElement(LOCATOR_SAVE_THIS_COMPUTER_BUTTON).click();
    }

    public void clickOnDeleteThisComputerButton() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(driver.findElement(LOCATOR_DELETE_THIS_COMPUTER_BUTTON).isDisplayed());
        driver.findElement(LOCATOR_DELETE_THIS_COMPUTER_BUTTON).click();


    }


}
