package TestPack3;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Test4 {
     @Test
     public void Test41()
     {
    	 System.out.println("selenium is downloaded");
     }
     @Test(groups= {"smoke"})
     public void Test42()
     {
    	 System.out.println("Maven project is available");
     }
     @AfterSuite
     public void Test43()
     {
    	 System.out.println("After Suite");
     }
     
     
     
    // @Test
    // public void Test43()
    // {
    	// WebDriver driver=new FirefoxDriver();
 		//driver.manage().window().maximize();
 	   //driver.get("https://google.com");
   //  }
}
