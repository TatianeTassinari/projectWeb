package control;

import model.ManageComputersPageModel;

public class ManageComputersPageController {


    private ManageComputersPageModel manageComputersPageModel = new ManageComputersPageModel();

    public ManageComputersPageController enterValidComputerName() {
        manageComputersPageModel.enterValidComputerName();
        return this;
    }

    public ManageComputersPageController enterValidIntroducedDate() {
        manageComputersPageModel.enterValidIntroducedDate();
        return this;
    }

    public ManageComputersPageController enterValidDiscontinuedDate() {
        manageComputersPageModel.enterValidDiscontinuedDate();
        return this;
    }

    public ManageComputersPageController enterValidCompany() {
        manageComputersPageModel.enterValidCompany();
        return this;
    }

    public ManageComputersPageController clickOnCreateThisComputerButton() {
        manageComputersPageModel.clickOnCreateThisComputerButton();
        return this;
    }

    public ManageComputersPageController changeComputerName() {
        manageComputersPageModel.changeComputerName();
        return this;
    }

    public ManageComputersPageController clickOnSaveThisComputerButton() {
        manageComputersPageModel.clickOnSaveThisComputerButton();
        return this;
    }

    public ManageComputersPageController clickOnDeleteThisComputerButton() {
        manageComputersPageModel.clickOnDeleteThisComputerButton();
        return this;
    }


}
