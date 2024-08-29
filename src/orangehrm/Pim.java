package orangehrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Pim extends Base{

	@Test
	public void clickPim()throws Exception
	{
		System.out.println("Waiting to click PIM");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
		System.out.println("PIM clicked");
		System.out.println("Waiting to click Add Employee");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a")).click();
		System.out.println("Add Employee button clicked");
	}
}
