Feature: Login

Scenario: Succesful login with valid credentials
Given user launches chrome browser
When user opens URL "https://offbeatdonuts.com/my-account/"
And user enters email as "jondonuttest@sharklasers.com" and password as "Cloggtwo!"
And clicks Login button
Then Page Title should be "Hello Jon Test 1 (not Jon Test 1? Log out)"
When user clicks on Log out link
Then Page header should be "Let's get started"
And close browser

  