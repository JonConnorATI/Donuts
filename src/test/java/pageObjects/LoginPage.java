package pageObjects;

import org.openqa.selenium.By;
import baseMethods.BaseMethods;
import static org.junit.Assert.*;

public class LoginPage extends BaseMethods{

	public static void enterUsername(String username) {
		enterText(By.id("username"), username);
		
	}

	public static void enterPassword(String password) {
		enterText(By.id("password"), password);
		
	}
	
	public static void pressLoginButton() {
		Click(By.xpath("//button[@name='login']"));
		
	}

	public static void checkLoginErrorMessage() {
		assertEquals(driver.findElement(By.cssSelector(".woocommerce-error>li>a")).getText(), ("Lost Your Password?"));
		
	}

	public static MyAccountPage checkTitle (String title) {
		assertEquals(driver.getTitle(), (title));
		
		return new MyAccountPage();
		
		}

	/*
	 * public static void checkLoginErrorMessage(String message) {
	 * System.out.println("We are in the lostpassword section");
	 * assertEquals(driver.findElement(By.linkText("Lost Your Password?")).getText()
	 * , (message));
	 * 
	 * 
	 * }
	 * 
	 * public static void checkTitle(String message) {
	 * System.out.println("We are in the check title");
	 * //System.out.println("The text is: " +
	 * driver.findElement(By.linkText("Lost Your Password?")).getText());
	 * assertEquals(driver.getTitle(), (message)); }
	 */

	

	
	

	

	
	
}
