Feature: Edit employee details
          We need to edit employee details 

Scenario: To check admin is able to edit employee details
Given Navigate PIM page open
And  enter  employee name 
When click on the  search button 
And  employee record found
And  click on edit button 
And  click on save button 
Then edited details save successfully 