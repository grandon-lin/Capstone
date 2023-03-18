Feature: Sign Up Feature Scenario

	Background: 
	Given I have navigated to the Sign Up page
	
@test
Scenario: This scenario is to define the sign-up happy path as a user
	When I enter all the personal information as a user
	And I click on Next-Billing button
	Then I should land on Sign Up - Address page
	And I enter all the address information
	And I click on Next-Confirm button
	Then I should land on the confirmation page
	And I click on Confirm button
	Then I should land on Welcome page
	And I click on Login Here button
	Then I should have landed on Login page
	And I enter the email and password
	And I click on Login button
	Then I land on the home page

@test
Scenario: This scenario is to define the sign-up happy path as a supplier
	When I enter all the personal information as a supplier
	And I click on Next-Billing button
	Then I should land on Sign Up - Address page
	And I enter all the address information
	And I click on Next-Confirm button
	Then I should land on the confirmation page
	And I click on Confirm button
	Then I should land on Welcome page
	And I click on Login Here button
	Then I should have landed on Login page
	And I enter the email and password
	And I click on Login button
	Then I land on the home page