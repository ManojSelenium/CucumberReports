Feature: Validate Edit Account Functionality


Scenario: Verify user edit account with mandatory fields
Given user is on home page
When user click on signin
Then user should see login page
And user click on edit button
Then user should see edit account page

Scenario: Verify user create account with optional fields
Given user is on home page
When user click on signin
Then user should see login page
And user click on edit button
Then user should see edit account page