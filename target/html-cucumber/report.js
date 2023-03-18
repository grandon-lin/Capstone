$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Checkout.feature");
formatter.feature({
  "name": "Checkout Feature Scenario",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I login as a user",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.CheckoutStepDef.i_login_as_a_user()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add a product to checkout and move on to order summary",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "I select a category as \"Antibiotics\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.CheckoutStepDef.i_select_a_category_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should land on the category page for \"Antibiotics\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.CheckoutStepDef.i_should_land_on_the_category_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the view button for a product as \"Amoxicillin\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.CheckoutStepDef.i_click_on_the_view_button_for_a_product_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should land on the product details page for \"Amoxicillin\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.CheckoutStepDef.i_should_land_on_the_product_details_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Add to Cart button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.CheckoutStepDef.i_click_on_the_Add_to_Cart_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should land on the shopping cart page and display item for \"Amoxicillin\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.CheckoutStepDef.i_should_land_on_the_shopping_cart_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Checkout button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.CheckoutStepDef.i_click_on_Checkout_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should land on Select Shipping Address page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.CheckoutStepDef.i_should_land_on_Select_Shipping_Address_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Select button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.CheckoutStepDef.i_click_on_Select_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should land on Payment Details page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.CheckoutStepDef.i_should_land_on_Payment_Details_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the card number as \"5483239104832163\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.CheckoutStepDef.i_enter_the_card_number_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter Expiry Date as \"05\" and \"26\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.CheckoutStepDef.i_enter_Expiry_Date_as_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter CV Code as \"694\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.CheckoutStepDef.i_enter_CV_Code_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Pay button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.CheckoutStepDef.i_click_on_Pay_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I land on the Order Confirmation page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.CheckoutStepDef.i_land_on_the_Order_Confirmation_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/features/Login.feature");
formatter.feature({
  "name": "Login Feature Scenario",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "This scenario is to define the login process as a user",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "I enter the correct email as \"\u003cEmail\u003e\" and password as \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I click on the Login button",
  "keyword": "And "
});
formatter.step({
  "name": "I should land on the home page",
  "keyword": "Then "
});
formatter.step({
  "name": "I should not see Manage Products",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Email",
        "Password"
      ]
    },
    {
      "cells": [
        "kn@gmail.com",
        "12345"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have navigated to the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.LoginStepDef.i_have_navigated_to_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "This scenario is to define the login process as a user",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "I enter the correct email as \"kn@gmail.com\" and password as \"12345\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.LoginStepDef.i_enter_the_correct_email_as_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.LoginStepDef.i_click_on_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should land on the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.LoginStepDef.i_should_land_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should not see Manage Products",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.LoginStepDef.i_should_not_see_Manage_Products()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "This scenario is to define the login process as an admin",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "I enter the correct email as \"\u003cEmail\u003e\" and password as \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I click on the Login button",
  "keyword": "And "
});
formatter.step({
  "name": "I should land on the home page",
  "keyword": "Then "
});
formatter.step({
  "name": "I should see Manage Products",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Email",
        "Password"
      ]
    },
    {
      "cells": [
        "vk@gmail.com",
        "admin"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have navigated to the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.LoginStepDef.i_have_navigated_to_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "This scenario is to define the login process as an admin",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.step({
  "name": "I enter the correct email as \"vk@gmail.com\" and password as \"admin\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.LoginStepDef.i_enter_the_correct_email_as_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.LoginStepDef.i_click_on_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should land on the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.LoginStepDef.i_should_land_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see Manage Products",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.LoginStepDef.i_should_see_Manage_Products()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});