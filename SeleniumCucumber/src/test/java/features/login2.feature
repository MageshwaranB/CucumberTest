@Login
Feature: SwagLabs 
#Scenario: Login Functionality
#Given User is on login page
#When User enters username
#And User enters password
#And User clicks the login button
#Then User should be successfully logged into homepage


Scenario Outline: Login with multiple users 
	Given User is on Login Page 
	When : User enters <username> and <password> 
	And User Clicks on Login Button 
	Then User successfully logged into Homepage 
	Examples: 
		|username|password|
		|standard_user|secret_sauce|
		|locked_out_user|secret_sauce|


