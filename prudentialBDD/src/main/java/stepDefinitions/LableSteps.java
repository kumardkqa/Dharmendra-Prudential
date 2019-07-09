package stepDefinitions;

import org.junit.Assert;
import com.qa.pages.HomePageLable;
import com.qa.util.TestBase;
import cucumber.api.java.en.Then;


public class LableSteps extends TestBase {
	
	HomePageLable homePageLable = new HomePageLable();
	
	@Then("^Verify Lable Weather display$")
	public void verify_Lable_Weather_display() throws Throwable {
		Assert.assertTrue(homePageLable.verifyLables(homePageLable.Weather));
	}

	@Then("^Verify Lable Map display$")
	public void verify_Lable_Map_display() throws Throwable {
		Assert.assertTrue(homePageLable.verifyLables(homePageLable.Map));

	}

	@Then("^Verify Lable Guid display$")
	public void verify_Lable_Guid_display() throws Throwable {
		Assert.assertTrue(homePageLable.verifyLables(homePageLable.Guid));

	}

	@Then("^Verify Lable API display$")
	public void verify_Lable_API_display() throws Throwable {
		Assert.assertTrue(homePageLable.verifyLables(homePageLable.API));

	}

	@Then("^Verify Lable Price display$")
	public void verify_Lable_Price_display() throws Throwable {
		Assert.assertTrue(homePageLable.verifyLables(homePageLable.Price));

	}

	@Then("^Verify Lable Partners display$")
	public void verify_Lable_Partners_display() throws Throwable {
		Assert.assertTrue(homePageLable.verifyLables(homePageLable.Partners));

	}

	@Then("^Verify Lable Station display$")
	public void verify_Lable_Station_display() throws Throwable {
		Assert.assertTrue(homePageLable.verifyLables(homePageLable.Stations));
	}

	@Then("^Verify Lable Widgets display$")
	public void verify_Lable_Widgets_display() throws Throwable {
		Assert.assertTrue(homePageLable.verifyLables(homePageLable.Widgets));
	}

	@Then("^Verify Lable Blog display$")
	public void verify_Lable_Blog_display() throws Throwable {
		Assert.assertTrue(homePageLable.verifyLables(homePageLable.Blog));
	}

	@Then("^Verify Lable OpenWeather Logo display$")
	public void verify_Lable_OpenWeather_Logo_display() throws Throwable {
		Assert.assertTrue(homePageLable.verifyLables(homePageLable.OpenWeatherLogo));
	}

	@Then("^Verify Lable Sign In display$")
	public void verify_Lable_Sign_In_display() throws Throwable {
		Assert.assertTrue(homePageLable.verifyLables(homePageLable.SignIn));
	}

	@Then("^Verify Lable Sign Up display$")
	public void verify_Lable_Sign_Up_display() throws Throwable {
		Assert.assertTrue(homePageLable.verifyLables(homePageLable.SignUp));
	}

	@Then("^Verify Lable Support Center display$")
	public void verify_Lable_Support_Center_display() throws Throwable {
		Assert.assertTrue(homePageLable.verifyLables(homePageLable.SupportCenter));
	}

	@Then("^Verify Lable Celcius Slide button display$")
	public void verify_Lable_Celcius_Slide_button_display() throws Throwable {
		Assert.assertTrue(homePageLable.verifyLables(homePageLable.CelciusSlideBtn));
	}

	@Then("^Verify Lable Fahrenheit Slide button display$")
	public void verify_Lable_Fahrenheit_Slide_button_display() throws Throwable {
		Assert.assertTrue(homePageLable.verifyLables(homePageLable.FahrenheitSlideBtn));
	}

}
