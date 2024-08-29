package orangehrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends Base{

	@Test
	public void launch()throws Exception
	{
		driver.get("http://localhost/orangehrm/orangehrm-5.7/orangehrm-5.7/web/index.php/auth/login");
		String expected = "OrangeHRM";
		String actual = driver.getTitle();
		Assert.assertEquals(actual, expected);
		System.out.println("Website launched..");
	}
	@Test
	public void login()throws Exception
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("AdminLogin@1");
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		System.out.println("Login successfully..");
	}
}
