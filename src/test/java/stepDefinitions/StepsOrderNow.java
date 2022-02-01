package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
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

	@Then("I should see the button change to the number one")
	public void i_should_see_the_button_change_to_the_number_one() {
		OrderNowPage.CheckButtonNumber("1");
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
	
	
	@Then("I should see the <items> I have chosen")
	public void i_should_see_the_items_i_have_chosen(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		ShoppingCartPage.CheckTextField0(data.get(0).get("items"));
		ShoppingCartPage.CheckTextField1(data.get(1).get("items"));
		ShoppingCartPage.CheckTextField2(data.get(2).get("items"));
	}




}
