Feature: Add new employee
we need add more employee 

Scenario: To check admin is able to add new employees
Given PIM page is open
When click on add employee button
And   enter first name and last name 
And Click on save button 
Then employee should be add successfully 
