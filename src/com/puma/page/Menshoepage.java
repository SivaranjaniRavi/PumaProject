package com.puma.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.BasePage;
import Generic.Utility;

public class Menshoepage extends BasePage

{
@FindBy(xpath="//img[@id='product-collection-image-71792']")
private WebElement shoes;


public Menshoepage(WebDriver driver)
{
	super(driver);
	
	PageFactory.initElements(driver,this);
}

public void menshoepagetitle(String title)
{
	verifytitle(title);
}
public void scrollDown1()
{
	Utility.scroll();
}

public void selectShoe()
{
	shoes.click();
}




}


