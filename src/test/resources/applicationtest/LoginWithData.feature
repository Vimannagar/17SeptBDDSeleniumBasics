Feature: Login functionality with data
Scenario: validate login for given data
Given user should be at the login screen
When user enters the username as "testuser"
And user enters the password as "test@12345"
And user click on  1 login button
Then user should get logged in