package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test_Exmp {
	@BeforeClass
	public void login() {
		System.out.println("login completed");
	}
	@AfterClass
public void logout() {

	System.out.println("logout completed");
}
	@Test
	public void addemp() {
		System.out.println("addemp comp");
		
	}
	@Test
	public void delemp() {
		System.out.println("delemp");
	}


}
