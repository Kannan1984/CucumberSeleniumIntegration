#this code is enhanced futher in login1.feature by reducing number of scenario.

Feature: Login Feature
Background:
Given The Login URL of TestMeApp

Scenario: Valid User
When User enters Lalitha as username
And User enters Password123 as password
Then User clicks on Sign in

Scenario: Admin User
When User enters admin as username
And User enters Password456 as password
Then User clicks on Sign in

Scenario: Admin User
When User enters abc as username
And User enters xyz as password
Then User clicks on Sign in