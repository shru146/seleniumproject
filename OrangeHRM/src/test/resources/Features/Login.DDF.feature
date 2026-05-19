Feature: Login feature with multiple user 
  testing the login functionality of orange hrm for different user role
  
  Scenario: To validate valid functionality with different user roal 
  Given iven browser page is open  
  And application url is accessed
  When user enter their username as "<username>"
  And user enter their password as "<password>"
  And user click on login button
  Then each user dashboard is visible 
  
   
 Examples:
  |username|password|
  |Admin|admin123|
  |Prajkta|Prajkta123|
  |Raju|Raju123|
  |ret56|35tgyu|
 
  
  
