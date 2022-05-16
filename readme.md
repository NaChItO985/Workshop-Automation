# Automation

## This is the solution for the automation workshop using Cucumber, selenium and Java

---

## Requirements and configuration of the project

### Programs/files/dependencies to download

- Java JDK 15
  - You can download the version of Java clicking the image below:
  
    [![Oracle_Logo](img/Oracle_Logo.png)](https://www.oracle.com/java/technologies/javase/jdk15-archive-downloads.html)

- Gradle latest version : 7.4.2
  - You can download and install the Gradle latest version clicking the image below and following the instructions:
  
    [![Gradle_Logo](img/Gradle_logo.jpg)](https://gradle.org/install/)
- Allure latest version : 2.17.3
  - You can download and install the Allure latest version clicking the image below and following the instructions:
  
    [![Allure_Logo](img/Allure_Logo.png)](https://docs.qameta.io/allure/#_manual_installation)

- Visual Studio Code
  - This project was designed in VSC, you can download and install clicking the image below:

    [![VSC_Logo](img/VSC_Logo.png)](https://docs.qameta.io/allure/#_manual_installation)

### Configuration

- Be administrator of the pc to execute and configure the project

- After downloaded and installed the programs / dependencies we need to create a new folder on `C:\` route with `Gradle` and `Allure` names. After that we need to extract the download files on each of them.

- We need to configure the following system environment variables:
  
 > Note: To access to the environment variables window you can search `Edit the system environment variables` on the task bar and click on Environment Variables button.

| Level | Variable | Route |
| -------- | -------- | ----- |
| System variables | Path | C:\Gradle\gradle-7.4.2\bin|
| System variables | Path | C:\Allure\alure-2.17.3\bin|
| System variables | %JAVA_HOME% | C:\Program Files\Java\jdk-15.0.2|

---

## Extensions for the project

- To compile execute and run the project you need to install the following extension:

  - Cucumber (Gherkin) Full Support
  - Snippets and Syntax Highlight for Gherkin (Cucumber)
  - Extension Pack for Java

- **Optional**

  - Bracket Pair Colorized
  - Gradle for Java

    > Note: Bracket is recommended to verify where open and close the brackets and you can differentiate between them.

---

## Execution

### Steps for execute the project

1. Open the terminal

    >Note: To open the terminal use the Ctrl+` keyboard shortcut with the backtick character.

    >Use the View > Terminal menu command.

    >From the Command Palette (Ctrl+Shift+P), use the View: Toggle Terminal command.
    >You can create a new terminal via the Terminal menu with Terminal > New Terminal.

2. Execute the following command:

    ```sh
    gradle clean test allureReport
    ```

3. After the test has finished execute the following command to view result of the execution:

    ```sh
    allure .\build\allure-results\
    ```

    >Note: You can finish the execution of the test pressing "Ctrl + C"

## Additional Behaviors

- When you are executing the test cases, amazon changes the way to display the values of the different pages, sometimes the prices of the products are display with decimal dot and other times only display the dollars and  cents without the dot.
  
  - To solve this issue you need to go to the "AmazonAddItemToCart.java" and "AmazonReduceItemFromCart.java" file and uncomment the lines that appears at the moment. If you need to validate the values with decimal point uncomment the following lines.

    ```sh
    > cartPage.calculatePrice();
    > Assert.assertTrue(cartPage.calculatePrice());
    ```

- If you need to validate the prices without Decimals dot uncomment the following lines:

    ```sh
    
    > cartPageWD.calculatePrice();
    > Assert.assertTrue(cartPageWD.calculatePrice());
    ```

- Sometimes when you are executing the test cases the page loaded is different to actual page of amazon, in that case you need to reexecute the project. You can do that pressing "Ctrl + C" and "y" and finish with "Enter" button and after that you need to write the step 2 of the execution.
