#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Verifying the application login functionality


  
  
  
     Background:
     Given Launch the Url
  Scenario Outline: Login with valid Credentials   
    When Login to Application with Username <Uname> and Password <Pass>
    Then Verify <expected> Text in the Home Page
    When Close the browser

    Examples: 
      | Uname  | Pass | expected  |
      |"Capstone"| "123456" | "Dashboard" |
      | "name2" |     "7" | "Fail"    |
      | "name3" |  "123456"   | "Fail"    |
