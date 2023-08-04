@tag
Feature: Calculator

Scenario Outline: add two numbers
	Given Two input values and an operator, <first>, <second>, and <opt>
	When I add the two values
	Then I expect the result <result>

	Examples:
		| first | second | opt | result |
		| 6     | 2      | *   | 12     |
		| 6     | 2      | /   | 3      |
		| 6     | 2      | ^   | 36     |