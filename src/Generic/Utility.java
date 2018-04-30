package Generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Utility 



{
	
	/**
	 * author Kusum	
	 */
	
	public static WebDriver driver;
	
	/**
	 * Parameter as the target element.
	 */
public static void action(WebElement target)
{
	Actions act=new Actions(driver);
	
	act.moveToElement(target).perform();
	
}
/**
 * Scrolling down in y axis
 */
public static void scroll()
{
	JavascriptExecutor j=(JavascriptExecutor)driver;
	j.executeScript("window.scrollBy(0,200)");
}
}
