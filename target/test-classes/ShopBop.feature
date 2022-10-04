Feature: To veryfied login funcation application

  Background: user to browers chrome url requied

  Scenario: To validate the username and passward appllication
    When user to find validate username and invalidate passward
    And To click Login button
    Then goto error page
