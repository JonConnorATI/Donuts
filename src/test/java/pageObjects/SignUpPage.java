package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import baseMethods.BaseMethods;

public class SignUpPage extends BaseMethods{
	


	public static void SelectLogin () {
		Click(By.xpath("//a[contains(text(),'Login')]"));
	}
	
	public static void SelectAgree () {
		String xpath = "(//button[@type='submit'][normalize-space()='Agree & Continue'])[1]";
		WebElement Element = driver.findElement(By.xpath(xpath));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Element);
		Click(By.xpath(xpath));
	}

	
	
	
	

}
