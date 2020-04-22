package test_Cases;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import utiliti_files.Readconfig;




public class BaseClass {


	Readconfig readconfig = new Readconfig();
	public String baseUrl =readconfig.getApplicatonUrl();
	public static WebDriver driver;
	public String username = readconfig.getUserName();
	public String password = readconfig.getPassword();
	public static Logger logger;


	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		System.out.println(br);
		
		System.out.println("This setup method");
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\SUMA SRI\\MavenJav\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\SUMA SRI\\MavenJav\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		else if(br.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver","C:\\Users\\SUMA SRI\\MavenJav\\Drivers\\chromedriver.exe");
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
		}
		logger = LogManager.getLogger("Mavenjav");
		PropertyConfigurator.configure("./log4j2.properties");
	}

	@AfterClass
	public void tearDown()
	{
		driver.close();
		driver.quit();
	}


}
