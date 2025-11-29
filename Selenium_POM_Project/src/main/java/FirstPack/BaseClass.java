package FirstPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseClass {
	public static WebDriver driver;
  @BeforeClass
  public void OpenBrowser() 
  
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Batch12PM_OrangeHRM\\Repository\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }
}
