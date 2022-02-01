package pageObjects;

import org.openqa.selenium.By;

import baseMethods.BaseMethods;

public class ShoppingCartPage extends BaseMethods {

	public static void CheckTextField0(String string) {
		checkForPresenceOfText(By.cssSelector(".entry-title"), string);
		
	}
	
	public static void CheckTextField1(String string) {
		checkForPresenceOfText(By.cssSelector("td.product-name > a:nth-child(1)"), string);
		
	}
	
	public static void CheckTextField2(String string) {
		checkForPresenceOfText(By.cssSelector("span.product-remove:nth-child(3) > a.remove"), string);
		
	}

}
