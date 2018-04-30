package Generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements Constant


{
	/**
	 * author Kusum	
	 */
	
	
	public static Properties p;
	public static WebDriver driver;
	
@BeforeMethod

/**
 * Launching the application
 */
public static void openapplication()
{
	System.setProperty(Key, Value);
	 driver=new ChromeDriver();
	driver.get(URL);
	
}

public void data() throws IOException
{
FileInputStream file=new FileInputStream("/home/tyss/Desktop/littleapp/Pumaassignment/propertyfile/data.properties");  

Properties p=new Properties();  
p.load(file);

}
@AfterMethod()

/**
 * Closing the application
 */
public static void closeapp()
{
	driver.quit();
}


}
