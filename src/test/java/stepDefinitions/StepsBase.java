package stepDefinitions;

import java.io.IOException;
import commonMethods.CommonMethods;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import pageMethods.HomePage;

public class StepsBase extends CommonMethods {
	
	@Before()
	public void setup() throws IOException {

		setDriver();
	}
	
	@Given("I open the website")
	public void i_open_the_website() {
		navigateToHomePage();
		waitForPageLoaded(driver);
		HomePage.acceptCookies();
	}
	

	@After()
	public void tearDown() {

		closeDriver();
	}

}
