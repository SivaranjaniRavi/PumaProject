package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class BasePage 

{
	public static  WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
public void verifytitle(String exptitle)
{
	String acttitle= driver.getTitle();
	Assert.assertEquals(acttitle, exptitle);
	
	
	
}




}
