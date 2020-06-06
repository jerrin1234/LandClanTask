Feature: Edit
@Regression
Scenario: Verify the functionality of edit button

Given I am in homepage
When I click 'Edit Button' on the user profile
And I change the address of the user
|Address|38 Compton Avenue|
|Post Code|E6 3DP|
And I click on 'save Button'
Then I should see the updated details on the selected user profile