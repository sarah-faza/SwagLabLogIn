package swaglab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class parameters {

	static String Url = "https://www.saucedemo.com/";
	static String StandardUserName = "standard_user";
	static String ProblemUserName = "problem_user";

	static String PerformanceUserName = "performance_glitch_user";

	static String passWord = "secret_sauce";

	static WebDriver driver = new ChromeDriver();

	static public void login(String username, String password) throws InterruptedException {

		WebElement userNameInputField = driver.findElement(By.id("user-name"));
		userNameInputField.sendKeys(username);
		WebElement passNameInputField = driver.findElement(By.id("password"));
		passNameInputField.sendKeys(passWord);
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		Thread.sleep(3000);
		driver.get(Url);

	}

//	static public void logout() throws InterruptedException {
//
//		driver.findElement(By.id("react-burger-menu-btn")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.id("logout_sidebar_link")).click();
//
//	}

}
