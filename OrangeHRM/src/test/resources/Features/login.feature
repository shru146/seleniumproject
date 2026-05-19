Feature: Login feature 
we are testing a login functionality of orange hrm 

Scenario: To test the login functionality by valid credentials of admin role 
Given Browser chrome is launched 
And orange hrm url is launched 
When admin enters their username 
And admin enters their password
And click on login 
Then admin dashboard should be visible 
And admin is able to logout from the application 