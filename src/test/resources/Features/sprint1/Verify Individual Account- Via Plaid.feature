@Indplaid @regression 
Feature: Verify Individual Account- Via Plaid 

Scenario: Verify Individual Account- Via Plaid 
	Given I navigate to Login page of Osiris 
	When I click Get Started Login button 
	Then I should see Login modal 
	When I type Username as "default" 
	When I type Password as "default" 
	When I click Login button 
	Then I should be at Account Summary Page 
	When I click on Menu 
	Then I should see "Start New Account" option 
	When I click on "Start New Account" option 
	
	Then I should see "Question 1" 
	Then I should see question as "I plan to begin taking money from my investment in..." 
	When I select answer option as "1-2 years" 
	#When I click on Next button
	
	Then I should see "Question 2" 
	Then I should see question as "As I withdraw money from these investments, I plan to spend it over a period of..." 
	When I select answer option as "3-5 years" 
	
	Then I should see "Question 3" 
	Then I should see question as "If you had to choose between more job security with a small pay increase and less job security with a big pay increase, which would you pick?" 
	When I select answer option as "Probably more job security with a small pay increase." 
	
	Then I should see "Question 4" 
	Then I should see question as "Which of these investing possibilities sounds most attractive to you?" 
	When I select answer option as "Some variability in returns, but a chance of higher overall returns." 
	
	Then I should see "Question 5" 
	Then I should see question as "How do you expect your income to change over the next 5 to 10 years?" 
	When I select answer option as "Quite secure, although nothing is ever certain." 
	
	Then I should see "Question 6" 
	Then I should see question as "Generally, I prefer an investment with little to no ups or downs in value, and I'm okay with accepting the lower returns these investments may make." 
	When I select answer option as "I agree" 
	
	Then I should see "Question 7" 
	Then I should see question as "Compared to others, how would you generally rate your willingness to take financial risk?" 
	When I select answer option as "High risk taker." 
	
	Then I should see "Question 8" 
	Then I should see question as "Even if I experienced a significant loss on an investment, I would still consider making risky investments." 
	When I select answer option as "Agree" 
	
	Then I should see "Question 9" 
	Then I should see question as "I would not put even a small amount of my money into high-risk investments." 
	When I select answer option as "Agree" 
	
	Then I should see "Question 10" 
	Then I should see question as "I may have an unforeseen need to withdraw a significant amount of money from my account." 
	When I select answer option as "There's no chance of that happening." 
	
	Then I should see "Question 11" 
	Then I should see question as "Which would you choose?" 
	When I select answer option as "50% chance of winning $15,000" 
	
	Then I click Submit button 
	Then I should be on Building Investment Profile Page 
	
	Then I should be on Current Model Page 
	When I click on Select button Current Model page 
	Then I should be on Terms and Condition Page 
	
	When I select Accpetance checkbox 
	When I click on Next button Terms and Condition Page 
	
	Then I should see Open Your Account Page 
	When I click on Next button Open Your Account Page 
		
	When I select Account Type as "Individual"
	When I select option as "Growth Income" in "Investment Objective" dropdown 
	When I select option as "Limited" in "Investment Experience" dropdown 
	When I select option as "Medium" in "Risk Tolerance" dropdown 
	When I select option as "25%" in "Tax Bracket" dropdown 
	When I select option as "100001 to 200000" in "Annual Income (from all sources)" dropdown 
	When I select option as "50001 to 100000" in "Liquid Net Worth (cash & liquid investments only)" dropdown 
	When I select option as "200001 to 500000" in "Total Net Worth (excluding residence)" dropdown 
	When I select option as "100001 to 200000" in "Annual Income (from all sources)" dropdown 
	When I select option as "Short (Less than 3 years)" in "Time Horizon" dropdown 
	When I select option as "Very Important" in "Liquidity Needs (The ability to quickly and easily convert all or a portion of the account assets into cash without experiencing significant loss)" dropdown 
	
	