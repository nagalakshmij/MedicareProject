package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.RegistrationPage;

public class Purchaseorder extends Baseclass 
{
	@Test(enabled= true)
	public void purhcasemedicines() throws InterruptedException
	{

		LoginPage obj= new LoginPage();
		Thread.sleep(10000);
		obj.loginfunction("kn@gmail.com","12345");
		
		
		WebElement Paracetamol = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
		Paracetamol.click();

		Thread.sleep(5000);
		WebElement AddToCart = driver.findElement(By.xpath("//a[@class='btn btn-success']"));
		AddToCart.click();

		WebElement Quantity = driver.findElement(By.xpath("//input[@type='number']"));
		Quantity.sendKeys("1");

		Thread.sleep(5000);

		WebElement Checkout = driver.findElement(By.xpath("//a[@class='btn btn-success btn-block']"));
		Checkout.click();

		Thread.sleep(2000);

		WebElement Select = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
		Select.click();
		Thread.sleep(2000);
		WebElement CardNumber = driver.findElement(By.xpath("//input[@id='cardNumber']"));
		CardNumber.sendKeys("123456789");

		WebElement Expirymonth  = driver.findElement(By.xpath("//input[@id='expityMonth'] "));
		Expirymonth.sendKeys("2");

		WebElement ExpiryYear  = driver.findElement(By.xpath("//input[@id='expityYear'] "));
		ExpiryYear.sendKeys("2025");

		WebElement CVCode  = driver.findElement(By.xpath("//input[@id='cvCode']"));
		CVCode.sendKeys("4321");

		WebElement Pay  = driver.findElement(By.xpath("//a[@role='button']"));
		Pay.click();
		Thread.sleep(20000);
		System.out.println("Your order is successfully confirmed");
		
		

	
}
}
