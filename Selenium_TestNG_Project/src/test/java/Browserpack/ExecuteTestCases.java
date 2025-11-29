package Browserpack;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import BaseConditionsPack.BaseClass;


public class ExecuteTestCases extends BaseClass {
   @Test
	public void TestCases() throws InterruptedException, AWTException, IOException
	{
		ScriptCoding S = new ScriptCoding();
		S.Login();
	//	S.AddEmployee();
	//	S.AddEmployeeExcel();
		S.AddMultipleEmployeesExcel();
		
	}
	
	
 
}
