package testcasepckg1;

import java.io.IOException;

import org.testng.annotations.Test;

import basepckg1.Base1;

public class HomePage extends Base1{
	
	@Test
	public void BasePageNaviation() throws IOException
	{
		driver = StartDriver();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		System.out.println("Base Navigation Method executed successfully");
		driver.close();
		
		
	}
	
	 
	

}
