package swaglab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class myClass extends parameters {
	
	
	
	@BeforeTest
	public void mySetup() {
		driver.get(Url);
		WebElement userNameInputField = driver.findElement(By.id("user-name"));
		WebElement passNameInputField = driver.findElement(By.id("password"));
	}

	
	@Test()
	public void ALoginWithStandardUSer() throws InterruptedException {
		WebElement userNameInputField = driver.findElement(By.id("user-name"));
		userNameInputField.sendKeys(StandardUserName);
		WebElement passNameInputField = driver.findElement(By.id("password"));
		passNameInputField.sendKeys(passWord);
		
		
		 
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(3000); 

		driver.findElement(By.id("logout_sidebar_link")).click();
		
		
		
		
	}
		////*[@id="login-button"]


	@Test()
	public void BLoginWithProblemUser() throws InterruptedException {
		WebElement userNameInputField = driver.findElement(By.id("user-name"));
		userNameInputField.sendKeys(ProblemUserName);
		WebElement passNameInputField = driver.findElement(By.id("password"));
		passNameInputField.sendKeys(passWord);
		 
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(3000); 
		driver.findElement(By.id("logout_sidebar_link")).click();
		
	

	}
	@Test()
	public void CLoginWithPerformanceUser() throws InterruptedException {
		WebElement userNameInputField = driver.findElement(By.id("user-name"));
		userNameInputField.sendKeys(PerformanceUserName);
		WebElement passNameInputField = driver.findElement(By.id("password"));
		passNameInputField.sendKeys(passWord);
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(3000); 

		driver.findElement(By.id("logout_sidebar_link")).click();
		
		

	}

	@AfterTest
	public void myPostTesting() {
		
		
	}
}
