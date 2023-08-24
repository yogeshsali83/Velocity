Feature: Login functionality

Background: This is common method
Given I am common one

Scenario: login to the application
Given User is at login page
When User enters the username as "GauravPatil"
And User enters the password as "Password"
And User clicks on login button
Then User redirects to home page

Scenario: verify title
Given User is at login page
Then page title should get display