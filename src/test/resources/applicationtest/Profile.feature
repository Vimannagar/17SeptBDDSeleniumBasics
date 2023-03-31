Feature: Profile functionality
@sanity @functional
Scenario: Add profile 
Given user is at the add profile page
When user enters the information
Then Profile gets created

@functional @regression
Scenario: Edit profile 
Given user is at profile page
When user click on edit link
And update the information
Then Profile gets updated

@regression
Scenario: Delete profile 
Given user is at profile page
When user click on delete button
Then Profile should get deleted

