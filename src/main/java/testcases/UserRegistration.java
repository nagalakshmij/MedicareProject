package testcases;

import org.testng.annotations.Test;

import Pages.LoginPage;
import Pages.RegistrationPage;

public class UserRegistration extends Baseclass {

	@Test(enabled= true)
	public void UserRegistration() throws InterruptedException
	{

		RegistrationPage obj1= new RegistrationPage();
		obj1.NewUser("lakshmi", "naga","naglakshmij1@gmail.com","9959490005","123456");
	}

	


}


