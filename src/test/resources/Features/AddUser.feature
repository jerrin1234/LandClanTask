Feature: AddUser

Scenario: Validate Add New User functionality 
Given I am in homepage
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

Scenario: Verify united Kindom is showing as default when adding a new user
Given I am in 'add new user' page
Then I should see 'United Kingdom' selected as default

Scenario: Verify country code is picking up automatically when adding a user
Given I am in 'add new user' page
When I select country
And I click on 'save Button'
Then The new user country code should appear along with the other details