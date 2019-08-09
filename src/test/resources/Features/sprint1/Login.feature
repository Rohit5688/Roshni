@login @regression @12345 @sprint1 
Feature: 12345 - Sprint 1 
	Login to osiris and hyperion
	
@15536 
Scenario: 15536 - Login to osiris and hyperion 
	Given I navigate to Login page of Osiris 
	When I click Get Started Login button 
	Then I should see Login modal 
	When I type Username as "default" 
	When I type Password as "default" 
	When I click Login button 
	Then I should be at Account Summary Page 
	
	
