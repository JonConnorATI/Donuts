package stepDefinitions;

import io.cucumber.java.en.*;
import pageMethods.OrderNowPage;
import pageMethods.ShoppingCartPage;

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

	@Given("I select Auto-Fill this Box")
	public void i_select_auto_fill_this_box() {
		OrderNowPage.autoFillBox();
	}

	@When("I select the donuts {string} from the Offbeat Dozen variety")
	public void i_select_the_donuts_from_the_offbeat_dozen_variety(String string) throws InterruptedException {
		OrderNowPage.pickFromOffBeatDozen(string);
	}

}
