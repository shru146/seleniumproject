Feature: Add empskill feature 
 We need add employees skill
 
 #Scenario: To test the login functionality by valid credentials of admin role
 #Given  chrome page is open
 #And orange hrm url is launched
 #When admin enters their username
 #And admin enters their password
 #And click on login
 #Then admin dashboard should be visible
 
 Scenario: To test that admin is able to add skill of th employees
 Given viewskill page is open
 When admin click on add skill button
 And  enters skill name as "seleniumJava"
 And click on save
 Then skill should be added successfully
  