package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class WeatherInfo extends TestBase {
	
	@FindBy(xpath = "//a[@class='nav__link bg-hover-color'][contains(text(),'Weather')]")	
	WebElement weatherLnk;
	
	@FindBy(xpath = "//div[@class='form-group search-cities__block']//input[@id='q']")	
	WebElement searchCity;
	
	@FindBy(xpath = "//form[@id='searchform']//button[@type='submit']")	
	WebElement searchBtn;
	
	@FindBy(xpath = "//td//p[1]")	
	WebElement weatherInfo;
	
	@FindAll({@FindBy(tagName = "a")})
	public List<WebElement> cityLinks;
	
	@FindBy(xpath = "//div[@class='alert alert-warning'][contains(text(),'Not found')]")
	WebElement CityNotFound;

	
	//Initializing the page object
	public WeatherInfo()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickOnSearch() 
	{
		searchBtn.click();
	}
	
	public void serchText(String cityName)
	{
		searchCity.sendKeys(cityName);
	}
	
	public String verifyHomePageTitle()
	{
		return driver.getTitle();
	}
		
	public boolean verifyWeatherDetails()
	{
		return weatherInfo.isDisplayed();
	}
	
	public boolean verifyCityName(String cityName)
	{
		 boolean cityFlag = false;
		//for(WebElement element : cityLinks)
		for(int i=0; i<cityLinks.size(); i++)
		{
			String strValue = cityLinks.get(i).getAttribute("href");
			String strValue1 = cityLinks.get(i).getAttribute("a");
			
			System.out.println(strValue);
			System.out.println(strValue1);
			
			if(strValue.contains(cityName))
			{
				cityFlag = true;
				break;
			}
		}
		
		return cityFlag;
		
	}

	public boolean verifyCityNotFound()
	{
		return CityNotFound.isDisplayed();
	}
	
}
