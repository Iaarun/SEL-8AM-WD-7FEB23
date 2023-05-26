Feature: login feature test
  @smoketest 
  Scenario: test login feature with valid data
  Given user is at the login page
  When user provide valid credential
  And user click on login button
  Then  Accounts page should be displayed
  When user logout
  
  @combinedstep
  Scenario: test login feature with valid data2
  Given user launches login page
  When user provide valid credential
  And user click on login button
  Then  Accounts page should be displayed
  When user logout
  
  
  #using datatable
  @test1
  Scenario: test userlogin with parameter
  Given user launches login page
  When user provide valid username and password
  | password | username          |  
  |cba@test  | cbatest7@gmail.com|
  And user click on login button
  Then  Accounts page should be displayed
  When user logout
  
  @errormessage
  Scenario Outline: verify error message for incorrect username and password
  Given user launches login page
  When user provides incorrect <username> and <password>
  And user click on login button
  Then <error> message should be displayed 
  
  Examples:
  | username             | password    | error                                                 |
  | "cbatest@test.com"   | "cba@test"  |"Warning: No match for E-Mail Address and/or Password."|
  | "cbatest7@gmail.com" | "abc@test"  |"Warning: No match for E-Mail Address and/or Password."|
  

 
 
  
   

 