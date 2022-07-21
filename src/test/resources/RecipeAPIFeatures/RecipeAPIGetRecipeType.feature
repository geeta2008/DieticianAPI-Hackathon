Feature: Validate and Test Get Request for DieticianAPI with RecipeType
Background: The Authorization is set to "Basic auth" with valid username and password

Scenario: Checking if we are getting record of with RecipeType
Given User set GET request and endpoint with all valid Recipe Type
When User send GET request 
Then Status 200 success will be displays

Scenario: Checking if we are getting record of RecipeType with invalid query
Given User sets GET request with endpoint with invalid request query string
When Users sends GET request 
Then Status 400 Validation Error will be displays
  
Scenario: Checking if we are getting record of RecipeType with Unauthorised Acces 
Given User set GET request with endpoint "/RecipeType" with default authorization
When User sent GET request  
Then Status 401 Unauthorised Acces will be displays

Scenario: Checking if we are getting record of RecipeType with invalid endpoint        
Given User set GET request with invalid endpoint
When Users send GET request 
Then Status 404 Not Found will be displays 
