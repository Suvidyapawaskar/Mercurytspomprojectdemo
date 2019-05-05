package mstr.testexecution;

import java.io.IOException;

import mt.mstr.pages.FlightFinderpage;
import mt.mstr.pages.Loginpage;
import mt.mstr.utility.LaunchApp;

public class TestExecution {

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
		
		FlightFinderpage ff= new FlightFinderpage();
		ff.LoadFilghtFinderpage();
		ff.verifyFFpage();
		ff.clickonSignoff();
	}

}
