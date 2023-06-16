package stepdefenition;



import BrowserDriver.Browser;
import CommonElementsUtils.CommonLogics;
import Pages.SearchPage;
import Pages.SerachResultFlightSelectionPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class FlightSearchPage extends Browser {
	
	@Given("Launch the Browser and enter the MakeMyTrip URL")
	public void Launch_the_Browser_and_enter_the_MakeMyTrip_URL() throws InterruptedException 
	{
	    launch("chrome");
	    driver.get("https://www.makemytrip.com/");

		Thread.sleep(5000);
		CommonLogics c = new CommonLogics();
		c.ClickIfElementExist(driver,"//*[@class='close']");
		c.ClickOnAddClose(driver);
		
	}
	
	/*@And("I Select the From Location")
	public void I_Select__the_From_Location() 
	{
		SearchPage s = new SearchPage(driver);
		s.SelectFromValue("MAA");
	}*/
	
	@And("I Select the From Location {string}")
	public void I_Select__the_From_Location(String fromLocation ) 
	{
		SearchPage s = new SearchPage(driver);
		s.SelectFromValue(fromLocation);
	}
	
	@And("I Select the From Locations ([^\"]*)$")
	public void I_Select__the_From_Locations(String fromLocation ) 
	{
		SearchPage s = new SearchPage(driver);
		s.SelectFromValue(fromLocation);
	}
	
	/*@And("I Select the To Location")
	public void I_Select_the_To_Location() 
	{
		SearchPage s = new SearchPage(driver);
		s.SelectToValue("PNQ");
	}*/
	
	@And("I Select the To Location {string}")
	public void I_Select_the_To_Location(String toLocation) 
	{
		SearchPage s = new SearchPage(driver);
		s.SelectToValue(toLocation);
	}
	
	@And("I Select the To Locations ([^\"]*)$")
	public void I_Select_the_To_Locations(String toLocation) 
	{
		SearchPage s = new SearchPage(driver);
		s.SelectToValue(toLocation);
	}
	
	
	@And("I Select the Fly Date")
	public void I_Select_the_Fly_Date() 
	{
		SearchPage s = new SearchPage(driver);
		s.SelectFlyFromDate("25");
	}
	
	@And("I Click On Search button")
	public void I_Click_On_Search_button() 
	{
		SearchPage s = new SearchPage(driver);
		s.ClickonSearchButton();
	}
	
	@Then("I should see the Flight search Result page")
	public void I_should_see_the_Flight_search_Result_page() 
	{
		SerachResultFlightSelectionPage s = new SerachResultFlightSelectionPage(driver);
		s.ClickOnPopupOkGotIt();
		s.GetTextOfFlightFrom();
	}
	
	@Then("I should see the Error message")
	public void I_should_see_the_Error_message() 
	{
		SearchPage s = new SearchPage(driver);
		s.GetSameCityError();
	}

}
