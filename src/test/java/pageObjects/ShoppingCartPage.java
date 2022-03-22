package pageObjects;

import org.openqa.selenium.By;
import commonMethods.CommonMethods;

public class ShoppingCartPage extends CommonMethods {

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

	public static void CheckLuxuryCartTextField0(String string) {
		checkForPresenceOfText(By.cssSelector(".entry-title"), string);
		
	}

	public static void CheckLuxuryCartTextField1(String string) {
		checkForPresenceOfText(By.cssSelector("td.product-name > a:nth-child(1)"), string);
		
	}

	public static void CheckLuxuryCartTextField2(String string) {
		checkForPresenceOfText(By.xpath("(//span[@class='product-remove'])[1]"), string);
		
	}

	public static void CheckLuxuryCartTextField3(String string) {
		checkForPresenceOfText(By.xpath("(//td[@class='product-name']/a)[2]"), string);
		
	}

	public static void CheckLuxuryCartTextField4(String string) {
		checkForPresenceOfText(By.xpath("(//span[@class='product-remove'])[2]"), string);
		
	}

	public static void CheckLuxuryCartTextField5(String string) {
		checkForPresenceOfText(By.xpath("(//td[@class='product-name']/a)[3]"), string);
		
	}

	public static void CheckLuxuryCartTextField6(String string) {
		checkForPresenceOfSomeText(By.xpath("//p[contains(text(),'Card Type:')]"), string);
		
	}

	public static void CheckLuxuryCartTextField7(String string) {
		checkForPresenceOfSomeText(By.xpath("//p[contains(text(),'Card Type:')]"), string);
		
	}

	public static void CheckLuxuryCartTextField8(String string) {
		checkForPresenceOfText(By.xpath("(//span[@class='product-remove'])[3]"), string);
		
	}

	public static void CheckLuxuryCartTextField9(String string) {
		checkForPresenceOfText(By.xpath("(//td[@class='product-name']/a)[4]"), string);
		
	}

	public static void CheckLuxuryCartTextField10(String string) {
		checkForPresenceOfText(By.xpath("(//dd[@class='variation-Selection']/p)[3]"), string);
		
	}

	public static void CheckLuxuryCartTextField11(String string) {
		checkForPresenceOfText(By.xpath("(//span[@class='product-remove'])[4]"), string);
		
	}

	public static void CheckLuxuryCartTextField12(String string) {
		checkForPresenceOfText(By.xpath("(//td[@class='product-name']/a)[5]"), string);
		
	}
	
	public static void CheckLuxuryCartTextField13(String string) {
		checkForPresenceOfText(By.xpath("(//dd[@class='variation-Selection']/p)[4]"), string);
		
	}
	
	public static void CheckLuxuryCartTextField14(String string) {
		checkForPresenceOfText(By.xpath("(//span[@class='product-remove'])[5]"), string);
		
	}
	
	public static void CheckLuxuryCartTextField15(String string) {
		checkForPresenceOfText(By.xpath("(//td[@class='product-name']/a)[6]"), string);
		
	}
	
	public static void CheckLuxuryCartTextField16(String string) {
		checkForPresenceOfSomeText(By.xpath("(//dd[@class='variation-Selection']/p)[5]"), string);
		
	}
	
	public static void CheckLuxuryCartTextField17(String string) {
		checkForPresenceOfText(By.xpath("(//span[@class='product-remove'])[6]"), string);
		
	}
	
	
	
	
	
}
