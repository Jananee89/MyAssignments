Feature: login functionality for leaftaps

#Background:
#Given Launch the browser
#And Load the url


Scenario Outline: login with positive creditials       

Given enter the username as 'demosalesmanager'
Given enter the password as 'crmsfa' 
When click on login
#Then Welcome page is displayed
When click on crmsfa link
And click on leads link
And click on createlink lead
Given enter the company name as <comName>
Given enter the firstname as <firstName>
Given enter the last name <lastName>
When click on the create lead button

Examples:
|comName|firstName|lastName|
|CTS|Jananee|Manoj|
|Infosys|Rhea|Manoj|
