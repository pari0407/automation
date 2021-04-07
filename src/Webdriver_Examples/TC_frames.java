package Webdriver_Examples;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_frames {

	public static void main(String[] args) throws Throwable {
		//test case steps
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		System.out.println("login comp");
		//click on add btn
		driver.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("aishwarya");
		driver.findElement(By.name("txtEmpLastName")).sendKeys("sontakke");
		driver.findElement(By.id("btnEdit")).click();
		Thread.sleep(3000);
		System.out.println("new emp added");
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("logout completed");

		driver.close();
	}

}
