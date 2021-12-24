Feature: Sign in with valid account details, but no order history or activity

Dashboard contains - Welcome message, not you message, and links for Log out, recent orders, Shipping/billing addresses, edit password and account
Confirm the text of the sentances and the link text they contain.
Confirm the nav link text is correct
Confirm the contents in each of the side menu tabs when navigated to and opened.

Background: 
Given I login with valid account details
|username						|password 	|
|jondonuttest@sharklasers.com	|Cloggtwo!	|
Then  I should land in the account dashboard

Scenario: The dashboard is open
Confirm that the Dashboard contains - Welcome message, not you message, and links for Log out, recent orders, Shipping/billing addresses, edit password and account

And I should see onscreen text with the sentances  <text1> and <text2>
|text1											|text2																																					| 
|Hello Jon Test 1 (not Jon Test 1? Log out)		|From your account dashboard you can view your recent orders, manage your shipping and billing addresses, and edit your password and account details.	|
And I should see a hyperlink(s) <link> in the first sentance
|link	|
|Log out|
And I should see hyperlink(s) <link> in the second sentance
|link									|
|recent orders							|
|shipping and billing addresses			|
|edit your password and account details	|
And I should see these navigation links in the dashboard side menu
|link				| 
|Dashboard			|
|Orders				|
|Downloads			|
|Coupons			|
|Address Book		|
|Payment methods	|
|Account details	|
|Logout				|


Scenario: Open the Orders link
Orders page contains - A Button with Go shop text that makes up a message about orders 

Given I select the link "Orders"
Then I should see in the orders section <item>
|button	|text								| 
|Go shop|Go shop No order has been made yet.| 


Scenario: Open the Downloads link
Downloads contains - A Button with Go shop text that makes up a message about downloads

Given I select the link "Downloads"
Then I should see in the downloads section <item>
|button	|text								| 
|Go shop|Go shop No downloads available yet.|


Scenario: Open Coupons link 
Coupons contains - A message about coupons
Given I select the link "Coupons"
Then I should see in the coupons section <item>
|text																																											|
|List of coupons which are valid & available for use. Click on the coupon to use it. The coupon discount will be visible only when at least one product is present in the cart.	|



Scenario: Open Address Book link 
Address Book contains - Message about addresses, and buttons for Add Billing, Add Shipping Addresses
Given I select the link "Address Book"
Then I should see in the address book section <item>
|text																	|button1			|button2|
|The following addresses will be used on the checkout page by default.	|ADD BILLING ADDRESS|ADD SHIPPING ADDRESS|



Scenario: Open Payment Methods link
Payment Methods contains - Message about pay methods, and a button for Add Payment method
Given I select the link "Payment methods"
Then I should see in the payments page section <item>
|text					|button				|
|No saved methods found.|ADD PAYMENT METHOD	|


Scenario: Open Account Details link
Account Details contains - Name Fields, email field, password fields and a button for save changes
Given I select the link "Account details"
Then I should see fields with labels in the Account details section <item>
|label												|
|First name *										|
|Last name *										|
|Display name *										|
|Email address *									|
|Current password (leave blank to leave unchanged)	|
|New password (leave blank to leave unchanged)		|
|Confirm new password								|
And I should see some advisory text and a button in the Acount details section <item>
|text																				|button			|
|This will be how your name will be displayed in the account section and in reviews	|Save changes	|


Scenario: Log out
If I select Log out I should go back to the login page
When I select the link "Logout"
Then I should be in the login page

