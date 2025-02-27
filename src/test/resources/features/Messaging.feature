@Messaging
Feature: Messaging Scenarios
  This contains test cases for the Google messaging app.

  Scenario: User creates a group chat and sends a message.
    And user click Start Chat button
    And user click Create Group button
    And user input first phone number "5555550001"
    And user click circle checkbox
    And user input another phone number "5555550002"
    And user click circle checkbox
    And user click Next button
    And user click Done button
    And user input text message "Hello world!"
    And user click Send button