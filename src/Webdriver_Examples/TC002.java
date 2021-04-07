package Webdriver_Examples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;

import org.openqa.selenium.By;
public class TC002 {
public static void main(String args[]) throws Throwable {
System.setProperty("webdriver.chrome.driver","D:\\selenium\\drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
Thread.sleep(3000);
driver.findElement(By.name("txtUserName")).sendKeys("admin");
driver.findElement(By.name("txtPassword")).sendKeys("admin");
driver.findElement(By.name("Submit")).click();
System.out.println("Application open");
Thread.sleep(3000);
driver.findElement(By.linkText("Logout")).click();
Thread.sleep(3000);
driver.close();
System.out.println("Application closed");


	




}
}
