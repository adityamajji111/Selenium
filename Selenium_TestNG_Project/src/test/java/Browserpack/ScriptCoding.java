package Browserpack;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.interactions.Actions;

public class ScriptCoding extends ReusedMethods 
{
	 public void Login() 
	  {
		  driver.get(obj.getProperty("URL"));
		  xp("XUN").sendKeys(obj.getProperty("UN"));
		  xp("XPWD").sendKeys(obj.getProperty("PWD"));
		  xp("XSUB").click();
	  }
	 //Add One Employee
	 public void AddEmployee() throws InterruptedException, AWTException
	 {
		 T(2);
		 Actions A = new Actions(driver);
		 A.moveToElement(xp("XPIM")).perform();
		 T(1);
		 xp("XADD").click();
		 driver.switchTo().frame(xp("XFRAME"));
		 xp("XID").clear();
		 xp("XID").sendKeys("1000");
		 xp("XLAST").sendKeys("CCC");
		 xp("XFIRST").sendKeys("AAA");
		 xp("XMIDDLE").sendKeys("BBB");
		 xp("XNICK").sendKeys("NNN");
		 T(2);
		 A.moveToElement(xp("XPHOTO")).click().perform();
		 StringSelection ss= new StringSelection("D:\\Testing Videos\\Selenium Videos\\TestScreenShots\\Home.jpg");
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		 T(1);
		 Robot R = new Robot();
		 R.keyPress(KeyEvent.VK_CONTROL);
		 R.keyPress(KeyEvent.VK_V);
		 R.keyRelease(KeyEvent.VK_CONTROL);
		 R.keyRelease(KeyEvent.VK_V);
		 T(1);
		 R.keyPress(KeyEvent.VK_ENTER);
		 R.keyRelease(KeyEvent.VK_ENTER);
		 T(1);
		 xp("XSAVE").click();
		 T(2);
		 xp("XBACK").click();
		 driver.switchTo().defaultContent();;
  }
	 //Add one Employee with Excel
	 public void AddEmployeeExcel() throws InterruptedException, IOException, AWTException
	 {
		 T(2);
		 FileInputStream fis = new FileInputStream("D:\\Selenium\\Batch12PM_OrangeHRM\\src\\data\\java\\DataPack\\Testing Data.xlsx");
		  XSSFWorkbook W = new XSSFWorkbook(fis); 
		  XSSFSheet Sht = W.getSheet("Add Employee");
		  int eid = (int) Sht.getRow(1).getCell(0).getNumericCellValue();
		  String efirst = Sht.getRow(1).getCell(1).getStringCellValue();
		  String emiddle = Sht.getRow(1).getCell(2).getStringCellValue();
		  String elast = Sht.getRow(1).getCell(3).getStringCellValue();
		  String enick = Sht.getRow(1).getCell(4).getStringCellValue();
		  Actions A = new Actions(driver);
			 A.moveToElement(xp("XPIM")).perform();
			 T(1);
			 xp("XADD").click();
			 driver.switchTo().frame(xp("XFRAME"));
			 xp("XID").clear();
			 xp("XID").sendKeys(String.valueOf(eid));
			 xp("XLAST").sendKeys(elast);
			 xp("XFIRST").sendKeys(efirst);
			 xp("XMIDDLE").sendKeys(emiddle);
			 xp("XNICK").sendKeys(enick);
			 T(2);
			 A.moveToElement(xp("XPHOTO")).click().perform();
			 StringSelection ss= new StringSelection("D:\\Testing Videos\\Selenium Videos\\TestScreenShots\\Home.jpg");
			 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			 T(1);
			 Robot R = new Robot();
			 R.keyPress(KeyEvent.VK_CONTROL);
			 R.keyPress(KeyEvent.VK_V);
			 R.keyRelease(KeyEvent.VK_CONTROL);
			 R.keyRelease(KeyEvent.VK_V);
			 T(1);
			 R.keyPress(KeyEvent.VK_ENTER);
			 R.keyRelease(KeyEvent.VK_ENTER);
			 T(1);
			 xp("XSAVE").click();
			 T(2);
			 xp("XBACK").click();
			 driver.switchTo().defaultContent();
	 }
	 //Add Multiple Employees with Excel
	 public void AddMultipleEmployeesExcel() throws InterruptedException, IOException, AWTException
	 {
		 T(2);
		 FileInputStream fis = new FileInputStream("D:\\Selenium\\Batch12PM_OrangeHRM\\src\\data\\java\\DataPack\\Testing Data.xlsx");
		  XSSFWorkbook W = new XSSFWorkbook(fis); 
		  XSSFSheet Sht = W.getSheet("Add Employee");
		   for(int v=1; v<=Sht.getLastRowNum(); v++)
		   {
		  int eid = (int) Sht.getRow(v).getCell(0).getNumericCellValue();
		  String efirst = Sht.getRow(v).getCell(1).getStringCellValue();
		  String emiddle = Sht.getRow(v).getCell(2).getStringCellValue();
		  String elast = Sht.getRow(v).getCell(3).getStringCellValue();
		  String enick = Sht.getRow(v).getCell(4).getStringCellValue();
		  Actions A = new Actions(driver);
			 A.moveToElement(xp("XPIM")).perform();
			 T(1);
			 xp("XADD").click();
			 driver.switchTo().frame(xp("XFRAME"));
			 xp("XID").clear();
			 xp("XID").sendKeys(String.valueOf(eid));
			 xp("XLAST").sendKeys(elast);
			 xp("XFIRST").sendKeys(efirst);
			 xp("XMIDDLE").sendKeys(emiddle);
			 xp("XNICK").sendKeys(enick);
			 T(2);
			 A.moveToElement(xp("XPHOTO")).click().perform();
			 StringSelection ss= new StringSelection("D:\\Testing Videos\\Selenium Videos\\TestScreenShots\\Home.jpg");
			 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			 T(1);
			 Robot R = new Robot();
			 R.keyPress(KeyEvent.VK_CONTROL);
			 R.keyPress(KeyEvent.VK_V);
			 R.keyRelease(KeyEvent.VK_CONTROL);
			 R.keyRelease(KeyEvent.VK_V);
			 T(1);
			 R.keyPress(KeyEvent.VK_ENTER);
			 R.keyRelease(KeyEvent.VK_ENTER);
			 T(1);
			 xp("XSAVE").click();
			 T(2);
			 xp("XBACK").click();
			 driver.switchTo().defaultContent();
		   }
	 }
}
