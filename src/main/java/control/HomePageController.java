package control;

import model.HomePageModel;

public class HomePageController {

    private HomePageModel homePageModel = new HomePageModel();

    public void accessSampleApplicationWebsite() {
        homePageModel.accessSampleApplicationWebsite();
    }

    public HomePageController clickOnAddNewComputerButton() {
        homePageModel.clickOnAddNewComputerButton();
        return this;
    }


    public HomePageController filterByComputerName() {
        homePageModel.filterByComputerName();
        return this;
    }

    public HomePageController confirmationMessageIsDisplayed() {
        homePageModel.confirmationMessageIsDisplayed();
        return this;
    }


}
