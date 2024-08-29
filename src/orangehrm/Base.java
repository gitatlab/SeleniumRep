package orangehrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {
	public static WebDriver driver = null;
	@BeforeTest
	public void initialize() throws Exception
	{
		System.out.println("Firefox browser is trying to launch..");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\Desktop\\SELENIUM IDE\\SELENIUM WEBDRIVER\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		System.out.println("Firefox browser launched successfully..");
	}
	@AfterTest
	public void tearDown() throws WebDriverException
	{
		driver.close();
		driver.quit();
		System.out.println("Firefox browser closed successfully..");
	}
}
