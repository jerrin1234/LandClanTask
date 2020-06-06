Feature: Delete
@Regression
Scenario: Verify the functionality of Delete Button
Given I am in homepage
When I click 'Delete Button' on any user
Then The authentication popup window should appear
And I click 'Delete Button' on the authentication window
Then User details should delete from the user list