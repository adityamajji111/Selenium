package TestPack;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\Selenium\\Batch_OrangeHRM_Cucumber\\src\\main\\java\\BasePack\\Mydata.feature", glue= {"MySteps"})


public class MyClass1 
{
}



