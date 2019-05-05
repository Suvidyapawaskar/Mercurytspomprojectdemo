package mt.mstr.utility;

import org.testng.annotations.Test;

import mstr.config.Config;

public class CloseBrowser 
{
   @Test
   public void closeBrowser()
   {
	   Config.driver.close();
   }
}
