Feature: Login Feature
Background:
Given The url of the application

Scenario: Valid User

When user enters mercury as username
And user enters mercury as password
And user clicks on submit
Then user is valid

Scenario: In Valid User

When user enters jack as username
And user enters jack as password
And user clicks on submit
Then user is in valid