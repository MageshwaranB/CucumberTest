package stepdefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.Assert;
public class LoginStepDef {
	WebDriver driver;

	@Given("User is on login page")

	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
	}

//	@When("User enters username")
//	public void user_enters_username() {
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//	}
//
//	@When("User enters password")
//	public void user_enters_password() {
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//	}
	@When("^: User enters (.+) and (.+)$")
	public void _user_enters_and(String username, String password) {
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("User Clicks on Login Button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.id("login-button")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		

	@Then("User successfully logged into Homepage")
	public void user_successfully_logged_into_homepage() {
		String actText=driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).getText();
		String expText="Sauce Labs Backpack";
		Assert.assertEquals(actText,expText);
		driver.close();
	}
	
}

