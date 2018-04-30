package com.puma.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.BasePage;

public class ShoeDescription extends BasePage
{
	
	/**
	 * author Kusum
	 */
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
	
	/**
	 * 
	 * @param title
	 */
	public void shoeDescriptionPageTitle(String title)
	{
		verifytitle(title);
	}
	/**
	 * selecting the Second item
	 */
	public void clickOnSelectSize()
	{
		selectSize.click();
	}
	/**
	 * Clicking on the shoe
	 */
	public void clickOnSize()
	{
		shoeSize.click();
	}
	/**
	 * selecting and adding to the cart
	 */
	public void clickOnCart()
	{
		cartBtn.click();
	}
	
	

}
