package pageObjects;

import org.openqa.selenium.By;
import baseMethods.BaseMethods;


//This page is the first one the user lands in when they open the URL
public class HomePage extends BaseMethods {

	public static LoginPage selectLoginLink() {
		Click(By.linkText("Login"));
		return new LoginPage();
		
	}

	public static void acceptCookies() {
		WaitForElementToBePresent(By.id("cookiescript_accept"));
		Click(By.id("cookiescript_accept"));

	}

	
}
