package Browserpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ReusedMethods extends ExecuteTestCases 
{
	WebElement xp(String k)
	{
		return driver.findElement(By.xpath(obj.getProperty(k)));
	}
	void T(int a) throws InterruptedException
	{
		int x = 1000*a;
		Thread.sleep(x);
	}
	

}
