package mt.mstr.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import mstr.config.Config;

public class FlightFinderpage
{
	
	@FindBy(how=How.XPATH,using="//img[@src='/images/masts/mast_flightfinder.gif']")
	WebElement objFlightFinder;
	
	
	@FindBy(how=How.LINK_TEXT,using="SIGN-OFF")
	WebElement objSignoff;
   
	public void LoadFilghtFinderpage()
	{
		PageFactory.initElements(Config.driver, this);
	}
	
	public void verifyFFpage()
	{
		boolean flag=objFlightFinder.isDisplayed();
		if(flag==true)
		{
			System.out.println("Flight Finder page is displayed");
		}
	}
	
	public void clickonSignoff()
	{
		objSignoff.click();
	}
		
	
	public static void main(String[] args) {
		
	}
	
	
	
}
