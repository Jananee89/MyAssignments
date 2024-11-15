Feature: Leaftaps

Background:
Given enter the username as 'demosalesmanager'
Given enter the password as 'crmsfa' 
When click on login
When click on crmsfa link
And click on leads link


Scenario Outline: create lead       

And click on createlink lead
Given enter the company name as <comName>
Given enter the firstname as <firstName>
Given enter the last name <lastName>
Given enter phone number  <ph>
When click on the create lead button

Examples:
|comName|firstName|lastName|ph|
|CTS|Jananee|Manoj|9988776655|
|Infosys|Rhea|Manoj|8877665544|


Scenario Outline: Edit lead       

And click on find leads link
And click on phone tab
And enter the phone number as <phnum>
And click on find leads
And select the resulting lead
And click on edit 
And update the company name to <compname>
When click on update button

Examples:
|phnum|compname|
|9988776655|infosys|
|8877665544|cts|

Scenario Outline: Delete lead       

And click on find leads link
And click on phone tab
And enter the phone number as <phnum>
And click on find leads
And select the resulting lead
And click on delete


Examples:
|phnum|
|9988776655|