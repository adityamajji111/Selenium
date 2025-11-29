package MySteps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestLogin {
	public static WebDriver driver;
	@Given("Enter application URL")
	
	public void appurl() 
	
	   {
		 System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Batch12PM_OrangeHRM\\Repository\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
	   }


	@Then("Check the title of the Homepage")
	public void homepageTitle() {
		  String HomePageTitle  = driver.getTitle();
		    String Title = "OrangeHRM - New Level of HR Management";
		    
		    if(HomePageTitle.equals(Title))
		    {
		    	System.out.println("Login Page title is validated successfully");
		    }
		    else
		    {
		    	System.out.println("Login Page title is not validated");
		    }
	   }

	@When("Title checks enter username")
	public void username() {
		 driver.findElement(By.name("txtUserName")).sendKeys("selenium");
		   
	   
	}

	@Then("Enter password")
	public void password() {
		 driver.findElement(By.name("txtPassword")).sendKeys("Aadi@2662");
		   
	    }
	@Then("Hit on login button")
	public void login_button() {
		 driver.findElement(By.name("Submit")).click();
	   }
	@When("Login happens")
	public void login() {
		
		System.out.println("Successfully  logged in to the application");
	   }
	@Then("Check title after login happens")
	public void after_login_Title() {
		System.out.println("After login, title page is :" +driver.getTitle());
	   }



}
