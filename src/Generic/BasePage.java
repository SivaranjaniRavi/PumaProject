package Generic;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class BasePage 

{
	
	/**
	 * author Kusum	
	 */
	public static  WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	/**
	 * verifying the title of the element
	 */
public void verifytitle(String exptitle)
{
	String acttitle= driver.getTitle();
	Assert.assertEquals(acttitle, exptitle);
	
	
	
}


  
    




}
}
