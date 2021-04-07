package Webdriver_Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

import org.openqa.selenium.By;
public class TC001 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		Thread.sleep(5000);
		System.out.println("Application opened");
		driver.close();
		System.out.println("Application closed");
		
		

	}

}
