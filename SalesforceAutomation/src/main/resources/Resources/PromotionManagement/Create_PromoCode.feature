Feature: Promotion Management
@Promo
Scenario Outline: Create Promo Code

  Given User Login to CMS application
 # When Admin navigate to Promotion page and create the promo code "<PromoType>", "<PromoCode>", "<CampaignName>", "<CampaignStartdate>","<CampaignEnddate>","<TicketExpirydate>","<NoOfdays>", "<MaxAllowedCount>", "<DiscountType>", "<DiscountIn>", "<UserType>"
  #Then Verify Promo code has created
   Examples: 
      | Account_Description | Account_Name | Account_Number | Account_Rating |
      | Test Account        | IBM          |   321546789012 | Hot            |
  
  