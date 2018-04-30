package com.puma.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.BasePage;

public class ShoeDescription extends BasePage
{
	@FindBy (xpath="//div[@class='add-to-cart']")
	private WebElement cartBtn;
	

	
	@FindBy(xpath="//div[@class='product-size-click-btn']")
	private WebElement selectSize;
	
	@FindBy(xpath="//span[@id='180~73']")
	private WebElement shoeSize;

	public ShoeDescription(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void shoeDescriptionPageTitle(String title)
	{
		verifytitle(title);
	}
	
	public void clickOnSelectSize()
	{
		selectSize.click();
	}
	public void clickOnSize()
	{
		shoeSize.click();
	}
	
	public void clickOnCart()
	{
		cartBtn.click();
	}
	
	

}
