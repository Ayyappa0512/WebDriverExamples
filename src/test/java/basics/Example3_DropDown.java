package basics;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

public class Example3_DropDown extends Base {
	
	
	//@Test(groups={"sanity","regression"}, enabled =true , dependsOnGroups={"",""},dependsOnMethods ="",dataProvider="",invocationCount=2,expectedExceptions=NoSuchElementException.class)
	@Test
	public void defaultmethod() throws InterruptedException {
		try {
			
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div/a[@class='btn btn-black navbar-btn']")).click();
//		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement drpdownele = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p/select")));
//		WebElement drpdownele = driver.findElement(By.id("input-country"));
		

		Select drpcountry = new Select(drpdownele);
		
		drpcountry.selectByVisibleText("Cambodia");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		drpcountry.selectByValue("AUS");//Australia
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//index cant see in html starts with 0
		
		drpcountry.selectByIndex(24); // Bermuda
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		//without using select method  can also selectind done
		
		List<WebElement> Alloptions = drpcountry.getOptions();
		
		for(WebElement option : Alloptions) {
			
			if(option.getText().equals("India")) {
				option.click();
			    break;
			}
		}
		
		Thread.sleep(4000);
		logger.log(Status.PASS, new Object(){}.getClass().getEnclosingMethod().getName() + " Passed");
		}
		catch(Exception e) {
			logger.log(Status.FAIL, new Object(){}.getClass().getEnclosingMethod().getName()+ " failed");
			logger.fail(e.getMessage());
		}
	}

	
	//generic method
	
	 public void selectoptionfromlist(WebElement ele, String value) {
		 
		 Select drp = new Select(ele);
		 List<WebElement> Alloptions = drp.getOptions();
			
			for(WebElement option : Alloptions) {
				
				if(option.getText().equals(value)) {
					option.click();
				    break;
				}
			}
	 }
}
