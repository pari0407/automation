package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Examp1 {
	WebDriver driver;
	@BeforeClass
	public void StartUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		
	}
	@AfterClass
	public void tearDown() {
		driver.quit();;
	}
	@Test
	public void tc001() throws Exception {
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		System.out.println("Application opened");
		Reporter.log("Application opened");
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		Reporter.log("Login completed");
		Reporter.log("Logout completed");
		driver.findElement(By.linkText("Logout")).click();
		Reporter.log("Logout completed");
		
		
	
	}
	
		
	
	
	

}
