package TestPack3;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {

	@Test(dataProvider="getdata")
	public void carloan(String UN ,String PWD)
	{
		System.out.println("username=  "+UN);
		System.out.println("password=  "+PWD);
	}
	
	
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data = new Object[3][2];
		//1st
		data[0][0]="UN1";
		data[0][1]="PWD1";
		//2nd
		data[1][0]="UN2";
		data[1][1]="PWD2";
		//3rd
		data[2][0]="UN3";
		data[2][1]="PWD3";
		
		return data;
		
		
		
	}
	

}
