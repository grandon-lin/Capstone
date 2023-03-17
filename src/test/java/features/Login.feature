Feature: Login Feature Scenario

Background: 
    Given I have navigated to the login page

Scenario Outline: This scenario is to define the login process as a user
When I enter the correct email as "<Email>" and password as "<Password>"
And I click on the Login button
Then I should land on the home page
Then I should not see Manage Products

Examples:
	| Email			|	Password	|
	|	kn@gmail.com	|	12345			|

Scenario Outline: This scenario is to define the login process as an admin
When I enter the correct email as "<Email>" and password as "<Password>"
And I click on the Login button
Then I should land on the home page
Then I should see Manage Products

Examples:
	|	Email			|	Password	|
	|	vk@gmail.com	|	admin			|