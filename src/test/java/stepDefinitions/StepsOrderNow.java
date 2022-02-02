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

	@When("I select Class Glazed Dozen")
	public void i_select_class_glazed_dozen() {
		OrderNowPage.getGlazedDozen();
	}

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
	public void i_select_add_to_cart() {
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

	@When("I select Offbeat Dozen")
	public void i_select_offbeat_dozen() {
		OrderNowPage.getOffbeatDozen();
	}

	@Given("I select {int} different donuts")
	public void i_select_different_donuts(Integer int1) {
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

}
