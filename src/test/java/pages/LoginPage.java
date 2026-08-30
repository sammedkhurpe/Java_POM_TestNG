package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class LoginPage 
{
	private Page page;
	
	private Locator username;
	private Locator password;
	private Locator login;
	
	public LoginPage (Page page)
	{
		this.page=page;
		
		username=page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Mobile number, username or email"));
		password=page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Password"));
		login=page.getByLabel("Log in");
	}
	
	public void username(String username) 
	{
		this.username.fill(username);
	}
	
	public void password(String password)
	{
		this.password.fill(password);
	}	
	
	public void login()
	{
		this.login.click();
	}
}
