package steps;

import com.testinium.deviceinformation.exception.DeviceNotFoundException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.MessagingPage;
import setups.DriverSetup;

import java.io.IOException;

//This is the step definition file

public class MessagingStep {
    MessagingPage messagingPage = new MessagingPage(DriverSetup.getAppiumDriver());

    public MessagingStep() throws IOException, DeviceNotFoundException {
    }

    @And("^user click Start Chat button$")
    public void userClickStartChatButton() {
        messagingPage.clickStartChat();
    }

    @And("^user click Create Group button$")
    public void userClickCreateGroupButton() {
        messagingPage.clickCreateGroup();
    }

    @And("^user input first phone number \"([^\"]*)\"$")
    public void userInputFirstPhoneNumber(String phoneNumber) {
        messagingPage.inputFirstPhoneNumber(phoneNumber);
    }

    @And("^user input another phone number \"([^\"]*)\"$")
    public void userInputAnotherPhoneNumber(String phoneNumber) {
        messagingPage.inputAnotherPhoneNumber(phoneNumber);
    }

    @Then("^user click circle checkbox$")
    public void userClickCircleCheckbox() {
        messagingPage.clickCircleCheckbox();
    }

    @Then("^user click Next button$")
    public void userClickNextButton() {
        messagingPage.clickNextButton();
    }

    @Then("^user click Done button$")
    public void userClickDoneButton() {
        messagingPage.clickDoneButton();
    }

    @And("^user input text message \"([^\"]*)\"$")
    public void userInputTextMessage(String textMessage) {
        messagingPage.inputTextMessage(textMessage);
    }

    @Then("^user click Send button$")
    public void userClickSendButton() {
        messagingPage.clickSendButton();
    }
}