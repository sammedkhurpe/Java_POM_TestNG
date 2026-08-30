package testcases;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import utils.ScreenshotTaker;
import utils.TestDataReader;


public class TC1_Login  extends BaseTest
{
	
	@Test
	public void validLogin() throws InterruptedException
	{
		LoginPage lg=new LoginPage(page);
		
		ScreenshotTaker.takescreenshot(page, "01");
		
		lg.username(TestDataReader.getProperty("username"));
		ScreenshotTaker.takescreenshot(page, "02");
		
		lg.password(TestDataReader.getProperty("password"));
		ScreenshotTaker.takescreenshot(page, "03");
		
		lg.login();
		
		Thread.sleep(10000);
		ScreenshotTaker.takescreenshot(page, "04");
		
		
		System.out.println("Successfully Logged In");
		
	}

}
