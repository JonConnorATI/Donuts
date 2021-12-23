Feature: Sign Up with no data

Confirm the warning messages for each field

Validation rules: FirstName, LastName, Email, Phone, Password, Check T&C's. At least 1 char
for name and 2 char for phone, email must be format test@test.ie and password min is 1


Scenario: No data entered 
Given I open the website and go to sign up   
When I press the Agree and Continue button
Then a warning should be displayed for the Firstname Field
And the LastName Field
And the Email Field
And the Phone Field
And the Password Field
And the T&C field

 

 
  