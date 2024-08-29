package orangehrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class AddEmployeeDetails extends Base {

	@Test
	public void add()throws Exception
	{
		System.out.println("Trying to enter firstname");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("firstName")).sendKeys("John");
		System.out.println("Firstname entered successfully");
		System.out.println("Trying to enter middlename");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("middleName")).sendKeys("A");
		System.out.println("Middlename entered successfully");
		System.out.println("Trying to enter lastname");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("lastName")).sendKeys("B");
		System.out.println("Lastname entered successfully");
		System.out.println("Clearing employee id");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")).sendKeys(Keys.chord(Keys.CONTROL,"a"));
		System.out.println("Adding employee id");
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")).sendKeys("1");
		System.out.println("Employee id added");
		System.out.println("Trying to add details");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
		System.out.println("Employee details added successfully");
		
	}
}
