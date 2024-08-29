package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	public WebDriver driver;
	
	By fullname=By.xpath("//input[@id='userName']");
	By email=By.xpath("//input[@id='userEmail']");
	By curraddress=By.xpath("//textarea[@id='currentAddress']");
	By permaddress=By.xpath("//textarea[@id='permanentAddress']");
	By submitBtn=By.xpath("//button[@id='submit']");

	public Homepage(WebDriver driver) {
		
		this.driver=driver;
	
	}
	
	public void validateHomepage() {
		driver.findElement(fullname).sendKeys("Mayank Choubey");
		driver.findElement(email).sendKeys("mayank@gmail.com");
		driver.findElement(curraddress).sendKeys("Mayank Choubey");
		driver.findElement(permaddress).sendKeys("Mayank Choubey");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(submitBtn));
		driver.findElement(submitBtn).click();

		
	}
	

}
