package com.puma.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import Generic.BasePage;

public class CartPage extends BasePage
{
	
	
	/**
	 * author Kusum	
	 */
	
	@FindBy(xpath="//td[@class='product-cart-info']//a[contains(@href,'https://in.puma.com/catalog/product/view/id/71793/s/ignite_evoknit_lo_2_men_s_running_shoes')]")
    private WebElement productName;
	
	
	public CartPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver,this);
	}

	/**
	 * Verifying the Element in the cart is same as selected	
	 */
	
	public void verifyWebElement(String element)
	{
	try
	{
		Assert.assertEquals(productName.getText(), element);
		Reporter.log("Added product is matching",true);
	}
	catch(Exception e)
	{
		Reporter.log("Added product is not matching",true);
	}
			
		
	}
}
