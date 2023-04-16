package stepdefenition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BrowserDriver.Browser;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class FBLoginwithhardcode extends Browser {
	@Given("Enter the Username {string}")
	public void enter_the_username(String uname) {
		WebElement username =driver.findElement(By.id("email"));
		username.sendKeys(uname);
	}

	@Given("Enter the password as {string}")
	public void enter_the_password_as(String pwd) {
		WebElement username =driver.findElement(By.id("pass"));
		username.sendKeys(pwd);  
	}
	
	@When("click Back button")
	public void click_Back_button() {
		driver.navigate().back();
	}
	
	@Given("Enter the Username as ([^\"]*)$")
	public void enter_the_username_as_somevalue(String uname) {
		WebElement username =driver.findElement(By.id("email"));
		username.sendKeys(uname);
	}

	@Given("Enter the password value ([^\"]*)$")
	public void enter_the_password_value_somevalue(String pwd) {
		WebElement username =driver.findElement(By.id("pass"));
		username.sendKeys(pwd);  
	}
}
