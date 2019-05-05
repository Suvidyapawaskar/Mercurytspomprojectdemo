package mt.mstr.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import mstr.config.Config;
import mt.mstr.utility.LaunchApp;

public class Loginpage 

{
	@FindBy(how=How.XPATH,using="//input[@name='userName']")
	WebElement objUsername;
	
	@FindBy(how=How.XPATH,using="//input[@name='password']")
	WebElement objPassword;
	
	@FindBy(how=How.XPATH,using="//input[@name='login']")
	WebElement objLogin;
	
	public void loadLoginpage()
	{
		PageFactory.initElements(Config.driver, this);
	}
	
	public void enterUsername(String username)
	{
		System.out.println("In enterUsername method");
		objUsername.sendKeys(username);
		System.out.println("Username is entered successfully");
	}
	
	public void enterPassword(String password)
	{
		System.out.println("In enterPassword method")
		objPassword.sendKeys(password);
		System.out.println("Password is entered successfully");
	}
	
	public void clickonLogin()
	{
		objLogin.click();
	}
	
	public static void main(String[] args) throws IOException
	{
		
		LaunchApp lc= new LaunchApp();
		lc.openBrowser("chrome");
		lc.enterApplicationURL("http://newtours.demoaut.com/mercurywelcome.php");
		lc.maximizebrowser();
		lc.waittillLoginpageloaded(15);
		
		Loginpage lp= new Loginpage();
		lp.loadLoginpage();
		lp.enterUsername("Suvidyap1");
		lp.enterPassword("P@ssword1");
		lp.clickonLogin();
		
	}
	
}
