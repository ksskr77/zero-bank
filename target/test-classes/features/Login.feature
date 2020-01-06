Feature: User able to login

  Background:
    Given the User is on the login page

  Scenario: Login as user
    When User logs in with valid credentials
    Then Account summary page should be displayed
