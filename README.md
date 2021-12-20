# Hello and Welcome To Automation Test.

This project is divided by packages having Screen Play as a reference.  You can find the following packages.

* Capabilities: File with the project capabilities.
* Steps: Class with the methods that allow to validate behaviors.
* Ui: Test identifiers.
* Utils: Classes with generic methods that allow to encapsulate behaviors.

In the resources section you can find the .APK file of the project.

pom.xml: File with dependencies needed for automation.
testng.xml: File with the configurations to execute the tests, it allows to add the number of devices that allows the execution in parallel Android/iOS, it must consider the attributes:
 platformType
deviceName
platformVersion
Considerations:
systemPort.

# Considerations:
* This project was created on a Windows OS machine so the iOS validations were not possible to run.
* The path of the .APK described in the capabilities has a condition to validate the operating system where it is executed.
* When starting the Appium server you must point to port "8210", otherwise you will encounter a "Connection Refused" error. Otherwise you must change the port number in the testng.xml file.
* To run the test you must stand on the file "testng.xml" right click and press run '../testng.xml'.

# Test scenarios:

* The first test called "fillEmptyTriangle()" will validate all the titles of the Inputs and press the calculate button, validating the message of your response.
This written in Gherkin would be. <br>
**Scenario:** As a user I want to validate the titles of the application and see a message of filling all the data. <br>
**Given:** I am in the application. <br>
**And:** I validate the Titles Side1, Side2 and Side3. <br>
**When:** Press the Calculate button. <br>
**Then:** You can see the message "Preencha todos os campos". <br>

* The second test called "scaleneTrianqle()" will insert 3 data in the inputs to validate the answer.
Scenario: As a user I want to see the response message of "Scalene Triangle" when adding the 3 sides of the triangle.<br> 
**Given:** I am in the application. <br>
**And:** I add the number 5 to side 1.<br>
**And:** I add the number 5 to side 4.<br>
**And:** I add the number 5 to side 2.<br>
**When:** Press the Calculate button.<br>
**Then:** You can see the message "O triângulo é Escaleno"<br>


* The test named appState will validate by means of an Assert that the application is currently running in Foreground.
* It should be noted that the validations of titles and answers when pressing the calculate button are validated through Asserts.

This example was created by Andrés Tapiero https://www.linkedin.com/in/andres-tapiero/
