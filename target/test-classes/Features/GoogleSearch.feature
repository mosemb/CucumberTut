Feature: To test google search functionality 

Scenario: Validate google search is working

Given browser is open
And user is on google search page
When a user enters a text in search box
And hits enter
Then user is navigated to search results

