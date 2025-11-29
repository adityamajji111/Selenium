package BaseConditionsPack;

import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BaseClass 
{
	public  static WebDriver driver;
	public static Properties obj;
  @BeforeMethod
  public void OpenBrowser() throws IOException  
   { 
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Batch12PM_OrangeHRM\\Repository\\chromedriver.exe");
	  driver = new ChromeDriver();
	  //driver.manage().window().maximize();
	  FileInputStream fis = new FileInputStream("D:\\Selenium\\Batch12PM_OrangeHRM\\src\\data\\java\\DataPack\\MyData");
	  obj = new Properties();
	  obj.load(fis);
	
	  
   }

  @AfterMethod
  public void CloseBrowser() 
  {
	 // driver.quit();
  }

}
