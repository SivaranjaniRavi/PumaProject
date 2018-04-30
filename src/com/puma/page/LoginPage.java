package com.puma.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.BasePage;
import Generic.Utility;

public class LoginPage extends BasePage

{
/**
 * author Kusum	
 */
	
@FindBy(xpath="(//a[@href='https://in.puma.com/men.html']")
private static  WebElement men;



		@FindBy(xpath="(//a[contains(@href,'https://in.puma.com/men/sports/running')])[1]")
		private static  WebElement menrunning;
/**
 * 
 * initialising the Elements
 */
public LoginPage(WebDriver driver)
{
	
	super(driver);
	PageFactory.initElements(driver, this);
}

public void verifyLoginPage(String title)
{
	verifytitle(title);
}



public void menclick()
{
	

	Utility.action(men);
}
public void menrunning1()
{
	menrunning.click();
}

}
