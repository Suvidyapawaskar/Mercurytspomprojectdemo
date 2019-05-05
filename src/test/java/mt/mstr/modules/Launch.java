package mt.mstr.modules;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import mt.mstr.utility.LaunchApp;

import org.testng.annotations.Test;

public class Launch {
  
  @Parameters({"browser","url","timeoutseconds"})
  @Test
  public void ExecuteLaunch(String browsername,String urlnm,int timesecond) throws IOException 
  {
	  LaunchApp lp = new LaunchApp();
	  lp.openBrowser(browsername);
	  lp.enterApplicationURL(urlnm);
	  lp.maximizebrowser();
	  lp.waittillLoginpageloaded(timesecond);
  }
}
