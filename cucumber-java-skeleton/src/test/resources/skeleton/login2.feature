#this is the enhanced code of login.feature by reducing no of scenario by
#introducing scenario outline and data table
Feature: Login Feature
Background:
Given The Login URL of TestMeApp

Scenario Outline: Login Behaviour
When User enters <username> as username
And User enters <password> as password
Then User clicks on Sign in <result> 

Examples:
|username|password|result|
|Lalitha|Password123|valid|
|admin|Password456|valid|
|abc|xyz|invalid|