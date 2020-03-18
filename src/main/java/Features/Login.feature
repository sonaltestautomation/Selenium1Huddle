Feature: Login fearure
Scenario Outline: Check if user is able to successfully login.

Given user is already on login page
When title of page is 1Huddle Admin
Then user enters "<Username>" and "<Password>"
And user clicks on login button
Then user is on Dashboard page

Examples: 
       |Username|Password|
       |sha@codewalla.com|pass123|