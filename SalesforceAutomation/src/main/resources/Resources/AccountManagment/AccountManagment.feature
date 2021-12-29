Feature: Account Managment

  @Automation @UI @Sprint_1 @Release_10.2 @Regression  @Smoke 
  Scenario Outline: Create Account
   Given User login to salsforce application
    When user can create an account with "<Account_Description>","<Account_Name>" ,"<Account_Number>" , "<Account_Rating>"

    Then User will validate created Account "<Account_Description>","<Account_Name>" ,"<Account_Number>" , "<Account_Rating>"
    Examples: 
      | Account_Description | Account_Name | Account_Number | Account_Rating |
      | Test Account        | IBM          |   321546789012 | Hot            |
