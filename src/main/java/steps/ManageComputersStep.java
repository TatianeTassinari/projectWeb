package steps;

import control.HomePageController;
import control.ManageComputersPageController;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ManageComputersStep {

    private HomePageController homePage;
    private ManageComputersPageController manageComputersPage;


    public ManageComputersStep() {
        homePage = new HomePageController();
        manageComputersPage = new ManageComputersPageController();

    }


    @Given("^I access the sample application website$")
    public void accessSampleApplicationWebsite() {
        homePage.accessSampleApplicationWebsite();
    }

    @And("^I click on Add a new computer button$")
    public void clickOnAddNewComputerButton() {
        homePage.clickOnAddNewComputerButton();
    }

    @When("^I enter a valid computer name$")
    public void enterValidComputerName() {
        manageComputersPage.enterValidComputerName();
    }

    @And("^I enter a valid Introduced date$")
    public void enterValidIntroducedDate() {
        manageComputersPage.enterValidIntroducedDate();
    }

    @And("^I enter a valid Discontinued date$")
    public void enterValidDiscontinuedDate() {
        manageComputersPage.enterValidDiscontinuedDate();
    }

    @And("^I choose a Company$")
    public void enterValidCompany() {
        manageComputersPage.enterValidCompany();
    }

    @And("^I click on Create this computer button$")
    public void clickOnCreateThisComputerButton() {
        manageComputersPage.clickOnCreateThisComputerButton();

    }

    @Then("^a confirmation message must be displayed to the user$")
    public void confirmationMessageIsDisplayed() {

        homePage.confirmationMessageIsDisplayed();
    }

    @And("^I filter by computer name$")
    public void filterByComputerName() {

        homePage.filterByComputerName();
    }

    @When("^I change the computer name$")
    public void changeComputerName() {

        manageComputersPage.changeComputerName();
    }

    @And("^I click on Save this computer button$")
    public void clickOnSaveThisComputerButton() {
        manageComputersPage.clickOnSaveThisComputerButton();


    }


    @When("^I click on Delete this computer button$")
    public void clickOnDeleteThisComputerButton() {
        manageComputersPage.clickOnDeleteThisComputerButton();

    }


}
