Feature: Login fearure
Scenario: Check if user is able to successfully login.

Given user is already on login page
When title of page is 1Huddle Admin
Then user logs into app
Then user is on Dashboard page
Then close the browser