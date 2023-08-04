@tag
Feature: Calculator

Scenario Outline: calculate power, multiply, and divide of two numbers
	Given Two input values <first> and <second>
	When I <opt> the two values
	Then I expect the result <result>

	Examples:
		| first | second | opt | result |
		| 6     | 2      | *   | 12     |
		| 6     | 2      | /   | 3      |
		| 6     | 2      | ^   | 36     |

Scenario: multiply two values
	Given Two input values -2 and -5
	When I * the two values
	Then I expect the result 10