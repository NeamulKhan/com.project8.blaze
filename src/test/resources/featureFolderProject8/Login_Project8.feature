Feature: This feature is for log in functionality

@Login8

Scenario: verify user can succesfully log in with valid credentials

Given Launch "<URL>"
Then click log in link
Then enter username,password and click ligin button
Then verify user succesfully loged in
