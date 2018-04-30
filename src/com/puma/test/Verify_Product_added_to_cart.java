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
	public static WebDriver driver;
@Test()
public static void verifyproduct() throws InterruptedException
{
	
	LoginPage l1=new LoginPage(driver);
	
	//l1.verifyLoginPage("abcd");
	Thread.sleep(10000);
	l1.menclick();
	Thread.sleep(2000);
	l1.menrunning1();
	Thread.sleep(2000);
	
	
	Menshoepage m1=new Menshoepage(driver);
	
	m1.scrollDown1();
	m1.selectShoe();
	
	ShoeDescription s1=new ShoeDescription (driver);
	
	Thread.sleep(2000);
	s1.clickOnSelectSize();
	Thread.sleep(2000);
	s1.clickOnSize();
	Thread.sleep(2000);
	s1.clickOnCart();
	
	CartPage c1=new CartPage(driver);
	c1.verifyWebElement("IGNITE EvoKNIT Lo 2 Men's Running Shoes");
	
}
}
