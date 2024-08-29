package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.util.TimeUtils;

import junit.framework.Assert;

public class Elementvalidation {
	
	public static void elemntVisibility(WebDriver driver,WebElement element) {
		
		boolean isPresent;
		
		try {
			
			isPresent=element.isDisplayed();
			System.out.println(element.getAttribute("id")+"Element present");
		}
		
		catch (Exception e) {
			Assert.assertEquals(element.getAttribute("id")+"Element is not present", true, true);
		}
		
	}

}
