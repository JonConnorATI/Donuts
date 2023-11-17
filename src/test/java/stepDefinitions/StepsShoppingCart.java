package stepDefinitions;

import io.cucumber.java.en.*;
import pageMethods.ShoppingCartPage;
import java.util.List;
import java.util.Map;
import io.cucumber.datatable.*;

public class StepsShoppingCart {

	

	@Then("for this economy scenario I should see the <items> I have chosen")
	public void for_this_economy_scenario_i_should_see_the_items_i_have_chosen(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		ShoppingCartPage.CheckEconomyCartTextField0(data.get(0).get("items"));
		ShoppingCartPage.CheckEconomyCartTextField1(data.get(1).get("items"));
		ShoppingCartPage.CheckEconomyCartTextField2(data.get(2).get("items"));
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
		//ShoppingCartPage.CheckLuxuryCartTextField13(data.get(13).get("items"));
		//ShoppingCartPage.CheckLuxuryCartTextField14(data.get(14).get("items"));
		//ShoppingCartPage.CheckLuxuryCartTextField15(data.get(15).get("items"));
		//ShoppingCartPage.CheckLuxuryCartTextField16(data.get(16).get("items"));
		//ShoppingCartPage.CheckLuxuryCartTextField17(data.get(17).get("items"));
		
	}
	
	

	
}
