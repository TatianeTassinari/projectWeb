$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ManageComputers.feature");
formatter.feature({
  "line": 1,
  "name": "Manage computers in sample application",
  "description": "Description: The user should be able to create a computer and manage it",
  "id": "manage-computers-in-sample-application",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 4,
      "value": "#Acceptance Criteria:"
    },
    {
      "line": 5,
      "value": "# The user should always see the ‘Add a new computer’ button on Home Page"
    },
    {
      "line": 6,
      "value": "# Clicking this button will redirect the user to a page to add a new computer"
    },
    {
      "line": 7,
      "value": "# Clicking on Create this computer button the system must add the new computer with success in database"
    }
  ],
  "line": 8,
  "name": "Add new computer filling all the information in the screen",
  "description": "",
  "id": "manage-computers-in-sample-application;add-new-computer-filling-all-the-information-in-the-screen",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I access the sample application website",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I click on Add a new computer button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter a valid computer name",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I enter a valid Introduced date",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter a valid Discontinued date",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I choose a Company",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click on Create this computer button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "a confirmation message must be displayed to the user",
  "keyword": "Then "
});
formatter.match({
  "location": "ManageComputersStep.accessSampleApplicationWebsite()"
});
formatter.result({
  "duration": 12392775344,
  "status": "passed"
});
formatter.match({
  "location": "ManageComputersStep.clickOnAddNewComputerButton()"
});
formatter.result({
  "duration": 3589934163,
  "status": "passed"
});
formatter.match({
  "location": "ManageComputersStep.enterValidComputerName()"
});
formatter.result({
  "duration": 3506979989,
  "status": "passed"
});
formatter.match({
  "location": "ManageComputersStep.enterValidIntroducedDate()"
});
formatter.result({
  "duration": 141991172,
  "status": "passed"
});
formatter.match({
  "location": "ManageComputersStep.enterValidDiscontinuedDate()"
});
formatter.result({
  "duration": 162204006,
  "status": "passed"
});
formatter.match({
  "location": "ManageComputersStep.enterValidCompany()"
});
formatter.result({
  "duration": 373136479,
  "status": "passed"
});
formatter.match({
  "location": "ManageComputersStep.clickOnCreateThisComputerButton()"
});
formatter.result({
  "duration": 3782565977,
  "status": "passed"
});
formatter.match({
  "location": "ManageComputersStep.confirmationMessageIsDisplayed()"
});
formatter.result({
  "duration": 3231338736,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 18,
      "value": "#Acceptance Criteria:"
    },
    {
      "line": 19,
      "value": "# The user should always see the ‘Add a new computer’ button on Home Page"
    },
    {
      "line": 20,
      "value": "# Clicking this button will redirect the user to a page to add a new computer"
    },
    {
      "line": 21,
      "value": "# Clicking on Create this computer button the system must add the new computer with success in database"
    }
  ],
  "line": 22,
  "name": "Add new computer with only \"Computer name\"",
  "description": "",
  "id": "manage-computers-in-sample-application;add-new-computer-with-only-\"computer-name\"",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 23,
  "name": "I access the sample application website",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "I click on Add a new computer button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I enter a valid computer name",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "I click on Create this computer button",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "a confirmation message must be displayed to the user",
  "keyword": "Then "
});
formatter.match({
  "location": "ManageComputersStep.accessSampleApplicationWebsite()"
});
formatter.result({
  "duration": 264064784,
  "status": "passed"
});
formatter.match({
  "location": "ManageComputersStep.clickOnAddNewComputerButton()"
});
formatter.result({
  "duration": 3443006630,
  "status": "passed"
});
formatter.match({
  "location": "ManageComputersStep.enterValidComputerName()"
});
formatter.result({
  "duration": 3312959836,
  "status": "passed"
});
formatter.match({
  "location": "ManageComputersStep.clickOnCreateThisComputerButton()"
});
formatter.result({
  "duration": 3607648223,
  "status": "passed"
});
formatter.match({
  "location": "ManageComputersStep.confirmationMessageIsDisplayed()"
});
formatter.result({
  "duration": 3198357678,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 29,
      "value": "#Acceptance Criteria:"
    },
    {
      "line": 30,
      "value": "# The user should always see the result according to the filter used on Home Page"
    },
    {
      "line": 31,
      "value": "# Clicking this link will redirect the user to a page to edit the computer"
    },
    {
      "line": 32,
      "value": "# Clicking on Save this computer button the system must update the computer name with success"
    }
  ],
  "line": 33,
  "name": "Update an already created computer changing the “Computer name”",
  "description": "",
  "id": "manage-computers-in-sample-application;update-an-already-created-computer-changing-the-“computer-name”",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 34,
  "name": "I access the sample application website",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "I filter by computer name",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I change the computer name",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "I click on Save this computer button",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "a confirmation message must be displayed to the user",
  "keyword": "Then "
});
formatter.match({
  "location": "ManageComputersStep.accessSampleApplicationWebsite()"
});
formatter.result({
  "duration": 260856641,
  "status": "passed"
});
formatter.match({
  "location": "ManageComputersStep.filterByComputerName()"
});
formatter.result({
  "duration": 7209811380,
  "status": "passed"
});
formatter.match({
  "location": "ManageComputersStep.changeComputerName()"
});
formatter.result({
  "duration": 3323712855,
  "status": "passed"
});
formatter.match({
  "location": "ManageComputersStep.clickOnSaveThisComputerButton()"
});
formatter.result({
  "duration": 727508070,
  "status": "passed"
});
formatter.match({
  "location": "ManageComputersStep.confirmationMessageIsDisplayed()"
});
formatter.result({
  "duration": 3176861113,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 40,
      "value": "#Acceptance Criteria:"
    },
    {
      "line": 41,
      "value": "# The user should always see the Delete button available in Edit page"
    },
    {
      "line": 42,
      "value": "# Clicking on Delete this computer button will remove the computer from the database with success"
    }
  ],
  "line": 43,
  "name": "Delete an already created computer",
  "description": "",
  "id": "manage-computers-in-sample-application;delete-an-already-created-computer",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 44,
  "name": "I access the sample application website",
  "keyword": "Given "
});
formatter.step({
  "line": 45,
  "name": "I filter by computer name",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "I click on Delete this computer button",
  "keyword": "When "
});
formatter.step({
  "line": 47,
  "name": "a confirmation message must be displayed to the user",
  "keyword": "Then "
});
formatter.match({
  "location": "ManageComputersStep.accessSampleApplicationWebsite()"
});
formatter.result({
  "duration": 330036767,
  "status": "passed"
});
formatter.match({
  "location": "ManageComputersStep.filterByComputerName()"
});
formatter.result({
  "duration": 7054104977,
  "status": "passed"
});
formatter.match({
  "location": "ManageComputersStep.clickOnDeleteThisComputerButton()"
});
formatter.result({
  "duration": 3648007178,
  "status": "passed"
});
formatter.match({
  "location": "ManageComputersStep.confirmationMessageIsDisplayed()"
});
formatter.result({
  "duration": 5425108616,
  "status": "passed"
});
});