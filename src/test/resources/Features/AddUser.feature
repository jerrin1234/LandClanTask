Feature: AddUser

Background:
Given I am in homepage

Scenario: Validate Add New User functionality 

When I click on 'AddUser' Button 
And I should see the 'Add New User' popup window
And I enter all valid credentials 
|Name|Test|
|Surname|Selenium|
|Address|27 TwistWay|
|Post Code|SL2 2Ay|
|City|Slough|
And I click on 'save Button'
Then The new user should add