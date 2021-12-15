package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageObjects.LoginPage;

public class Steps {
	
	public WebDriver driver;
	public LoginPage lp;
	
	@Given("user launches chrome browser")
	public void user_launches_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		lp = new LoginPage(driver);
	
	}

	@When("user opens URL {string}")
	public void user_opens_url(String url) {
	    driver.get(url);
		
	}

	@And("user enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) {
	    lp.setUserName(email);
		lp.setPassword(password);
	}

	@And("clicks Login button")
	public void clicks_login_button() {
	    lp.clickLogin();
		
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String title) {
	    if(driver.getPageSource().contains("ERROR:")) {
	    	driver.close();
	    	Assert.assertTrue(false);
	    } else {
	    	Assert.assertEquals(title,driver.findElement(By.xpath("(//div[@class='woocommerce-MyAccount-content']/p)[1]")).getText());
	    }
		
	}
	
	@Then("Page header should be {string}")
	public void page_header_should_be(String header) {
		Assert.assertEquals(header,driver.findElement(By.xpath("//header[@class='entry-header']/h5")).getText());
	    
	}

	@When("user clicks on Log out link")
	public void user_clicks_on_log_out_link() {
		lp.clickLogout();
	    
		
	}

	@And("close browser")
	public void close_browser() {
	    driver.quit();
		
	}

}
