package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class HomePageLable extends TestBase{
	

	@FindBy(xpath = "//a[@class='nav__link bg-hover-color'][contains(text(),'Weather')]")
	public WebElement Weather;
	
	@FindBy(xpath = "//a[contains(text(),'Maps')]")	
	public WebElement Map;
	
	@FindBy(xpath = "//a[contains(text(),'Guide')]")	
	public WebElement Guid;
	
	@FindBy(xpath = "//a[@class='nav__link bg-hover-color'][contains(text(),'API')]")	
	public WebElement API;
	
	@FindBy(xpath = "//a[@class='nav__link bg-hover-color'][contains(text(),'Price')]")	
	public WebElement Price;
	
	@FindBy(xpath = "//a[contains(text(),'Partners')]")	
	public WebElement Partners;
	
	@FindBy(xpath = "//a[contains(text(),'Stations')]")	
	public WebElement Stations;
	
	@FindBy(xpath = "//a[contains(text(),'Widgets')]")	
	public WebElement Widgets;
	
	@FindBy(xpath = "//a[contains(text(),'Blog')]")	
	public WebElement Blog;
	
	@FindBy(xpath = "//a[@class='navbar-brand']//img[@class='img-responsive']")	
	public WebElement OpenWeatherLogo;	
	
	@FindBy(xpath = "//div[contains(@class,'hidden-xs')]//a[contains(text(),'Sign In')]")
	public WebElement SignIn;
	
	@FindBy(xpath = "//a[contains(text(),'Sign Up')]")
	public WebElement SignUp;
	
	@FindBy(xpath = "//span[contains(text(),'Support Center')]")
	public WebElement SupportCenter;
	
	@FindBy(xpath = "//span[contains(text(),'°C')]")
	public WebElement CelciusSlideBtn;
	
	@FindBy(xpath = "//span[contains(text(),'°F')]")
	public WebElement FahrenheitSlideBtn;
	
	//Initializing the page object
	public HomePageLable()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public String verifyHomePageTitle()
	{
		return driver.getTitle();
	}
	
	
	public boolean verifyLables(WebElement element)
	{
		return element.isDisplayed();
	}

}
