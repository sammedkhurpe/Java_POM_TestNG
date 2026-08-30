package base;

import java.util.ArrayList;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import utils.TestDataReader;

public class BaseTest
{
	protected Playwright playwright;
	protected Browser browser;
	protected BrowserContext context;
	protected Page page;
	
	@BeforeClass
	public void startup()
	{
		TestDataReader.loadproperties();
		
		playwright=Playwright.create();
		ArrayList<String> arguments=new ArrayList<>();
		arguments.add("--start-maximized");
		browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false).setArgs(arguments));
		context=browser.newContext(new Browser.NewContextOptions().setViewportSize(null));
		page=context.newPage();
		page.navigate(TestDataReader.getProperty("url"));
	}
	
	@AfterClass
	public void closeout()
	{
		page.close();
		browser.close();
		playwright.close();
	}
}
