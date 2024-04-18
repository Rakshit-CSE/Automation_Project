package ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	@BeforeTest
	public void loginToApplication()
	{
		System.out.println("Login to Application");
	}
	@AfterTest
	public void logoutToApplication()
	{
		System.out.println("Logout from Application");
	}
	@BeforeMethod
	public void connectToDB()
	{
		System.out.println("DB Connected");
	}
	@Test(priority=1,description="This is a login test")
	public void bloginTest() 
	{
		System.out.println("Login Successful");
	}
	@Test(priority=2,description="This is a logout test")
	public void alogOut()
	{
		System.out.println("Logout Successful");
	}
	@AfterMethod
	public void disconnectfromDB()
	{
		System.out.println("DB Disconnected");
	}
}
