package pages;

import helpers.GlobalVariables;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.interactions.Actions;
import java.util.List;

import static org.junit.Assert.assertEquals;

// This is a page file where the functions for the page location.

public class MessagingPage {
    private AppiumDriver appiumDriver;
    private Actions action;

    public MessagingPage(AppiumDriver appiumDriver){
        this.appiumDriver = appiumDriver;
        this.action = new Actions(appiumDriver);
        PageFactory.initElements(new AjaxElementLocatorFactory(appiumDriver, GlobalVariables.TIMEOUT), this);
    }

    // Start chat locator
    @FindBy(id = "com.google.android.apps.messaging:id/start_chat_fab")
    private WebElement startChatButton;

    // Create group locator
    @FindBy(xpath = "//*[@text='Create group']")
    private WebElement createGroupButton;

    // This is the locator for the To field when it is empty
    @FindBy(xpath = "//*[@text='Type names, phone numbers, or emails']")
    private WebElement phoneNumbersField;

    // This is the locator for the To field after adding at least one group member
    @FindBy(xpath = "//*[@text='Anyone else?']")
    private WebElement morePhoneNumbersField;

    // This is the locator for the checkbox to add the entered phone number as a group member
    @FindBy(xpath = "//*[@content-desc='Unselected']/android.view.View/android.widget.Button")
    private WebElement circleCheckbox;

    // After adding at least two group members, this is the locator for the Next button that appears
    @FindBy(xpath = "//*[@text='Next']")
    private WebElement nextButton;

    // After clicking Next, Google Messages app asks the user for an optional Group name. This is the locator for the Done button to confirm the Group name.
    @FindBy(xpath = "//*[@text='Done']")
    private WebElement doneButton;

    // This is the locator for the Text message field where the user can type a new text message to send to the group.
    @FindBy(xpath = "//*[@text='Text message']")
    private WebElement textMessageField;

    // This is the locator for the Send button to actually send the text message the user had entered.
    // Due to circumstances out of our control, this XPath is less than ideal. Realistically, it would make more sense to request the app developers to add accessibility IDs for a more reliable locator.
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View[2]/android.widget.Button")
    private WebElement sendButton;

    public void clickStartChat() {
        startChatButton.click();
    }

    public void clickCreateGroup() {
        createGroupButton.click();
    }

    public void inputFirstPhoneNumber(String phoneNumber) {
        phoneNumbersField.click();
        action.sendKeys(phoneNumber).perform();
    }

    public void inputAnotherPhoneNumber(String phoneNumber) {
        morePhoneNumbersField.click();
        action.sendKeys(phoneNumber).perform();
    }

    public void clickCircleCheckbox() {
        circleCheckbox.click();
    }

    public void clickNextButton() {
        nextButton.click();
    }

    public void clickDoneButton() {
        doneButton.click();
    }
    
    public void inputTextMessage(String textMessage) {
        textMessageField.click();
        action.sendKeys(textMessage).perform();
    }

    public void clickSendButton() {
        sendButton.click();
    }

}
