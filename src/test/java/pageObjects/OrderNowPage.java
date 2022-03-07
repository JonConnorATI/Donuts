package pageObjects;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import baseMethods.BaseMethods;

public class OrderNowPage extends BaseMethods {

	public static void selectOrderNow() {
		Click(By.xpath("//*[@id='navbarNavDropdown']//a[text()='order now']"));
		waitForPageLoaded(driver);

	}

	public static void getGlazedDozen() {
		WebElement Element = driver.findElement(By.xpath("//a[@data-tab='offbeat-dozen']"));
		Element.isEnabled();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Element);

		while (isElementPresent(By.xpath("//*[@class='swiper-button-next next_offbeat-dozen']")) == true) {
			Click(By.xpath("//*[@class='swiper-button-next next_offbeat-dozen']"));
		}

		Click(By.xpath("//h3[text() ='Classic Glazed Dozen']//following-sibling::div[@class='btn select']"));

	}

	public static void selectNextSteps(int i) {
		Click(By.xpath("(//div[@class='next_step'])[" + i + "]"));

	}

	public static void glazedDozenImage() {

		try {
			Assert.assertEquals(isElementPresent(By.xpath("//*[contains(@class, 'box_editor')]//img")), true);
			System.out.println("Assert passed - Image Is Present");
		} catch (Exception e) {
			System.out.println("Image is not present");
		}
	}

	public static void selectAddToCart() {
		String xpath = "(//*[contains(text(),'Add to Cart')])[1]";
		String css = ".extras_wrap";
		WebElement Element = driver.findElement(By.cssSelector(css));
		Element.isEnabled();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Element);
		WebElement button = driver.findElement(By.xpath(xpath));
		new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(button));
		button.click();
		waitForPageLoaded(driver);

	}

	public static ShoppingCartPage selectViewCart() {
		Click(By.xpath("//div[@class='modal-body']//a[@class='view_cart btn btn-primary']"));
		waitForPageLoaded(driver);

		return new ShoppingCartPage();
	}

	public static void WaitForPopUp() {
		String xpath = "//div[@class='modal-body']//a[@class='view_cart btn btn-primary']";
		WebElement Element = driver.findElement(By.xpath(xpath));
		// new WebDriverWait(driver,
		// 60).until(ExpectedConditions.elementToBeClickable(Element));
		new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(Element));

	}

	public static void checkTextIsPresent(String string) {
		checkForPresenceOfText(By.xpath("(//*[@class='container']/*[@class='text']/h3)[2]"), string);

	}

	public static void CheckButtonNumber(String string, String string2) {
		checkForPresenceOfText(
				By.xpath("//h3[text() ='" + string2 + "']//following-sibling::div[@class='qty']/span"), string);

	}

	public static void checkTextInBoxesSection0(String string) {
		checkForPresenceOfText(By.cssSelector("div[class='box_list'] label"), string);

	}

	public static void checkTextInBoxesSection1(String string) {
		checkForPresenceOfText(By.xpath("(//*[@class='plus_bullet swiper-pagination-bullet'])[1]"), string);

	}

	public static void checkTextInBoxesSection2(String string) {
		checkForPresenceOfText(By.xpath("(//*[@class='box_title'])[1]"), string);

	}

	public static void checkTextInBoxesSection3(String string) {
		checkForPresenceOfText(By.xpath("(//*[@class='box_status'])[1]"), string);

	}

	public static void checkTextInBoxesSection4(String string) {
		checkForPresenceOfText(By.xpath("(//*[@class='box_remove'])[1]"), string);

	}

	public static void checkTextInPopUp0(String string) {
		checkForPresenceOfText(By.xpath("(//*[@class='modal-body']/h3)[2]"), string);

	}

	public static void checkTextInPopUp1(String string) {
		checkForPresenceOfText(By.cssSelector(".view_cart.btn.btn-primary"), string);
	}

	public static void checkTextInPopUp2(String string) {
		checkForPresenceOfText(By.cssSelector(".start_new"), string);
	}

	public static void getOffbeatDozen() {
		WebElement Element = driver.findElement(By.xpath("//a[@data-tab='offbeat-dozen']"));
		Element.isEnabled();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Click(By.xpath("//h3[text() ='Offbeat Dozen']//following-sibling::div[@class='btn select']"));
		
		
	}

	public static void pickDonuts(Integer int1)  {
		int count = 0;
		int index = 1;
		
		Click(By.linkText("Clear Selection"));
		
		while (count < int1) {
			Click(By.xpath("(//*[@id='donuts']//*[@class='btn select'])[" + index + "]"));
			count = count + 1;
			index = index + 1;
			
		}
			
	}

	public static void addCandles() {
		WebElement Element = driver.findElement(By.cssSelector("div[data-section='three']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Element);
		
		WebElement candleCheckBox = driver.findElement(By.xpath("(//h4[text() ='Add Candles'])[1]"));
		new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(candleCheckBox));
		candleCheckBox.click();
		
		
	}

	public static void addMessage(String string) {
		Click(By.xpath("(//h4[text() ='Add Message To A Donut:'])[1]"));
		enterText(By.cssSelector("div[class='selected'] input[placeholder='3 words maximum']"), string);
		
	}

	public static void getBirthdayDoubleDozen() {
		WebElement Element = driver.findElement(By.xpath("//a[@data-tab='offbeat-dozen']"));
		Element.isEnabled();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Element);

		//while (isElementPresent(By.xpath("//h3[text() ='Birthday Double Dozen']//following-sibling::div[@class='btn select']")) == false) {
			Click(By.xpath("//*[@class='swiper-button-next next_offbeat-dozen']"));
		
		
		Click(By.xpath("//h3[text() ='Birthday Double Dozen']//following-sibling::div[@class='btn select']"));
		
	}

	public static void addCard() {
		Click(By.xpath("(//h4[text() ='Add A Card:'])[1]"));
		
	}

	public static void addOccasion() {
		Click(By.xpath("(//label[contains(text(),'Happy Birthday')])[1]"));
		
	}

	public static void addGreeting(String string) {
		enterText(By.xpath("(//div[@class='customise']//textarea)[1]"), string);
		
	}

	public static void addBow(String string) {
		Click(By.xpath("(//h4[text() ='Add A Bow:'])[1]"));
		Click(By.xpath("(//label[contains(text(),'Pink')])[1]"));
				
	}

	public static void addPhoto() {
		Click(By.xpath("(//h4[text() ='Add 30 Personalised Sugar Discs:'])[1]"));
		uploadFile(By.xpath("(//input[@type='file'])[1]"),"C:\\Users\\JonCo\\git\\Donuts\\Resources\\cucumber.jpg");
		
	}

	public static void autoFillBox() {
		Click(By.xpath("(//a[@class='box_autofill'])[1]"));
		
	}

	
	
	
	


	
	

}
