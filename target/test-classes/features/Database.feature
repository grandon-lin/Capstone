Feature: Add Category and Check Database Scenario

Scenario: Add a new category, verify it's added in the database, remove the new category 
	Given I login as an admin
	When I click on Manage Product
	Then I should land on Product Management page
	And I click on Add New Category button
	Then I should see New Category dialog displayed
	Then I enter Name as "Regular"
	Then I enter Description as "Regular medicine category for testing"
	Then I click Save button
	Then I verify the new category is added to the database
