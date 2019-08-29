@Joimicro @regression 
Feature: Verify Joint Account- Via Micro Deposits

Scenario: Verify Joint Account- Via Micro Deposits
	Given I navigate to Login page of Osiris 
	When I click Get Started Login button 
	Then I should see Login modal 
	When I type Username as "default" 
	And I type Password as "default" 
	And I click Login button 
	Then I should be at Account Summary Page 
	When I click on Menu 
	Then I should see "Start New Account" option 
	When I click on "Start New Account" option 
	
	Then I should see "Question 1" 
	And I should see question as "I plan to begin taking money from my investment in..." 
	When I select answer option as "1-2 years" 
	#When I click on Next button
	
	Then I should see "Question 2" 
	And I should see question as "As I withdraw money from these investments, I plan to spend it over a period of..." 
	When I select answer option as "3-5 years" 
	
	Then I should see "Question 3" 
	And I should see question as "If you had to choose between more job security with a small pay increase and less job security with a big pay increase, which would you pick?" 
	When I select answer option as "Probably more job security with a small pay increase." 
	
	Then I should see "Question 4" 
	And I should see question as "Which of these investing possibilities sounds most attractive to you?" 
	When I select answer option as "Some variability in returns, but a chance of higher overall returns." 
	
	Then I should see "Question 5" 
	And I should see question as "How do you expect your income to change over the next 5 to 10 years?" 
	When I select answer option as "Quite secure, although nothing is ever certain." 
	
	Then I should see "Question 6" 
	And I should see question as "Generally, I prefer an investment with little to no ups or downs in value, and I'm okay with accepting the lower returns these investments may make." 
	When I select answer option as "I agree" 
	
	Then I should see "Question 7" 
	And I should see question as "Compared to others, how would you generally rate your willingness to take financial risk?" 
	When I select answer option as "High risk taker." 
	
	Then I should see "Question 8" 
	And I should see question as "Even if I experienced a significant loss on an investment, I would still consider making risky investments." 
	When I select answer option as "Agree" 
	
	Then I should see "Question 9" 
	And I should see question as "I would not put even a small amount of my money into high-risk investments." 
	When I select answer option as "Agree" 
	
	Then I should see "Question 10" 
	And I should see question as "I may have an unforeseen need to withdraw a significant amount of money from my account." 
	When I select answer option as "There's no chance of that happening." 
	
	Then I should see "Question 11" 
	And I should see question as "Which would you choose?" 
	When I select answer option as "50% chance of winning $15,000" 
	
	Then I click Submit button 
	And I should be on Building Investment Profile Page 
	
	Then I should be on Current Model Page 
	When I click on Select button Current Model page 
	Then I should be on Terms and Condition Page 
	
	When I select Accpetance checkbox 
	And I click on Next button Terms and Condition Page 
	
	Then I should see Open Your Account Page 
	When I click on Next button Open Your Account Page 
	
	When I select Account Type as "Joint" 
	When I select option as "Growth Income" in "Investment Objective" dropdown 
	And I select option as "Limited" in "Investment Experience" dropdown 
	And I select option as "Medium" in "Risk Tolerance" dropdown 
	And I select option as "25%" in "Tax Bracket" dropdown 
	And I select option as "100001 to 200000" in "Annual Income (from all sources)" dropdown 
	And I select option as "50001 to 100000" in "Liquid Net Worth (cash & liquid investments only)" dropdown 
	And I select option as "200001 to 500000" in "Total Net Worth (excluding residence)" dropdown 
	And I select option as "100001 to 200000" in "Annual Income (from all sources)" dropdown 
	And I select option as "Short (Less than 3 years)" in "Time Horizon" dropdown 
	And I select option as "Very Important" in "Liquidity Needs (The ability to quickly and easily convert all or a portion of the account assets into cash without experiencing significant loss)" dropdown 
	And I click on Next button Investment Profile page 
	
	Then I should see Account Information page 
	And I should see Primary account section
	When I type First Name as "0Test1230" for Primary Applicant
	And I type Last Name as "0md0" for Primary Applicant
	And I type Date Of Birth as "12/24/1970" for Primary Applicant
	And I type Social Security Number as "666-00-1989" for Primary Applicant
	And I click on Enter Address Manually button for Primary Applicant
	And I type Street Address as "1234 Main Street" for Primary Applicant
	And I type City as "San Rafael" for Primary Applicant
	And I type State as "CA" for Primary Applicant
	And I type Postal Code as "94903" for Primary Applicant
	And I type Phone Number as "123-456-7890" for Primary Applicant
	And I select option as "Work" in "Phone Number Type" dropdown on Account Information page for Primary Applicant
	And I select option as "Unemployed" in "Employment Status" dropdown on Account Information page for Primary Applicant
	And I click on Next button Account Information page 
	
	Then I should see Account Information page 
	And I should see Joint Applicant section
	When I type First Name as "0Ros10" for Joint Applicant
	And I type Last Name as "0md10" for Joint Applicant
	And I type Date Of Birth as "12/24/1970" for Joint Applicant
	And I type Social Security Number as "666-00-1990" for Joint Applicant
	And I click on Enter Address Manually button for Joint Applicant
	And I type Street Address as "1234 Main Street" for Joint Applicant
	And I type City as "San Rafael" for Joint Applicant
	And I type State as "CA" for Joint Applicant
	And I type Postal Code as "94903" for Joint Applicant
	And I type Phone Number as "123-456-7891" for Joint Applicant
	And I select option as "Work" in "Phone Number Type" dropdown on Account Information page for Joint Applicant
	And I select option as "Unemployed" in "Employment Status" dropdown on Account Information page for Joint Applicant
	
	And I click on Next button Account Information page 
	
	Then I should see Trusted Contact page 
	And I should see Include trusted contact checkbox 
	When I click on Next button Trusted Contact page
	
	Then I should see Interested Parties page
	When I click on Next button Interested Parties page
	
	Then I should see Investment Amount page
	When I type Investment Amount as "1000"
	And I click on Next button Investment Amount page
	
	Then I should see Link Bank Account page
	When I click Link Account With Micro Deposits
  Then I should see Link Bank Account with Micro Deposits
  When I type Bank Account Number as "1111222233330000"
  And I type Bank Routing Number as "011401533"
  And I type Bank Account Owner Name as "0ros0"
  And I type Bank Account Nickname as "0ro0"
  And I select option as "Savings" in "Bank Account Type" dropdown on Link Bank Account with Micro Deposits page
  And I click on Next button Link Bank Account with Micro Deposits page
	
	Then I should see Signatures page
	When I select Applicant Signature checkbox
	And I select option as "Joint Tenants in Common Form" in "Joint Form" dropdown on Signatures page
	And I click on Next button Signatures page
	
	Given I navigate to Login page of Hyperion
  When I click Get Started Login button Hyperion landing page
  Then I should see Login section hyperion
  When I type Username as "default" for Hyperion
  And I type Password as "default" for Hyperion
  And I click Login button for Hyperion
    
  Then I should be at Hyperion Home page
  When I click on Request Dashboard button
  Then I should be at Request Dashboard page
  When I click on Refresh button
  And I click on Account with Name as "0Test1230"
  Then I should see Account number as recorded text
	
	
	
	
	
	
	
	
	