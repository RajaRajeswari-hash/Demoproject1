package TestPack3;

import org.testng.annotations.Test;

//import org.junit.Test;

public class DependsonMethods {
	  @Test
	    public void credentials()
	    {
	    	System.out.println("Enter the Credentials");
	    	
	    }
	@Test(dependsOnMethods={"credentials"})
	public void carloan()
	{
	   System.out.println("Details of the candiadates");	
	}
	@Test(enabled=true)
	public void carloan2()
	{
	   System.out.println("Details of the candiadates");	
	}  
	@Test(timeOut=3000)
	public void carloan3()
	{
	   System.out.println("Details of the candiadates 4567");	
	}  
	 
	
	   
	   
	
	
  
}
