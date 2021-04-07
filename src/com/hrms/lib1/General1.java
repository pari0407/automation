package com.hrms.lib1;


import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

import com.hrms.utility1.Log;

public class General1 extends Global1 {
	public void Application() {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\drivers\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.navigate().to(url);
		System.out.println("Application opened");
		Reporter.log("Application opened");
		Log.info("Application opened");
		
		}
	public void closebrowser() {
		driver.quit();
		System.out.println("logout application");
		Log.info("close Application");
		
	}
	public void login() throws Exception {
		driver.findElement(By.name(text_loginname)).sendKeys(un);
		driver.findElement(By.name(text_passward)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		Thread.sleep(3000);
		System.out.println("Login completed");
		Log.info("Login completed");
	}
	//public void  search() throws Exception {
		//driver.findElement(By.id(search)).sendKeys(ss);
		//Thread.sleep(3000);
	//}
	public void logout() throws Exception {
		driver.findElement(By.linkText(link_logout)).click();
		Thread.sleep(3000);
		System.out.println("logout completed");
		Log.info("Logout completed");
	}
	public void addemp() {
		System.out.println("adding emp");
		Log.info("add  new emp");
	}
	public void delmp() {
		System.out.println("delete emp");
		Log.info("del emp");
	}
	

		
		
	
	

}
