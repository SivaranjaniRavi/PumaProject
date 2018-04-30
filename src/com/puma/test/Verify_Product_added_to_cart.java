package com.puma.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.puma.page.CartPage;
import com.puma.page.LoginPage;
import com.puma.page.Menshoepage;
import com.puma.page.ShoeDescription;

import Generic.BaseTest;

public class Verify_Product_added_to_cart extends BaseTest


{
	/**
	 * author Kusum
	 */
	public static WebDriver driver;
@Test()
public static void verifyproduct() throws InterruptedException
{
	
	LoginPage l1=new LoginPage(driver);
	Menshoepage m1=new Menshoepage(driver);
	ShoeDescription s1=new ShoeDescription (driver);
	
	l1.verifyLoginPage(System.getProperty(p.getProperty(title));
	Thread.sleep(2000);
	l1.menclick();
	Thread.sleep(2000);
	l1.menrunning1();
	Thread.sleep(2000);
	/**
	 * Selecting the shoe
	 */
	m1.scrollDown1();
	m1.selectShoe();
	Thread.sleep(2000);
	s1.clickOnSelectSize();
	Thread.sleep(2000);
	s1.clickOnSize();
	Thread.sleep(2000);
	s1.clickOnCart();
	/**
	 * Adding to the cart and verifying the item displayed is same as selected
	 */
	CartPage c1=new CartPage(driver);
	c1.verifyWebElement(System.getProperty(p.getProperty(shoename));
	
}
}
