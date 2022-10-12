package stepDefinitions;

import io.cucumber.java.en.*;
import pageObjects.OrderNowPage;
import pageObjects.ShoppingCartPage;
import java.util.List;
import java.util.Map;
import io.cucumber.datatable.*;

public class StepsOrderNow {

	@When("I select the Order Now link") 
	public void i_select_the_order_now_link() {
		OrderNowPage.selectOrderNow();

	}

	@Then("I should be in the order now page and see <text>")
	public void i_should_be_in_the_order_now_page_and_see_text(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		OrderNowPage.checkTextIsPresent(data.get(0).get("text"));
	}

	/*
	 * @When("I select Class Glazed Dozen") public void
	 * i_select_class_glazed_dozen() { OrderNowPage.getGlazedDozen(); }
	 */ 

	@Then("I should see the {string} button change to the number one")
	public void i_should_see_the_button_change_to_the_number_one(String string) {
		OrderNowPage.CheckButtonNumber("1", string);
	}

	@When("I select Next steps")
	public void i_select_next_steps() {
		OrderNowPage.selectNextSteps(1);
	}

	@Then("I should see these <items> in the Boxes summary")
	public void i_should_see_these_items_in_the_boxes_summary(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		OrderNowPage.checkTextInBoxesSection0(data.get(0).get("items"));
		OrderNowPage.checkTextInBoxesSection1(data.get(1).get("items"));
		OrderNowPage.checkTextInBoxesSection2(data.get(2).get("items"));
		OrderNowPage.checkTextInBoxesSection3(data.get(3).get("items"));
		OrderNowPage.checkTextInBoxesSection4(data.get(4).get("items"));

	}

	@When("I select Add to cart")
	public void i_select_add_to_cart() throws InterruptedException {
		OrderNowPage.selectAddToCart();
	}

	@Then("I should see a pop up with these <items>")
	public void i_should_see_a_pop_up_with_these_items(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		OrderNowPage.WaitForPopUp();
		OrderNowPage.checkTextInPopUp0(data.get(0).get("items"));
		OrderNowPage.checkTextInPopUp1(data.get(1).get("items"));
		OrderNowPage.checkTextInPopUp2(data.get(2).get("items"));

	}

	@When("I select View Cart")
	public void i_select_view_cart() {
		OrderNowPage.selectViewCart();
	}

	@Then("for this economy scenario I should see the <items> I have chosen")
	public void for_this_economy_scenario_i_should_see_the_items_i_have_chosen(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		ShoppingCartPage.CheckEconomyCartTextField0(data.get(0).get("items"));
		ShoppingCartPage.CheckEconomyCartTextField1(data.get(1).get("items"));
		ShoppingCartPage.CheckEconomyCartTextField2(data.get(2).get("items"));
	}

	/*
	 * @When("I select Offbeat Dozen") public void i_select_offbeat_dozen() {
	 * OrderNowPage.getOffbeatDozen(); }
	 */
	
	
	@Given("I select {int} different donuts")
	public void i_select_different_donuts(Integer int1) throws InterruptedException {
		OrderNowPage.pickDonuts(int1);
	}

	@And("add candles")
	public void add_candles() {
		OrderNowPage.addCandles();
	}

	@Given("a message {string}")
	public void a_message(String string) {
		OrderNowPage.addMessage(string);
	}

	@Then("for this hungry scenario I should see the <items> I have chosen")
	public void for_this_hungry_scenario_i_should_see_the_items_i_have_chosen(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		ShoppingCartPage.CheckHungryCartTextField0(data.get(0).get("items"));
		ShoppingCartPage.CheckHungryCartTextField1(data.get(1).get("items"));
		ShoppingCartPage.CheckHungryCartTextField2(data.get(2).get("items"));
		ShoppingCartPage.CheckHungryCartTextField3(data.get(3).get("items"));
		ShoppingCartPage.CheckHungryCartTextField4(data.get(4).get("items"));
		ShoppingCartPage.CheckHungryCartTextField5(data.get(5).get("items"));
		ShoppingCartPage.CheckHungryCartTextField6(data.get(6).get("items"));
		ShoppingCartPage.CheckHungryCartTextField7(data.get(7).get("items"));

	}
	
	/*
	 * @When("I select Birthday Double Dozen") public void
	 * i_select_birthday_double_dozen() { OrderNowPage.getBirthdayDoubleDozen(); }
	 */
	
	@Given("add a card")
	public void add_a_card() {
	    OrderNowPage.addCard();
	}
	
	@Given("add an occasion")
	public void add_an_occasion() {
		OrderNowPage.addOccasion();
	}
	
	
	@Given("add a greeting {string}")
	public void add_a_greeting(String string) {
	    OrderNowPage.addGreeting(string);
	}


	@Given("add a {string} bow")
	public void add_a_bow(String string) {
	   OrderNowPage.addBow(string);
	}
	
	@Given("add personalised photo")
	public void add_personalised_photo() {
	    OrderNowPage.addPhoto();
	}
	
	@Then("for this luxury scenario I should see the <items> I have chosen")
	public void for_this_luxury_scenario_i_should_see_the_items_i_have_chosen(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		ShoppingCartPage.CheckLuxuryCartTextField0(data.get(0).get("items"));
		ShoppingCartPage.CheckLuxuryCartTextField1(data.get(1).get("items"));
		ShoppingCartPage.CheckLuxuryCartTextField2(data.get(2).get("items"));
		ShoppingCartPage.CheckLuxuryCartTextField3(data.get(3).get("items"));
		ShoppingCartPage.CheckLuxuryCartTextField4(data.get(4).get("items"));
		ShoppingCartPage.CheckLuxuryCartTextField5(data.get(5).get("items"));
		ShoppingCartPage.CheckLuxuryCartTextField6(data.get(6).get("items"));
		ShoppingCartPage.CheckLuxuryCartTextField7(data.get(7).get("items"));
		ShoppingCartPage.CheckLuxuryCartTextField8(data.get(8).get("items"));
		ShoppingCartPage.CheckLuxuryCartTextField9(data.get(9).get("items"));
		ShoppingCartPage.CheckLuxuryCartTextField10(data.get(10).get("items"));
		ShoppingCartPage.CheckLuxuryCartTextField11(data.get(11).get("items"));
		ShoppingCartPage.CheckLuxuryCartTextField12(data.get(12).get("items"));
		ShoppingCartPage.CheckLuxuryCartTextField13(data.get(13).get("items"));
		ShoppingCartPage.CheckLuxuryCartTextField14(data.get(14).get("items"));
		ShoppingCartPage.CheckLuxuryCartTextField15(data.get(15).get("items"));
		ShoppingCartPage.CheckLuxuryCartTextField16(data.get(16).get("items"));
		ShoppingCartPage.CheckLuxuryCartTextField17(data.get(17).get("items"));
		
		
		
		
	}
	
	@Given("I select Auto-Fill this Box")
	public void i_select_auto_fill_this_box() {
	    OrderNowPage.autoFillBox();
	}

	
	@When("I select the donuts {string} from the Offbeat Dozen variety")
	public void i_select_the_donuts_from_the_offbeat_dozen_variety(String string) throws InterruptedException {
	    OrderNowPage.pickFromOffBeatDozen(string);
	}









}
