package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements Constant


{
	public static WebDriver driver;
@BeforeMethod
public static void openapplication()
{
	System.setProperty(Key, Value);
	 driver=new ChromeDriver();
	driver.get(URL);
	
}


@AfterMethod()
public static void closeapp()
{
	driver.quit();
}
}
