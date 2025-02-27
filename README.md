# Android Google Messages Mobile Automation Testing
This project tests the Android Google Messages app using Appium, Cucumber, Java, and design pattern Page Object Model (POM) with Page Factory

## 1. POM

This automation created using POM design pattern. This gives an advantage when one of a page's interface changes, then other classes will not be affected. 

## 2. Cucumber and Gherkin

For scenario scripting, we will use Cucumber and Gherkin.<br/>
**Cucumber** is a tool that supports BDD *(Behavior-Driven Development)*.<br/>
**Gherkin** is a set of grammar rules that makes plain text structured enough to be understood by Cucumber. Scenario scripts are written using Gherkin.

## 3. Preparation

Java JDK 8<br/>
Android Studio Ladybug 2024.2.2<br/>
Node.js v22.14.0<br/>
Appium 1.22.3<br/>
Maven<br/>
Tested on a real Android phone and Android Studio emulator

- To start test, in command prompt, type ```mvn test```
- To generate reports, in command prompt, type ```mvn test site surefire-report:report```

## 4. Additional notes

- Step 4 of the assignment instructions says we should input the number '12345678'. However, Google Messages app requires at least two numbers to be entered. Additionally, I have opted to use numbers starting with '555' to avoid accidentally sending a message to a potentially valid mobile device.
- Before step 6 of the assignment instructions, I had to include additional steps for clicking on a Next button (to confirm I have already added all the group members I want) and a Done button (to confirm I do not wish to enter an optional group name).
- You can see the reports at target/reports/surefire.html that all tests are passing
