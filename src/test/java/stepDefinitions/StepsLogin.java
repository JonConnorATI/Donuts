package stepDefinitions;

import commonMethods.CommonMethods;
import io.cucumber.java.en.*;
import pageObjects.HomePage;
import pageObjects.LoginPage;




public class StepsLogin extends CommonMethods {
	
	
	
	@Given("I open the website")
	public void i_open_the_website()  {
		navigateToHomePage();
		waitForPageLoaded(driver);
		HomePage.acceptCookies();
	}
	
	@Given("I open the website and go to sign in")
	public void i_open_the_website_and_go_to_sign_in() {
		navigateToHomePage();
		waitForPageLoaded(driver);
		HomePage.acceptCookies();
		HomePage.selectLoginLink();
	}
	
	@When("^The ([^\"]*) is entered into the username field$")
	public void the_is_entered_into_the_username_field(String username) {
		
		LoginPage.enterUsername(username);
	}
	
	@When("^([^\"]*) is entered into the password field$")
	public void is_entered_into_the_password_field(String password) throws Throwable {

		LoginPage.enterPassword(password);
	}
	
	@When("I press Login")
	public void i_press_login() {
		
		LoginPage.pressLoginButton();
	}
	
	@Then("^There should be ([^\"]*) message displayed$")
	public void there_should_be_message_displayed(String errorMessage) throws Throwable {
		if (errorMessage == "An Error") {

			LoginPage.checkLoginErrorMessage();

		} else {
			System.out.println("In the else section");
			LoginPage.checkTitle("My account - Offbeat Donuts");

		}

	}
	
	

}

	



	
	
	

