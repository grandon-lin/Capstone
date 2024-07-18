Feature: To perform API calls

Scenario: To perform the most-viewed products call
Given The base URI is "http://localhost:8090/medicare/json/data/mv/products"
When I perform the Get operation
Then Response code should be 200
Then UI displays the corresponding products