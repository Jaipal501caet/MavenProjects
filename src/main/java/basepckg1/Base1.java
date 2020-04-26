package basepckg1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base1 {	

	public WebDriver driver;
	public WebDriver StartDriver() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\Maven_TestProj1\\src\\main\\java\\basepckg1\\data.properties");
		prop.load(fis);
		
		String BrowserName = prop.getProperty("browser");
		
		if (BrowserName.contentEquals("firefox"))
// Below webdriver manager will automatically download geckodriver or chromdriver.exe 
			//WebDriverManager.firefoxdriver().setup();
			
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Dell\\drivers\\geckodriver.exe");	
		FirefoxOptions options = new FirefoxOptions();
		options.setHeadless(true);
		//options.addArguments("headless");
			driver= new FirefoxDriver(options);
			return driver;
			
	}
	
}
