package TestPack3;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test3 {
     @Test(groups= {"smoke"})
     public void Test31()
     {
    	 System.out.println("TestNG is downloaded");
     }
    
     @BeforeSuite 
     public void  beforesuite()
     {
    	 System.out.println("Berfore suite");
     }
     @AfterSuite
     public void aftersuite()
     {
    	 System.out.println("After Suite");
     }
     @BeforeClass
     public void beforeclass()
     {
    	 System.out.println("Before Class");
     }
     
     @Parameters({"username","password"})
     @Test
     public void Test32(String Un, String Pw)
     {
    	 System.out.println("TestNG is downloaded");
    	 System.out.println("username +=  "+Un);
    	 System.out.println("password +=  "+Pw);
     }
     @Test
     public void Test33()
     {
    	 System.out.println("TestNG is downloaded");
     }
     @BeforeMethod
     public void beforemethod()
     
     {
    	 System.out.println("Before method");
     }

}
