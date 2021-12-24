Feature: Sign in and change password, sign in with new password and change display name, then sign in and reverse all the changes, 
 and finally sign back in again with the original details


Scenario: I log in with original credentials and change password

Given I login with valid account details
|username						|password 	|
|jondonuttest@sharklasers.com	|Cloggtwo!	|
Then  I should land in the account dashboard
Given I select the link "Account details"
Then I enter my current password "Cloggtwo!"
And I enter my new password "JonNewPassword"
And I confirm my new password "JonNewPassword"
When I click the save changes button
Then I should see the message <item>
|message								|
|Account details changed successfully.	|
And I should see onscreen text with the sentances  <text1> and <text2>
|text1											|text2																																					| 
|Hello Jon Test 1 (not Jon Test 1? Log out)		|From your account dashboard you can view your recent orders, manage your shipping and billing addresses, and edit your password and account details.	|


Scenario: I log in with the new credentials and change Display name

Given I login with valid account details
|username						|password 		|
|jondonuttest@sharklasers.com	|JonNewPassword	|
Then  I should land in the account dashboard
Given I select the link "Account details"
And I enter my new display name "DisplayJon2"
When I click the save changes button
Then I should see the message <item>
|message								|
|Account details changed successfully.	| 
And I should see onscreen text with the sentances  <text1> and <text2>
|text1											|text2																																					|
|Hello DisplayJon2 (not DisplayJon2? Log out)	|From your account dashboard you can view your recent orders, manage your shipping and billing addresses, and edit your password and account details.	|


@Test1
Scenario: I log in with the new credentials and change Display name and password back to the original settings

Given I login with valid account details
|username						|password 		|
|jondonuttest@sharklasers.com	|JonNewPassword	|
Then  I should land in the account dashboard
Given I select the link "Account details"
And I enter my new display name "Jon Test 1"
Then I enter my current password "JonNewPassword"
And I enter my new password "Cloggtwo!"
And I confirm my new password "Cloggtwo!"
When I click the save changes button
Then I should see the message <item>
|message								|
|Account details changed successfully.	|
And I should see onscreen text with the sentances  <text1> and <text2>
|text1											|text2																																					| 
|Hello Jon Test 1 (not Jon Test 1? Log out)		|From your account dashboard you can view your recent orders, manage your shipping and billing addresses, and edit your password and account details.	|


     