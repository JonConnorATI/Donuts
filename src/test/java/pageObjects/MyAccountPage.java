package pageObjects;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import baseMethods.BaseMethods;

//import cucumber.api.DataTable;

public class MyAccountPage extends BaseMethods {

	public static void currentPassword(String string) {
		clearText(By.xpath("//input[@name='password_current']"));
		enterText(By.xpath("//input[@name='password_current']"),string);
		
	}
	
	public static void newPassword(String string) {
		enterText(By.xpath("//input[@name='password_1']"),string);
		
	}
	
	public static void confirmPassword(String string) {
		enterText(By.xpath("//input[@name='password_2']"),string);
		
	}
	
	public static void saveChanges() {
		Click(By.xpath("//button[@name='save_account_details']"));
	}

	public static void newDisplayName(String string) {
		clearText(By.xpath("//input[@name='account_display_name']"));
		enterText(By.xpath("//input[@name='account_display_name']"),string);
		
	}

	public static void deleteTextBox() {
		clearText(By.xpath("//input[@name='account_display_name']"));
		
	}

	public static void checkSentance1(String text) {
		WebElement Actual = driver.findElement(By.cssSelector(".woocommerce-MyAccount-content>p:first-of-type"));
		assertEquals(Actual.getText(), (text));
		
	}
	
	public static void checkSentance2(String text) {
		WebElement Actual = driver.findElement(By.cssSelector(".woocommerce-MyAccount-content>p:nth-of-type(2)"));
		assertEquals(Actual.getText(), (text));
		
	}

	public static void checkLinkText(int i, String text) {
		WebElement Actual = driver.findElement(By.xpath("(//*[@class='woocommerce-MyAccount-content']//a)[" + i + "]"));
		assertEquals(Actual.getText(), (text));
	}

	public static void checkNavLinkText(int i, String text) {
		WebElement Actual = driver.findElement(By.cssSelector(".list-group>a:nth-of-type(" + i + ")"));
		assertEquals(Actual.getText(), (text));
		
	}

	public static void clickNavLink(String string) {
		Click(By.linkText(string));
		
	}

	public static void OrdersCheckText(String string) {
		WebElement Actual = driver.findElement(By.cssSelector(".woocommerce-message.woocommerce-message--info"));
		assertEquals(Actual.getText(), (string));
		
	}

	public static void OrdersCheckButton(String string) {
		WebElement Actual = driver.findElement(By.cssSelector("a.btn.btn-outline-primary"));
		assertEquals(Actual.getText(), (string));
		
	}

	public static void DownloadsCheckButton(String string) {
		WebElement Actual = driver.findElement(By.cssSelector("a.btn.btn-outline-primary"));
		assertEquals(Actual.getText(), (string));
		
	}

	public static void DownloadsCheckText(String string) {
		WebElement Actual = driver.findElement(By.cssSelector(".woocommerce-Message.woocommerce-Message--info.woocommerce-info"));
		assertEquals(Actual.getText(), (string));
	}

	public static void CopuonsCheckText(String string) {
		WebElement Actual = driver.findElement(By.cssSelector("#woo_mstore_accordion>div>p"));
		assertEquals(Actual.getText(), (string));
		
	}

	public static void AddressSectionCheckText(String string) {
		WebElement Actual = driver.findElement(By.cssSelector(".woocommerce-MyAccount-content>p"));
		assertEquals(Actual.getText(), (string));
		
	}

	public static void AddressSectionCheckButton(int i, String string) {
		WebElement Actual = driver.findElement(By.xpath("(//div[@class='cus_menu']//button)[" + i + "]"));
		assertEquals(Actual.getText(), (string));
		
	}

	public static void PaymentsSectionCheckText(String string) {
		WebElement Actual = driver.findElement(By.cssSelector("p.woocommerce-Message.woocommerce-Message--info.woocommerce-info"));
		assertEquals(Actual.getText(), (string));
	}

	public static void PaymentsSectionCheckButton(int i, String string) {
		// TODO Auto-generated method stub
		WebElement Actual = driver.findElement(By.cssSelector("a.button:nth-of-type(" + i + ")"));
		assertEquals(Actual.getText(), (string));
	}

	public static void AccountSectionCheckLabel(int i, String string) {
		WebElement Actual = driver.findElement(By.xpath("(//*[@class='woocommerce-EditAccountForm edit-account']//label)[" + i + "]"));
		assertEquals(Actual.getText(), (string));
		
	}

	public static void AccountSectionCheckText(String string) {
		WebElement Actual = driver.findElement(By.xpath("//*[@class='woocommerce-EditAccountForm edit-account']//em"));
		assertEquals(Actual.getText(), (string));
		
		
	}

	public static void AccountSectionCheckButton(int i, String string) {
		// .btn.btn-outline-primary:nth-of-type(1)
		WebElement Actual = driver.findElement(By.cssSelector(".btn.btn-outline-primary:nth-of-type(" + i + ")"));
		assertEquals(Actual.getText(), (string));
	}

	public static void AccountChangesSavedCheckText(String string) {
		WaitForElementToBePresent(By.cssSelector(".woocommerce-message"));
		WebElement Actual = driver.findElement(By.cssSelector(".woocommerce-message"));
		assertEquals(Actual.getText(), (string));
	}
	
	
}
