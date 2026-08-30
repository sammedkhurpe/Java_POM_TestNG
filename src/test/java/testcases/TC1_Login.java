package testcases;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utils.TestDataReader;


public class TC1_Login  extends BaseTest
{
	
	@Test
	public void validLogin() throws InterruptedException
	{
		LoginPage lg=new LoginPage(page);
		lg.username(TestDataReader.getProperty("username"));
		lg.password(TestDataReader.getProperty("password"));
		lg.login();
		
		System.out.println("Successfully Logged In");
		
	}

}
