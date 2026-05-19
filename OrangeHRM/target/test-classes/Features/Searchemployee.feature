Feature: Search employee
   We need to search a employee 

Scenario: To check admin is able to search a employee
Given Navigate PIM page 
When enter a employee name 
And click on search button 
Then employee is details should be displayed
