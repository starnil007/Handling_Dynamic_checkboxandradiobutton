package handling_Dynamic_checkboxandradiobutton;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public WebDriver driver;
	String URL;
	String WebdriverPath;
	String DriverType;


	public void readConfigFile() throws Exception{

		Properties prop = new Properties();
		InputStream input = new FileInputStream("C:\\Users\\Indranil Sarkar\\Revision1\\Handling_Dynamic_checkboxandradiobutton\\Config.properties");
		prop.load(input);

		URL = prop.getProperty("URL");
		WebdriverPath = prop.getProperty("WebdriverPath");
		DriverType = prop.getProperty("DriverType");	

	}
	
	@BeforeMethod
	public void setUp() throws Exception{

		readConfigFile();
		System.setProperty("DriverType", WebdriverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(URL);

	}
	
	@AfterMethod
	public void tearDown(){

		driver.close();
	}

}
