Feature: Calculator
	As a user with almost negligble arithmetic talent
	In order to get by with my life
	I should be able to use a calculator
	
Scenario: I should be able to calculate my grocery bill
	Given I have a calculator
	When I have bought the following
		| item | price |
		| Milk | 20    |
		| Vegetables | 50 |
		| Fruits | 350 |
	And I returned "Oil" for 90 rupees
	Then my grocery bill should be 330
	