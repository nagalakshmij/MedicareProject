package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pages.LoginPage;

public class LoginTest extends Baseclass
{


	

	@Test(enabled= true)
	public void LoginSuccesstest() throws InterruptedException
	{

		LoginPage obj= new LoginPage();
		Thread.sleep(10000);
		obj.loginfunction("kn@gmail.com","12345");
	}

	


}

