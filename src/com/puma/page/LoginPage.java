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
	
	
@FindBy(xpath="(//a[@href='https://in.puma.com/men.html'])[1]")
private static  WebElement men;



		@FindBy(xpath="(//a[contains(@href,'https://in.puma.com/men/sports/running')])[1]")
		private static  WebElement menrunning;

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
	men.click();
//Actions act=new Actions(driver);
	
	//act.moveToElement(men).perform();
	//Utility.action(men);
}
public void menrunning1()
{
	menrunning.click();
}

}
