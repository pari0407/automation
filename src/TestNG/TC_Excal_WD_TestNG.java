package TestNG;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TC_Excal_WD_TestNG {
	WebDriver driver;
	@BeforeClass
	public void startUp() {
		System.setProperty("webdriver.gecko.driver", "D:\\selenium\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		
	}
	@AfterClass
	public void tearDown() {
		driver.close();
	}
	@Test
	public void Tc001() throws Exception {
		FileInputStream f1= new FileInputStream("‪D:\\list1.xls");
		Workbook w =Workbook.getWorkbook(f1);
		Sheet st= wb.getSheet(0);
		String un = st.getCell(0,1).getContents();
		String pw = st.getCell(1,1).getContent();
		Reporter.log(un);
		Reporter.log(pw);
		
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		System.out.println("application open");
		Reporter.log("Aplication open");
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		Reporter.log("login completed");
		Reporter.log(driver.getTitle());
		driver.findElement(By.linkText("Logout")).click();
		
	}

}
