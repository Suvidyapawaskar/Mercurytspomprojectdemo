package mt.mstr.modules;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import mstr.config.Config;
import mt.mstr.pages.FlightFinderpage;
import mt.mstr.pages.Loginpage;

import org.testng.annotations.Test;

public class Login {
  
  @Parameters({"usernm","passwd"})
  @Test
  public void ExecuteLoginwithvalidds(String username,String password) throws InterruptedException
  {
	  Loginpage lg= new Loginpage();
	  lg.loadLoginpage();
	  lg.enterUsername(username);
	  lg.enterPassword(password);
	  lg.clickonLogin();
	  
	  //Thread.sleep(5000);
	 
	  //WebDriverWait wait = new WebDriverWait(Config.driver,15);
	  //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='/images/masts/mast_flightfinder.gif']")));
	  
	  FlightFinderpage ff= new FlightFinderpage();
	  ff.LoadFilghtFinderpage();
	  ff.verifyFFpage();
	  ff.clickonSignoff();
	  
  }
  
  @Parameters({"invalidusernm","invalidpasswd"})
  @Test
  public void ExecuteLoginwithinvalidds(String invaliduname,String invalidpasswd) throws InterruptedException
  {
	 
	  Loginpage lg1= new Loginpage();
	  lg1.loadLoginpage();
	  lg1.enterUsername(invaliduname);
	  lg1.enterPassword(invalidpasswd);
	  lg1.clickonLogin();
	  
  }
}
