package POMtestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import FirstPack.BaseClass;

public class POMTestclasses extends BaseClass{
  @Test
  public void Logindata() 
  {
	  codingclass c = PageFactory.initElements(driver, codingclass.class);
	  c.Logindata();
	  
  }
}
