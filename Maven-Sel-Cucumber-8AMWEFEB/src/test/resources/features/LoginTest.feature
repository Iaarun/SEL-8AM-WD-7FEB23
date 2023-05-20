Feature: login feature test

  Scenario: test login feature with valid data
  Given user is at the login page
  When user provide valid credential
  And user click on login button
  Then  Accounts page should be displayed
  When user logout
  And user close the browser
  
   

 