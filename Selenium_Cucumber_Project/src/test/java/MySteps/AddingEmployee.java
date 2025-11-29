package MySteps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddingEmployee 

{
    public static WebDriver driver;
	@Then("Enter employee details and save")
	public void enter_employee_details_and_save() throws InterruptedException, AWTException 
	{
		 Actions A = new Actions(driver);
		    WebElement MV = driver.findElement(By.id("pim"));
		    A.moveToElement(MV).perform();	  
		    driver.findElement(By.xpath("//*[@id=\"pim\"]/ul/li[2]/a/span")).click();
		    Thread.sleep(2000);
		    driver.switchTo().frame(driver.findElement(By.id("rightMenu")));
		    driver.findElement(By.id("txtEmployeeId")).clear();
		    driver.findElement(By.id("txtEmployeeId")).sendKeys("0359");
		    driver.findElement(By.id("txtEmpLastName")).sendKeys("M");
		    driver.findElement(By.name("txtEmpFirstName")).sendKeys("Aadi");
		    A.moveToElement(driver.findElement(By.id("photofile"))).click().perform();
		   
		    StringSelection ss =new StringSelection("C:\\Users\\adity\\Downloads\\Sample.jpg");
		    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		    Robot R = new Robot();
		    
		    R.keyPress(KeyEvent.VK_CONTROL);
		    R.keyPress(KeyEvent.VK_V);
		    
		    R.keyRelease(KeyEvent.VK_CONTROL);
		    R.keyRelease(KeyEvent.VK_V);
		    
		    Thread.sleep(1000);
		    R.keyPress(KeyEvent.VK_ENTER);
		    R.keyRelease(KeyEvent.VK_ENTER);
	}
	@Then("Check employee is added")
	public void check_employee_is_added() {
	  
	}




}
