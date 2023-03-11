package pageMethods;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import commonMethods.CommonMethods;

public class OrderNowPage extends CommonMethods {

	// Selects the order now button
	public static void selectOrderNow() {
		Click(By.xpath("//*[@id='navbarNavDropdown']//a[text()='order now']"));
		waitForPageLoaded(driver);

	}

	// Clicks the next steps button
	public static void selectNextSteps(int i) {
		WaitForElementToBePresent(By.xpath("(//div[@class='next_step'])[" + i + "]"));
		Click(By.xpath("(//div[@class='next_step'])[" + i + "]"));

	}

	// Checks an image has loaded
	public static void glazedDozenImage() {

		try {
			Assert.assertEquals(isElementPresent(By.xpath("//*[contains(@class, 'box_editor')]//img")), true);
			System.out.println("Assert passed - Image Is Present");
		} catch (Exception e) {
			System.out.println("Image is not present");
		}
	}

	// Clicks the Add to cart button
	public static void selectAddToCart() throws InterruptedException {
		String xpath = "(//*[contains(text(),'Add to Cart')])[1]";
		String css = ".extras_wrap";
		WebElement Element = driver.findElement(By.cssSelector(css));
		Element.isEnabled();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Element);
		WebElement button = driver.findElement(By.xpath(xpath));
		new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(button));
		Thread.sleep(3000);
		button.click();
		waitForPageLoaded(driver);

	}

	// Clicks the View cart button
	public static ShoppingCartPage selectViewCart() {
		Click(By.xpath("//div[@class='modal-body']//a[@class='view_cart btn btn-primary']"));
		waitForPageLoaded(driver);

		return new ShoppingCartPage();
	}

	// Waits for the pop up
	public static void WaitForPopUp() {
		String xpath = "//div[@class='modal-body']//a[@class='view_cart btn btn-primary']";
		WebElement Element = driver.findElement(By.xpath(xpath));
		new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(Element));

	}

	// Checks a string of text is present
	public static void checkTextIsPresent(String string) {
		checkForPresenceOfText(By.xpath("(//*[@class='container']/*[@class='text']/h3)[2]"), string);

	}

	// Checks the button number
	public static void CheckButtonNumber(String string, String string2) {
		checkForPresenceOfText(By.xpath("//h3[text() ='" + string2 + "']//following-sibling::div[@class='qty']/span"),
				string);

	}

	// Checks the text in the box section
	public static void checkTextInBoxesSection0(String string) {
		checkForPresenceOfText(By.cssSelector("div[class='box_list'] label"), string);

	}

	// Checks the text in the box section
	public static void checkTextInBoxesSection1(String string) {
		checkForPresenceOfText(By.xpath("(//*[@class='plus_bullet swiper-pagination-bullet'])[1]"), string);

	}

	// Checks the text in the box section
	public static void checkTextInBoxesSection2(String string) {
		checkForPresenceOfText(By.xpath("(//*[@class='box_title'])[1]"), string);

	}

	// Checks the text in the box section
	public static void checkTextInBoxesSection3(String string) {
		checkForPresenceOfText(By.xpath("(//*[@class='box_status'])[1]"), string);

	}

	// Checks the text in the box section
	public static void checkTextInBoxesSection4(String string) {
		checkForPresenceOfText(By.xpath("(//*[@class='box_remove'])[1]"), string);

	}

	// Checks the text in the pop up section
	public static void checkTextInPopUp0(String string) {
		checkForPresenceOfText(By.xpath("(//*[@class='modal-body']/h3)[2]"), string);

	}

	// Checks the text in the pop up section
	public static void checkTextInPopUp1(String string) {
		checkForPresenceOfText(By.cssSelector(".view_cart.btn.btn-primary"), string);
	}

	// Checks the text in the pop up section
	public static void checkTextInPopUp2(String string) {
		checkForPresenceOfText(By.cssSelector(".start_new"), string);
	}

	// Picks the donuts from the list available
	public static void pickDonuts(Integer int1) throws InterruptedException {
		int count = 0;
		int index = 1;

		Thread.sleep(3000);
		Click(By.linkText("Clear Selection"));

		while (count < int1) {
			Click(By.xpath("(//*[@id='donuts']//*[@class='btn select'])[" + index + "]"));
			count = count + 1;
			index = index + 1;

		}

	}

	// Adds candles
	public static void addCandles() {
		WebElement Element = driver.findElement(By.cssSelector("div[data-section='three']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Element);

		WebElement candleCheckBox = driver.findElement(By.xpath("(//h4[text() ='Add Candles'])[1]"));
		new WebDriverWait(driver, Duration.ofSeconds(60))
				.until(ExpectedConditions.elementToBeClickable(candleCheckBox));
		candleCheckBox.click();

	}

	// adds message to a donut
	public static void addMessage(String string) {
		String xpath = "(//h4[text() ='Add Message To A Donut:'])[1]";

		WebElement Element = driver.findElement(By.xpath("(//h2[@class='title'])[3]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Element);

		WebElement addMsgCheckBox = driver.findElement(By.xpath(xpath));
		new WebDriverWait(driver, Duration.ofSeconds(60))
				.until(ExpectedConditions.elementToBeClickable(addMsgCheckBox));
		addMsgCheckBox.click();

		enterText(By.cssSelector("div[class='selected'] input[placeholder='3 words maximum']"), string);

	}

	// adds a greeting card
	public static void addCard() {
		Click(By.xpath("(//h4[text() ='Add A Card:'])[1]"));

	}

	// picks the type of greeting card
	public static void addOccasion() {
		Click(By.xpath("(//label[contains(text(),'Happy Birthday')])[1]"));

	}

	// adds a message to the card
	public static void addGreeting(String string) {
		enterText(By.xpath("(//div[@class='customise']//textarea)[1]"), string);

	}

	// adds a bow
	public static void addBow(String string) {
		Click(By.xpath("(//h4[text() ='Add A Bow:'])[1]"));
		Click(By.xpath("(//label[contains(text(),'" + string + "')])[1]"));

	}

	// adds a photo
	public static void addPhoto() {
		Click(By.xpath("(//h4[text() ='Add 30 Personalised Sugar Discs:'])[1]"));
		uploadFile(By.xpath("(//input[@type='file'])[1]"), "C:\\Users\\JonCo\\git\\Donuts\\Resources\\cucumber.jpg");

	}

	// clicks the autofill button
	public static void autoFillBox() {
		Click(By.xpath("(//a[@class='box_autofill'])[1]"));

	}

	// Method to pick any donuts from the offbeat dozen range
	public static void pickFromOffBeatDozen(String string) throws InterruptedException {
		scrollMenuIntoView();
		clickArrowUntilDonutIsInView(string);
		Click(By.xpath("//h3[text() ='" + string + "']//following-sibling::div[@class='btn select']"));

	}

	// Scrolls down the page so the donuts can be picked
	private static void scrollMenuIntoView() {
		WebElement Element = driver.findElement(By.xpath("//a[@data-tab='offbeat-dozen']"));
		Element.isEnabled();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Element);
	}

	// Clicks the arrow until the donuts I want are visible on screen
	private static void clickArrowUntilDonutIsInView(String string) throws InterruptedException {
		String xpath = "//h3[text() ='" + string + "']//following-sibling::div[@class='btn select']";
		while (!isElementDisplayed(By.xpath(xpath))) {
			System.out.println("Button isn't visible");
			Click(By.xpath("//*[@class='swiper-button-next next_offbeat-dozen']"));
			Thread.sleep(1000);
		}
		System.out.println("Button IS visible");
	}

}
