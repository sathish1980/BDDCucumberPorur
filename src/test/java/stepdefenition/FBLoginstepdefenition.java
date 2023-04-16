package stepdefenition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BrowserDriver.Browser;
import io.cucumber.java.en.*;
import junit.framework.Assert;

public class FBLoginstepdefenition extends Browser {
	
@Given("launch the Browser and Enter the URL")
public void launch_the_browser_and_enter_the_url() {
    launch("chrome");
    driver.get("https://www.facebook.com/");
}

@Given("Enter the Username")
public void enter_the_username() 
{
	WebElement username =driver.findElement(By.id("email"));
	username.sendKeys("Kumar.sathish189@gmail.com");
}

@Given("Enter the password")
public void enter_the_password() 
{
	WebElement username =driver.findElement(By.id("pass"));
	username.sendKeys("test");   
}

@When("I Click on login button")
public void i_click_on_login_button() 
{
	WebElement loginbutton =driver.findElement(By.name("login"));
	loginbutton.click(); 
}

@When("Wait for some time")
public void wait_for_some_time() {
	final String profileElement="//*[text()='Sathish Ramakrishnan']";
	By profilename=By.xpath(profileElement);
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(profilename));

}

@Then("Login should be sucessfull")
public void login_should_be_sucessfull() {
	final String profileElement="//*[text()='Sathish Ramakrishnan']";
	By profilename=By.xpath(profileElement);
	String ProfileNameActual =driver.findElement(profilename).getText();
	System.out.println(ProfileNameActual);
	Assert.assertEquals("Sathish Ramakrishnan", ProfileNameActual);
}

@And("close the browser")
public void close_the_browser() {
	driver.quit();
}

}
