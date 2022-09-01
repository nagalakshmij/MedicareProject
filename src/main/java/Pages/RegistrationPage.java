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

public class RegistrationPage
{
	WebDriver driver= Baseclass.driver;
	ExtentTest test =Baseclass.test;

	//================= web elemenets============//

	@FindBy(id = "signup")
	WebElement signup;

	@FindBy(id = "firstName")
	WebElement firstName;


	@FindBy(id="lastName")
	WebElement lastName;

	@FindBy(id = "email")
	WebElement email;


	@FindBy(id="contactNumber")
	WebElement contactno;


	@FindBy(id = "password")
	WebElement password;


	@FindBy(id="confirmPassword")
	WebElement confirmPassword;

	@FindBy(name="_eventId_billing")
	WebElement nexttbilling;

	@FindBy(id="addressLineOne")
	WebElement addressLineOne;

	@FindBy(id="addressLineTwo")
	WebElement addressLineTwo;

	@FindBy(id="city")
	WebElement city;

	@FindBy(name="postalCode")
	WebElement postalCode;

	@FindBy(id="state")
	WebElement state;

	@FindBy(name="country")
	WebElement country;


	public RegistrationPage()
	{
		PageFactory.initElements(driver, this);
	}


	//================= Functions============//




	public void NewUser(String fname, String lName,String eMailvalue,String Contactno,String pwd) throws InterruptedException 
	{

		driver.findElement(By.id("signup")).click();
		Thread.sleep(5000);

		firstName.sendKeys(fname);
		test.log(LogStatus.PASS, "Enter Username", "User nameEntered successfully");
		lastName.sendKeys(lName);
		Thread.sleep(5000);
		email.sendKeys(eMailvalue);
		contactno.sendKeys(Contactno);
		password.sendKeys(pwd);
		confirmPassword.sendKeys(pwd);
		Thread.sleep(5000);
		nexttbilling.click();
		System.out.println("after next billing click");
		test.log(LogStatus.PASS, "Enter password", "Password Entered successfully");

		// WebElement addressOne = driver.findElement(By.xpath("//*[@id='addressLineOne']"));
		addressLineOne.sendKeys("Road no 34");
		test.log(LogStatus.PASS, "Address line one", "Address line one entered successfully");

		// WebElement addressTwo = driver.findElement(By.xpath("//*[@id='addressLineTwo']"));
		addressLineTwo.sendKeys("Chaitnayapuri colony");
		test.log(LogStatus.PASS, "Address line two", "Address line two entered successfully");

		// WebElement city = driver.findElement(By.xpath("//*[@id='city']"));
		city.sendKeys("Hyderabad");
		test.log(LogStatus.PASS, "City", "City name entered successfully");

		// WebElement postalCode = driver.findElement(By.xpath("//*[@id='postalCode']"));
		postalCode.sendKeys("500060");
		test.log(LogStatus.PASS, "PC", "Postal code entered successfully");

		// WebElement state = driver.findElement(By.xpath("//*[@id='state']"));
		state.sendKeys("Telangana");
		test.log(LogStatus.PASS, "State", "Name of the state entered successfully");

		//WebElement country = driver.findElement(By.xpath("//*[@id='country']"));
		country.sendKeys("India");
		test.log(LogStatus.PASS, "Country", "Country name entered successfully");

		Thread.sleep(3000);
		WebElement submit = driver.findElement(By.xpath("//*[@name='_eventId_confirm']"));
		submit.click();

		Thread.sleep(5000);

		WebElement confirm = driver.findElement(By.xpath("//*[@class='btn btn-lg btn-primary']"));
		confirm.click();

		Thread.sleep(5000);

		WebElement confirmation = driver.findElement(By.xpath("//*[@class='text-center']/h6")); 
		String confText = confirmation.getText();
		String ExpMsg = "You can use your email address as username to login!";
		Assert.assertEquals(confText, ExpMsg);
		test.log(LogStatus.PASS, "sign up", "New user signed up successfully");

		

		/*// WebElement email = driver.findElement(By.xpath("//*[@id='username']"));
		 email.sendKeys(eMailvalue);
		 test.log(LogStatus.PASS, "Email", "Email entered successfully");

		 WebElement password = driver.findElement(By.xpath("//*[@id='password']"));
		 password.sendKeys(pwd);
		 test.log(LogStatus.PASS, "Password", "Password entered successfully");

		 WebElement lgnBtn = driver.findElement(By.xpath("//*[@type='submit']"));
		 lgnBtn.click();


		 WebElement confirmLogin = driver.findElement(By.xpath("//*[@id='dropdownMenu1']")); 
		 String confirmText = confirmLogin.getText();
		 String ExpMsg1 = "Mary Campbell";
		 Assert.assertEquals(confText, ExpMsg);
		 test.log(LogStatus.PASS, "sign up", "New user logged in successfully");
		 */
	}
}