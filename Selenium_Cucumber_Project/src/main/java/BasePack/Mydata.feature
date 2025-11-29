Feature: Checking the login functionality
Scenario: Check the title after login

Given Enter application URL
Then Check the title of the Homepage
When Title checks enter username
Then Enter password
And Hit on login button
When Login happens
Then Check title after login happens



Scenario: Check new employee is added 

Given Enter applicatoin url
Then Enter username and password
And Hit on the login button
When Login happends
Then Enter employee details and save
Then Check employee is added 

