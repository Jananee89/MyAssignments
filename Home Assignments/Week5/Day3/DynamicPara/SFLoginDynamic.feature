Feature: Salesforce account dynamic
Scenario Outline: Account creation verification with dynamic parametrization
Given login to salesforce url 
And enter username vidyar@testleaf.com 
And enter password Sales@123
And click login button
And select menu button from left corner 
And click view all
And click on sales from App launcher
And click on accounts tab
And click on New button
And enter your account name as <accname>
And select Ownership as public
When click on save 
Then verify account name

Examples:
|accname|
|NameRaj|
|NameAllen|