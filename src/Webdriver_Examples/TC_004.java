package Webdriver_Examples;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TC_004 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		Thread.sleep(3000);
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Aplication opened");
		Thread.sleep(3000);
		//mouse Action
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
		Thread.sleep(3000);
		System.out.println("mouseaction comp");
		driver.findElement(By.linkText("Add Employee")).click();
		System.out.println("clicked sub");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
		
	
		

	}

}

