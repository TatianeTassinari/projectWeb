Feature: Manage computers in sample application
  Description: The user should be able to create a computer and manage it

  #Acceptance Criteria:
  # The user should always see the ‘Add a new computer’ button on Home Page
  # Clicking this button will redirect the user to a page to add a new computer
  # Clicking on Create this computer button the system must add the new computer with success in database
  Scenario: Add new computer filling all the information in the screen
    Given I access the sample application website
    And I click on Add a new computer button
    When I enter a valid computer name
    And I enter a valid Introduced date
    And I enter a valid Discontinued date
    And I choose a Company
    And I click on Create this computer button
    Then a confirmation message must be displayed to the user

  #Acceptance Criteria:
  # The user should always see the ‘Add a new computer’ button on Home Page
  # Clicking this button will redirect the user to a page to add a new computer
  # Clicking on Create this computer button the system must add the new computer with success in database
  Scenario: Add new computer with only "Computer name"
    Given I access the sample application website
    And I click on Add a new computer button
    When I enter a valid computer name
    And I click on Create this computer button
    Then a confirmation message must be displayed to the user

  #Acceptance Criteria:
  # The user should always see the result according to the filter used on Home Page
  # Clicking this link will redirect the user to a page to edit the computer
  # Clicking on Save this computer button the system must update the computer name with success
  Scenario: Update an already created computer changing the “Computer name”
    Given I access the sample application website
    And I filter by computer name
    When I change the computer name
    And I click on Save this computer button
    Then a confirmation message must be displayed to the user

  #Acceptance Criteria:
  # The user should always see the Delete button available in Edit page
  # Clicking on Delete this computer button will remove the computer from the database with success
  Scenario: Delete an already created computer
    Given I access the sample application website
    And I filter by computer name
    When I click on Delete this computer button
    Then a confirmation message must be displayed to the user


