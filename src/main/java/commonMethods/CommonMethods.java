package commonMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import baseMethods.BaseMethods;

public class CommonMethods extends BaseMethods {
	
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
		
		//Checks an element is dispalyed
			public static boolean isElementDisplayed(By locator) {
				if (driver.findElement(locator).isDisplayed()) {
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
		
		//method to find an element and confirm some of the text in the element is what was expected
		public static void checkForPresenceOfSomeText(By locator, String string) {
			WaitForElementToBePresent(locator);
			WebElement element = driver.findElement((locator));
			String Actual = element.getText();
			
			//now check that the full text found contains the partial text that was expected
			boolean isFound = Actual.contains(string);
			System.out.println("Expected is: " + string + " is a substring of " + Actual + " - Actual is: " + isFound);
			Assert.assertEquals(isFound, true);
		}
		
		//Method to upload a file
		public static void uploadFile(By locator, String filePath) {
			/*
			 * WebElement uploadElement = driver.findElement(locator);
			 * uploadElement.click();
			 * 
			 * // enter the file path onto the file-selection input field
			 * uploadElement.sendKeys(filePath);
			 */
	        
	        WebElement element = driver.findElement(locator);
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        // Setting value for "style" attribute to make textbox visible
	        js.executeScript("arguments[0].style.display='block';", element);
	        driver.findElement(locator).sendKeys(filePath);
		}

}
