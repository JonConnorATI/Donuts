package pageMethods;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import commonMethods.CommonMethods;

//This page is the first one the user lands in when they open the URL
public class HomePage extends CommonMethods {

	public static void acceptCookies() {
		WaitForElementToBePresent(By.id("cookiescript_accept"));

		if (isElementPresent(By.xpath("//div[@data-testid='POPUP']")))
			Click(By.xpath("//button[text()='NO THANKS']"));
		if (isElementPresent(By.id("cookiescript_accept")))
			Click(By.id("cookiescript_accept"));

	}

	public static void CheckUrl() {
		String URL = "https://offbeatdonuts.com/";
		String Actual = driver.getCurrentUrl();
		assertEquals(Actual, URL);
	}

	

}
