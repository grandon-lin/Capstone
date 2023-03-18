Feature: Checkout Feature Scenario

	Background: 
	Given I login as a user

Scenario: Add a product to checkout and move on to order summary
	When I select a category as "Antibiotics"
	And I should land on the category page for "Antibiotics"
	And I click on the view button for a product as "Amoxicillin"
	Then I should land on the product details page for "Amoxicillin"
	And I click on the Add to Cart button
	Then I should land on the shopping cart page and display item for "Amoxicillin"
	And I click on Checkout button
	Then I should land on Select Shipping Address page
	And I click on Select button
	Then I should land on Payment Details page
	And I enter the card number as "5483239104832163"
	And I enter Expiry Date as "05" and "26"
	And I enter CV Code as "694"
	And I click on Pay button
	Then I land on the Order Confirmation page
