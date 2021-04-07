package Webdriver_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_003 {
	public static void main( String args[]) throws Throwable {
	System.setProperty("WebDriver.gecko.driver", "D:\\selenium\\drivers\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
	Thread.sleep(3000);
	if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")){
		System.out.println("Title Matched");
	}
	else {
		System.out.println("Title not matched");
		System.out.println(driver.getTitle());
	}
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
	driver.findElement(By.linkText("Submit")).click();
	Thread.sleep(5000);
	System.out.println("login comp");
	


		
	}

}
