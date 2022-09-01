package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import testcases.Baseclass;

public class LoginPage
{
	WebDriver driver= Baseclass.driver;
	ExtentTest test =Baseclass.test;

	//================= web elemenets============//

	@FindBy(id = "login")
	WebElement Login;

	@FindBy(id = "username")
	WebElement username;


	@FindBy(id="password")
	WebElement password;


	@FindBy(xpath="//*[@id=\"loginForm\"]/div[3]/div/input[2]")
	WebElement Loginbtn;



	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}


	//================= Functions============//

	public void loginfunction(String name, String pwd) throws InterruptedException
	{

		driver.findElement(By.id("login")).click();
		Thread.sleep(5000);

		//WebElement loginlink= driver.findElement(By.linkText("Log in"));

		//wait.until(ExpectedCondition.)
		/*WebElement UserName= driver.findElement(By.name("user_login"));


		WebElement Password= driver.findElement(By.id("password"));


		WebElement Rememberme= driver.findElement(By.className("rememberMe"));


		WebElement Loginbtn= driver.findElement(By.name("btn_login"));
		 */



		username.sendKeys(name);
		test.log(LogStatus.PASS, "Enter Username", "User nameEntered successfully");
		password.sendKeys(pwd);
		test.log(LogStatus.PASS, "Enter password", "Password Entered successfully");

		Loginbtn.click();
		Thread.sleep(5000);
		test.log(LogStatus.PASS, "Click on Login Button", "Login successfully");
	}
}
