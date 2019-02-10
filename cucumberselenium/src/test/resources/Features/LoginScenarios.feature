Feature: LoginTests

Scenario: Verify that user can login to the application successfully with valid username and password
        Given User is on login page
        When User types username and password
        Then user should land to Homepage

Scenario: Verify that user cannot login to the application successfully without valid username and password
        Given User is on login CRM page
        When User types username and password
        Then user should land to Homepage