Feature: I can see the products, pick my varieties, add extras and put them in my cart  

Buy a glazed dozen (only 1 variety available), with no extras and put in my cart (Economy).
Buy an offbeat dozen, pick 12 different varieties, add candles, add a message, and put in my cart (Hungry).
Buy a Happy Birthday dozen, auto fill the varieties, write a greeting, pick a pink bow, add a message, add a photo
and put in my cart (Luxury)

Background: 
Given I open the website 
When I select the Order Now link 
Then I should be in the order now page and see <text>
|text														|
|ORDER DONUTS IN JUST 4 STEPS-	|


Scenario: Economy, add to my cart and check whats been added

When I select the donuts "Classic Glazed Dozen" from the Offbeat Dozen variety
Then I should see the "Classic Glazed Dozen" button change to the number one
When I select Next Steps in Section 1
Then I should see these <items> in the Boxes summary 
|items								|
|Boxes:								|
|+										|
|Classic Glazed Dozen	|
|Box status: 12 / 12	|
|Remove box						|
When I select Next Steps in Section 2
When I select Next Steps in Section 3
When I select Add to cart
Then I should see a pop up with these <items>
|items											|
|Your box was added to cart	|
|VIEW CART									|
|Start another box					|
When I select View Cart
Then for this economy scenario I should see the <items> I have chosen
|items									|
|my cart (1 items)			|
|Classic Glazed Dozen		|
|Remove|


Scenario: Hungry, add to my cart and check whats been added

When I select the donuts "Offbeat Dozen" from the Offbeat Dozen variety 
Then I should see the "Offbeat Dozen" button change to the number one
When I select Next Steps in Section 1
Then I should see these <items> in the Boxes summary 
|items								|
|Boxes:								|
|+										|
|Offbeat Dozen				|
|Box status: 0 / 12		|
|Remove box						|
When I select 12 different donuts
#And I select Next Steps in Section 2
And add candles 
And a message "just for you"
When I select Add to cart
Then I should see a pop up with these <items>
|items											|
|Your box was added to cart	|
|VIEW CART									|
|Start another box					|
When I select View Cart
Then for this hungry scenario I should see the <items> I have chosen
|items							|
|my cart (3 items)	|
|Offbeat Dozen			|
|Remove							|
|Candles						|
|Remove							|
|Piped name					|
|"just for you"			|
|Remove							|


Scenario: Luxury, add to my cart and check whats been added

When I select the donuts "Birthday Double Dozen" from the Offbeat Dozen variety 
Then I should see the "Birthday Double Dozen" button change to the number one
When I select Next Steps in Section 1
Then I should see these <items> in the Boxes summary 
|items								|
|Boxes:								|
|+										|
|Birthday Double Dozen|
|Box status: 1 / 12		|
|Remove box						|
Given I select Auto-Fill this Box
And add luxury candles
#And add a card
And add a greeting "All the best on your special day"
#And add an occasion
And add a "Pink" bow
And a luxury message "just for you"
#And add personalised photo
When I select Add to cart
Then I should see a pop up with these <items>
|items											|
|Your box was added to cart	|
|VIEW CART									|
|Start another box					|
When I select View Cart
Then for this luxury scenario I should see the <items> I have chosen
|items																													|
|my cart (6 items)																							|
|Birthday Double Dozen																					|
|Remove																													|
|Candles																												|
|Remove																													|
|Card (included)																								|
|Card Type: "Happy Birthday"																		|
|Card Text: "All the best on your special day"									|			
|Bow (included)																									|			
|"Pink"																													|
|Piped name																										  |
|"just for you"																									|
|Occasional discs (included)																		|
#|cucumber.jpg																									|
#|Remove																												|


