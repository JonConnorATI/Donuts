package baseMethods;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

//import cucumber.api.java.After;
//import cucumber.api.java.Before;

public class BaseMethods {

	public static WebDriver driver;

	public static void setDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JonCo\\git\\Donuts\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	public static void navigateToHomePage() {
		driver.manage().window().maximize();
		// driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		String homePage = "https://offbeatdonuts.com/";
		driver.get(homePage);

	}

	public static void closeDriver() {
		driver.manage().deleteAllCookies();
		driver.close();
		driver.quit();

	}

	//Click an element
	public static void Click(By locator) {
		// new WebDriverWait(driver,
		// 5).until(ExpectedConditions.elementToBeClickable(locator)).click();
		new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(locator))
				.click();
	}
	
	

	//Wait for an element to be present
	public static void WaitForElementToBePresent(By locator) {
		new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	//clear a text field and enter text into a field
	public static void enterText(By locator, String text) {
		WaitForElementToBePresent(locator);
		WebElement element = driver.findElement((locator)); 
		element.clear();
		element.sendKeys(text);

	}

	//Check if an element is present
	public static boolean isElementPresent(By locator) {
		if (driver.findElements(locator).size() != 0) {
			return true;
		} else {
			return false;
		}

	}

	//Check if an element is enabled
	public static boolean isElemententEnabled(By locator) {
		if (driver.findElement(locator).isEnabled()) {
			return true;
		} else {
			return false;
		}

	}

	//Check if an element is present
	public static boolean isElementNotPresent(By locator) {
		if (driver.findElements(locator).size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	//hover over an element
	public static void hoverOverElement(By locator) {
		WebElement element = driver.findElement((locator));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}

	//Clear the text field
	public static void clearText(By locator) {
		driver.findElement(locator).clear();
	}

	// Wait for a page to load
	public static void waitForPageLoaded(WebDriver driver) {

		ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
			}
		};

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		try {
			wait.until(expectation);
		} catch (Throwable error) {
			Assert.assertFalse(true, "Timeout waiting for Page Load Request to complete.");
		}
	}
	
	//method to find an element and confirm the text in the element is same as expected text
	public static void checkForPresenceOfText(By locator, String string) {
		WaitForElementToBePresent(locator);
		WebElement element = driver.findElement((locator));
		String Actual = element.getText();
		System.out.println("Expected is: " + string + " - Actual is: " + Actual);
		Assert.assertEquals(string, Actual);
		
	}

}
