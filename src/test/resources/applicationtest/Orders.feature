Feature: Order information
Background:
Given user should be logged into the application
When user click on orders button
Then user should redirect to the orders page



Scenario: validate the currently placed order
When user click on the orderid
Then user should track the package


Scenario: validate information for previously placed order
When user click on past order button
Then user should see the information


