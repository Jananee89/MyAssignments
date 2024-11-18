Feature: Salesforce account edit

Scenario: Account updation
Given login to salesforce url 
And enter username as 'Vidyar@testleaf.com'
And enter password as 'Sales@123'
And click login button
And select menu button from left corner 
And click view all
And click on sales from App launcher
And click on accounts tab
And Search for the account using unique account name 'Allen'
And Click the dropdown icon next to the account and select Edit
And Set Type to Technology Partner
And Set Industry to Healthcare
And Enter the Billing Address 'Chennai'
And Enter the Shipping Address 'Tnagar'
And Set Customer Priority to Low
And Set SLA to Silver
And Set Upsell Opportunity to No
And Set Active to NO
And Enter a unique number in the Phone field '9988776655'
When Click Save 
Then verify the phone number


