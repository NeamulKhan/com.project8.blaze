Feature: This feature is for signup functionality


@Signup8

Scenario: verify user can sign up with credentials

Given Launch "<URL>"
Then click signup link
Then verify user can see sign up page
Then enter username and password and click sign up button
Then verify user can successfully create account