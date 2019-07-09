package stepDefinitions;

import com.qa.pages.WeatherInfo;
import com.qa.util.TestBase;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class WeatherInfoSteps extends TestBase{
	
	WeatherInfo weatherinfo;
	
	@After
	public void tearDown() {
		TestBase.closeDriver();
	}
			
	@Given("^User should be on Home page$")
	public void user_should_be_on_Home_page() throws Throwable {
		TestBase.intialization();
		
	}

	@When("^Weather Info page displayed$")
	public void weather_Info_page_displayed() throws Throwable {
		weatherinfo = new WeatherInfo();
		String homepagetitle = weatherinfo.verifyHomePageTitle();
		Assert.assertEquals("?urrent weather and forecast - OpenWeatherMap", homepagetitle);
	}
	@Then("^Enter the Valid City Name \"([^\"]*)\" In Search filed$")
	public void enter_the_Valid_City_Name_In_Search_filed(String value) throws Throwable {
		weatherinfo = new WeatherInfo();
		weatherinfo.serchText(value);

	}

	@Then("^Click on Search Button$")
	public void click_on_Search_Button() throws Throwable {
		weatherinfo = new WeatherInfo();
		weatherinfo.clickOnSearch();
	}

	
	@Then("^Verify the City Name \"([^\"]*)\"$")
	public void verify_the_City_Name(String value) throws Throwable {
		weatherinfo = new WeatherInfo();
		boolean cityFlag = weatherinfo.verifyCityName(value);
		Assert.assertTrue(cityFlag);
	}

	@Then("^Verify Weather detail display$")
	public void verify_Weather_detail_display() throws Throwable {
		weatherinfo = new WeatherInfo();
		boolean weatherDetails = weatherinfo.verifyWeatherDetails();
		Assert.assertTrue(weatherDetails);
	}

	@Then("^Enter the Invalid City Name \"([^\"]*)\" In Search filed$")
	public void enter_the_Invalid_City_Name_In_Search_filed(String value) throws Throwable {
		weatherinfo = new WeatherInfo();
		weatherinfo.serchText(value);
	}

	@Then("^Verify the search result \"([^\"]*)\"$")
	public void verify_the_search_result(String value) throws Throwable {
		weatherinfo = new WeatherInfo();
		boolean reslt = weatherinfo.verifyCityNotFound();
		Assert.assertTrue(reslt);
	}
	
	
}
