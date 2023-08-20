Feature: Validation of Login Page in Facebook Web Application


Scenario Outline:TC_01 To Validate Login page with Multiple Login Credintials
Given User Lauch Facebook web Application
When User enter valid "<username>" and valid "<Password>"
And User click login button
Then User to check home page is displayed

Examples:
|username|Password|
|Arun@gmail.com|Arun@123|
|Shiva@gmail.com|Shiva@123|
|Arjun@gmail.com|Arjun@123|