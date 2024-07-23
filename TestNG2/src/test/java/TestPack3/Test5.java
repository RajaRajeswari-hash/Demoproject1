package TestPack3;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test5 {
	@Test
	 public void Test51()
    {
		//WebDriver driver=new FirefoxDriver();
		//driver.manage().window().maximize();
	    //driver.get("https://www.yahoo.com");
		System.out.println("Maven in Selenium");
    }
	@BeforeTest
	public void Beforetest()
	{
		System.out.println("Before test");
	}
    @Test
    public void Test52()
    {
    	//WebDriver driver=new FirefoxDriver();
	   // driver.get("https://www.facebook.com");
	   // driver.manage().window().maximize();
    	System.out.println("Testng in Selenium");
    }
    @Test
    public void Test53()
    {
   	   // WebDriver driver=new FirefoxDriver();
		//driver.manage().window().maximize();
		//driver.get("https://www.gmail.com");
    	System.out.println("Java in Selenium");
    }
    

}
