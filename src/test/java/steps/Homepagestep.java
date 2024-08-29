package steps;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageobjects.Homepage;

public class Homepagestep extends Base {
	
	
	@Test
	public void verifyText() {
		
		Homepage homeObj=new Homepage(driver);
		homeObj.validateHomepage();
		
	}

}
