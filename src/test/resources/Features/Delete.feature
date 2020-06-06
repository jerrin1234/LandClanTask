Feature: Delete
@Regression
Scenario: Verify the functionality of Delete Button
Given I am in homepage
When I click 'Delete Button' on any user
Then The dialog box should appear 
And I click 'Delete Button' on the dialog box
Then User details should delete from the user list