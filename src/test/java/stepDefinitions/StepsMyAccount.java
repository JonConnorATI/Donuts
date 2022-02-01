package stepDefinitions;

import java.util.List;
import java.util.Map;
import baseMethods.BaseMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;

public class StepsMyAccount extends BaseMethods {    
	
	
	@Given("I login with valid account details")
	public void i_login_with_valid_account_details(DataTable usercredentials) throws InterruptedException {
		
		navigateToHomePage();
		HomePage.acceptCookies();
		HomePage.selectLoginLink();
		
		List<Map<String,String>> data = usercredentials.asMaps(String.class,String.class);
		LoginPage.enterUsername(data.get(0).get("username"));
		LoginPage.enterPassword(data.get(0).get("password"));
		LoginPage.pressLoginButton();
		
		
	}
	
	/*Steps for the Dashboard section*/
	
	@Then("I should land in the account dashboard")
	public void i_should_land_in_the_account_dashboard() {
		LoginPage.checkTitle("My account - Offbeat Donuts");
	}
	
	@Then("I should see onscreen text with the sentances  <text1> and <text2>")
	public void i_should_see_onscreen_text_with_the_sentances_text1_and_text2(DataTable dataTable) {
		
		List<Map<String,String>> data = dataTable.asMaps(String.class,String.class);
		MyAccountPage.checkSentance1(data.get(0).get("text1"));
		MyAccountPage.checkSentance2(data.get(0).get("text2"));
		
	}
	
	@Then("I should see a hyperlink\\(s) <link> in the first sentance")
	public void i_should_see_a_hyperlink_s_link_in_the_first_sentance(DataTable dataTable) {
		List<Map<String,String>> data = dataTable.asMaps(String.class,String.class);
		MyAccountPage.checkLinkText(1,data.get(0).get("link"));
		
	}
	
	@Then("I should see hyperlink\\(s) <link> in the second sentance")
	public void i_should_see_hyperlink_s_link_in_the_second_sentance(DataTable dataTable) {
		List<Map<String,String>> data = dataTable.asMaps(String.class,String.class);
		MyAccountPage.checkLinkText(2,data.get(0).get("link"));
		MyAccountPage.checkLinkText(3,data.get(1).get("link"));
		MyAccountPage.checkLinkText(4,data.get(2).get("link"));
		
	}
	
	@Then("I should see these navigation links in the dashboard side menu")
	public void i_should_see_these_navigation_links_in_the_dashboard_side_menu(DataTable dataTable) {
		List<Map<String,String>> data = dataTable.asMaps(String.class,String.class);
		MyAccountPage.checkNavLinkText(1,data.get(0).get("link"));
		MyAccountPage.checkNavLinkText(2,data.get(1).get("link"));
		MyAccountPage.checkNavLinkText(3,data.get(2).get("link"));
		MyAccountPage.checkNavLinkText(4,data.get(3).get("link"));
		MyAccountPage.checkNavLinkText(5,data.get(4).get("link"));
		MyAccountPage.checkNavLinkText(6,data.get(5).get("link"));
		MyAccountPage.checkNavLinkText(7,data.get(6).get("link"));
		MyAccountPage.checkNavLinkText(8,data.get(7).get("link"));
	}
	
	//Selecting any link in the side menu
	@Given("I select the link {string}")
	public void i_select_the_link(String string) {
	    MyAccountPage.clickNavLink(string);
	}
	
	/* Steps for the orders section */
	
	@Then("I should see in the orders section <item>")
	public void i_should_see_in_the_orders_section_item(DataTable dataTable) {
		List<Map<String,String>> data = dataTable.asMaps(String.class,String.class);
		MyAccountPage.OrdersCheckButton(data.get(0).get("button"));
		MyAccountPage.OrdersCheckText(data.get(0).get("text"));
	}
	
	/* Steps for the downloads section */
	
	@Then("I should see in the downloads section <item>")
	public void i_should_see_in_the_downloads_section_item(DataTable dataTable) {
		List<Map<String,String>> data = dataTable.asMaps(String.class,String.class);
		MyAccountPage.DownloadsCheckButton(data.get(0).get("button"));
		MyAccountPage.DownloadsCheckText(data.get(0).get("text"));
	}
	
	/* Steps for the coupons section */
	
	@Then("I should see in the coupons section <item>")
	public void i_should_see_in_the_coupons_section_item(DataTable dataTable) {
		List<Map<String,String>> data = dataTable.asMaps(String.class,String.class);
		MyAccountPage.CopuonsCheckText(data.get(0).get("text"));
	}
	
	/* Steps for the address section */
	
	@Then("I should see in the address book section <item>")
	public void i_should_see_in_the_address_book_section_item(DataTable dataTable) {
		List<Map<String,String>> data = dataTable.asMaps(String.class,String.class);
		MyAccountPage.AddressSectionCheckText(data.get(0).get("text"));
		MyAccountPage.AddressSectionCheckButton(1,data.get(0).get("button1"));
		MyAccountPage.AddressSectionCheckButton(2,data.get(0).get("button2"));
	}

	/* Steps for the payments section */
	
	@Then("I should see in the payments page section <item>")
	public void i_should_see_in_the_payments_page_section_item(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String,String>> data = dataTable.asMaps(String.class,String.class);
		MyAccountPage.PaymentsSectionCheckText(data.get(0).get("text"));
		MyAccountPage.PaymentsSectionCheckButton(1,data.get(0).get("button"));
	}

	/* Steps for the account section */
	
	@Then("I should see fields with labels in the Account details section <item>")
	public void i_should_see_fields_with_labels_in_the_account_details_section_item(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String,String>> data = dataTable.asMaps(String.class,String.class);
		MyAccountPage.AccountSectionCheckLabel(1,data.get(0).get("label"));
		MyAccountPage.AccountSectionCheckLabel(2,data.get(1).get("label"));
		MyAccountPage.AccountSectionCheckLabel(3,data.get(2).get("label"));
		MyAccountPage.AccountSectionCheckLabel(4,data.get(3).get("label"));
		MyAccountPage.AccountSectionCheckLabel(5,data.get(4).get("label"));
		MyAccountPage.AccountSectionCheckLabel(6,data.get(5).get("label"));
		MyAccountPage.AccountSectionCheckLabel(7,data.get(6).get("label"));
	}
	@Then("I should see some advisory text and a button in the Acount details section <item>")
	public void i_should_see_some_advisory_text_and_a_button_in_the_acount_details_section_item(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String,String>> data = dataTable.asMaps(String.class,String.class);
		MyAccountPage.AccountSectionCheckText(data.get(0).get("text"));
		MyAccountPage.AccountSectionCheckButton(1,data.get(0).get("button"));
	}

	@Then("I should be in the login page")
	public void i_should_be_in_the_login_page() {
	    LoginPage.CheckUrl();
	}


	/* steps for MyAccountChangePwd.feature - User changes password, confirms changes, Logs in with new credentials,
	 * then changes the credentials back again
	 */

	@Then("I enter my current password {string}")
	public void i_enter_my_current_password(String string) {
	   MyAccountPage.currentPassword(string);
	}
	
	@Then("I enter my new password {string}")
	public void i_enter_my_new_password(String string) {
	   MyAccountPage.newPassword(string);
	}
	@Then("I confirm my new password {string}")
	public void i_confirm_my_new_password(String string) {
	    MyAccountPage.confirmPassword(string);
	}
	@When("I click the save changes button")
	public void i_click_the_save_changes_button() {
	    MyAccountPage.saveChanges();
	}
	@Then("I should see the message <item>")
	public void i_should_see_the_message_item(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String,String>> data = dataTable.asMaps(String.class,String.class);
		MyAccountPage.AccountChangesSavedCheckText(data.get(0).get("message"));
	}

	
	@Given("I enter my new display name {string}")
	public void i_enter_my_new_display_name(String string) {
	   MyAccountPage.newDisplayName(string);
	}











	




}
