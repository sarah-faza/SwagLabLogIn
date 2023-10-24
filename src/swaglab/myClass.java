package swaglab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class myClass extends parameters {

	@BeforeMethod
	public void mySetup() {
		driver.get(Url);
		
	}

	@Test()
	public void LoginWithStandardUSer() throws InterruptedException {
		login(StandardUserName, passWord);
		// logout();

	}

	@Test()
	public void LoginWithProblemUser() throws InterruptedException {
		login(ProblemUserName, passWord);
		// logout();

	}

	@Test()
	public void LoginWithPerformanceUser() throws InterruptedException {
		login(PerformanceUserName, passWord);
		// logout();

	}

	@AfterTest
	public void myPostTesting() {

	}
}
