package pageObjects;

import org.openqa.selenium.By;

import baseMethods.BaseMethods;

public class ShoppingCartPage extends BaseMethods {

	public static void CheckEconomyCartTextField0(String string) {
		checkForPresenceOfText(By.cssSelector(".entry-title"), string);
		
	}
	
	public static void CheckEconomyCartTextField1(String string) {
		checkForPresenceOfText(By.cssSelector("td.product-name > a:nth-child(1)"), string);
		
	}
	
	public static void CheckEconomyCartTextField2(String string) {
		checkForPresenceOfText(By.cssSelector("span.product-remove:nth-child(3) > a.remove"), string);
		
	}

	public static void CheckHungryCartTextField0(String string) {
		checkForPresenceOfText(By.cssSelector(".entry-title"), string);
		
	}

	public static void CheckHungryCartTextField1(String string) {
		checkForPresenceOfText(By.cssSelector("td.product-name > a:nth-child(1)"), string);
		
	}
	
	public static void CheckHungryCartTextField2(String string) {
		checkForPresenceOfText(By.xpath("(//span[@class='product-remove'])[1]"), string);
	}
	
	public static void CheckHungryCartTextField3(String string) {
		checkForPresenceOfText(By.xpath("(//td[@class='product-name']/a)[2]"), string);
	}
	
	public static void CheckHungryCartTextField4(String string) {
		checkForPresenceOfText(By.xpath("(//span[@class='product-remove'])[2]"), string);
		
	}
	
	public static void CheckHungryCartTextField5(String string) {
		checkForPresenceOfText(By.xpath("(//td[@class='product-name']/a)[3]"), string);
		
	}
	
	public static void CheckHungryCartTextField6(String string) {
		checkForPresenceOfText(By.xpath("(//dd[@class='variation-Selection']/p)[2]"), string);
	}
	
	public static void CheckHungryCartTextField7(String string) {
		checkForPresenceOfText(By.xpath("(//span[@class='product-remove'])[3]"), string);
		
	}
	
	
}
