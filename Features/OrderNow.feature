Feature: I can see the products, pick my varieties, add extras and put them in my cart  

Buy a glazed dozen (only 1 variety available), with no extras and put in my cart
Buy an offbeat dozen, pick 12 different varieties, add candles, add a message, and put in my cart
Buy a Happy Birthday dozen, auto fill the varieties, write a greeting, pick a pink bow, add a message and put in my cart

Background: 
Given I open the website 
When I select the Order Now link 
Then I should be in the order now page and see <text>
|text							|
|ORDER DONUTS in just 4 steps:	|


Scenario: Economy, order a glazed dozen with no extras, add to my cart and check whats been added

When I select Class Glazed Dozen
Then I should see the "Classic Glazed Dozen" button change to the number one
When I select Next steps
Then I should see these <items> in the Boxes summary 
|items					|
|Boxes:					|
|+						|
|Classic Glazed Dozen	|
|Box status: 12 / 12	|
|Remove box				|
When I select Add to cart
Then I should see a pop up with these <items>
|items						|
|Your box was added to cart	|
|VIEW CART					|
|Start another box			|
When I select View Cart
Then for this economy scenario I should see the <items> I have chosen
|items						|
|my cart (1 items)			|
|Classic Glazed Dozen		|
|Remove|


Scenario: Hungry, order an offBeat dozen with no extras, 12 different varieties, add candles, add a message, add to my cart and check whats been added

When I select Offbeat Dozen
Then I should see the "Offbeat Dozen" button change to the number one
When I select Next steps
Then I should see these <items> in the Boxes summary 
|items					|
|Boxes:					|
|+						|
|Offbeat Dozen			|
|Box status: 0 / 12		|
|Remove box				|
Given I select 12 different donuts
And add candles
And a message "just for you"
When I select Add to cart
Then I should see a pop up with these <items>
|items						|
|Your box was added to cart	|
|VIEW CART					|
|Start another box			|
When I select View Cart
Then for this hungry scenario I should see the <items> I have chosen
|items						|
|my cart (3 items)			|
|Offbeat Dozen				|
|Remove						|
|Candles					|
|Remove						|
|Piped name					|
|"just for you"	|
|Remove						|


