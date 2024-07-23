package TestPack3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertiesClass {
     @Test
     public void propertiesTest() throws IOException
     {
         //Class properties
    	 Properties prop=new Properties();
    	 FileInputStream fis=new FileInputStream("C:\\Users\\rajes\\eclipse-workspace1\\TestNG2\\src\\test\\java\\TestPack3\\Data.properties");
         prop.load(fis);
         System.out.println(prop.getProperty("browser"));
         System.out.println(prop.getProperty("url"));
         
         prop.setProperty("browser", "chrome");
         System.out.println(prop.getProperty("browser"));
         prop.setProperty("url", "www.google.com");
         System.out.println(prop.getProperty("url"));
         FileOutputStream fos=new FileOutputStream("C:\\Users\\rajes\\eclipse-workspace1\\TestNG2\\src\\test\\java\\TestPack3\\Data.properties");
         prop.store(fos,null);
     }  
     
}
