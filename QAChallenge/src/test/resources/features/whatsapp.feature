#Author: viniciusnogueira_@hotmail.com


Feature: Messages funcionality of the WhatsApp


  Scenario: Login to personal account
    Given i am at the WhatsApp login screen
    When i validate the QR Code manualy with a mobile device
    Then my WhatsApp home page is displayed

  Scenario: Search by a friend and send a message
    Given i am at my WhatsApp home page
    And i search by a friend called Contact A
    When i write and send a message
    Then The message is displayed on chat

  Scenario: Attach a picutre on chat
    Given i am chating with a friend
    And i search and select a foto from gallery
    When i write and a title and send the picture
    Then the image is displayed on chat

  Scenario: Change the label About in profile settings
    Given i move to profile settings
    When i change the About information
    Then the new About information is displayed

  Scenario: Logout from personal account
    Given i am at my WhatsApp home page
    When i perform logout action
    Then the WhatsApp login screen is displayed
