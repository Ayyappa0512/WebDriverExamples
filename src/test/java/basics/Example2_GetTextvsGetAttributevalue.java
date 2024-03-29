package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class Example2_GetTextvsGetAttributevalue extends Base {
	
	@Test
    public void gettextvsgetattributevalue() {
	try {
		
		//getText()  return only inner text present
		
		// getAttribute returns spicifed attributes like id name value etc
		
		driver.get("https://demo.nopcommerce.com/login");
		
		WebElement email = driver.findElement(By.id("Email"));
		WebElement computer = driver.findElement(By.linkText("Computers"));
		
		email.sendKeys("admin");
		
		System.out.println("Get Attribut method : "+email.getAttribute("value"));
		System.out.println("Get Text method"+email.getText());
		
		System.out.println("Get Attribut method : "+computer.getAttribute("value"));
		System.out.println("Get Text method: "+computer.getText());
		
		logger.log(Status.PASS, new Object(){}.getClass().getEnclosingMethod().getName() + " Passed");
		}
		catch(Exception e) {
			logger.log(Status.FAIL, new Object(){}.getClass().getEnclosingMethod().getName()+ " failed");
			logger.fail(e.getMessage());
		}
	}
}