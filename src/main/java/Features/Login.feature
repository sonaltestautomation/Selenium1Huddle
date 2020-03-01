Feature: Login fearure
Scenario: Check if user is able to successfully login.

Given user is already on login page
When title of page is 1Huddle Admin
Then user enters username and password
And user clicks on login button
Then user is on Dashboard page