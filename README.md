# projectWeb

# Project description: 
* This project was created to test and validate CRUD scenarios to the website: http://computer-database.herokuapp.com/computers

* The project was created using the IntelliJ IDEA Community Edition 2018.2 and Gradle as dependency management in OS Win 7.
* The project uses the following set of artifacts and their respective versions as defined in the build.gradle: 
* JUnit having version 4.12
* java having version 1.7 or more
* Selenium having version 3.12.0
* Cucumber having version 1.2.5

# Decision about how to handle test data:
* Computer Name is being created automatically and randomly as you can see in the class util/ComputerName.

# Assumptions
* You have an IDEA compatible with gradle already setup and running in your machine.
* You have chromedriver.exe already setup in your C:/.

# How to execute the project:
* After checkout the project to your machine and open it with the IDEA and guarantee is everything ok related to the gradle dependencies, you have two ways to run the tests:
* Option 1: Open the class src/main/java/TestRunner and Run it directly.

* Option 2: Open the feature file ManageComputers.feature and Run it directly.
**You can check both ways diretly in Run/Debug configuration dialog, too.

# Framework:
* After organize the manual test cases (see file: ComputerDatabaseManualTestCases-TatianeTassinari.pdf) and choose which scenarios would be important to automate, I've decided to use BDD approach to write the automated test cases.
* The project also includes a html report when run the tests with Junit: target/html/index.html
* I suggest to open the tests report using IE or FIrefox.

# Test Cases that was automated: 
* Add new computer filling all the information in the screen
* Add new computer with only "Computer name"
* Update an already created computer changing the “Computer name”
* Delete an already created computer

Project Author: Tatiane Tassinari (tatianetassinari85@gmail.com)
