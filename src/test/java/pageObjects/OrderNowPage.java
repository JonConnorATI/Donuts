package pageObjects;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import baseMethods.BaseMethods;

public class OrderNowPage extends BaseMethods{

	public static void selectOrderNow() {
		Click(By.xpath("//*[@id='navbarNavDropdown']//a[text()='order now']"));
		
	}
	
	public static void CheckText(By locator,String string ) {
		
		
	}

	

	public static void getGlazedDozen() {
		WebElement Element = driver.findElement(By.xpath("//a[@data-tab='offbeat-dozen']"));
		Element.isEnabled();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Element);
		
		
		while (isElementPresent(By.xpath("//*[@class='swiper-button-next next_offbeat-dozen']"))==true) {
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
			}
			catch(Exception e) {
			 System.out.println("Image is not present");
			}
	}

	public static void selectAddToCart() {
		String xpath = "(//*[contains(text(),'Add to Cart')])[1]";
		WebElement Element = driver.findElement(By.xpath(xpath));
		Element.isEnabled();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Click(By.xpath(xpath));
		
	}

	public static void selectViewCart() {
		Click(By.xpath("//div[@class='modal-body']//a[@class='view_cart btn btn-primary']"));		
	}

	public static void WaitForPopUp() {
		String xpath = "//div[@class='modal-body']//a[@class='view_cart btn btn-primary']";
		WebElement Element = driver.findElement(By.xpath(xpath));
		//new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(Element));
		new WebDriverWait(driver, Duration.ofSeconds(60)).until(ExpectedConditions.elementToBeClickable(Element));
		
	}
	
}
