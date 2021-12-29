Feature: Contact Managment

  @Automation @UI @Regression 
  Scenario Outline: Create a contact
    Given user login to salesforce application

    # When user navigate to create contact page and create contact "<FirstName>", "<LastName>" , "<EmailId>" , "<PhoneNo>"
    #  Then verify conntact has created
    Examples: 
      | FirstName | LastName | EmailId          | PhoneNo    |
      | Amulya    | kumar    | Amulya@gmail.com | 9004682113 |

  @Automation @UI @Regression @Test
  Scenario Outline: Edit contact
    Given user login to salesforce application
    When user navigate to create contact page and create contact "<FirstName>", "<LastName>" , "<EmailId>" , "<PhoneNo>"

    #  Then verify conntact has created
    Examples: 
      | FirstName | LastName | EmailId          | PhoneNo    |
      | Amulya    | kumar    | Amulya@gmail.com | 9004682113 |
