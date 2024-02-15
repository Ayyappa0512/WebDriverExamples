package webDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//		System.setProperty("Webdriver.chrome.driver", "driverpaht");

		//from selenium 4.10 onwards webdriver manager is fully integrated no need to mentions driver path or webdriver manager anymore
		WebDriver driver = new ChromeDriver();
		System.out.println("Open the Chrome browser");
		driver.manage().window().maximize();
		System.out.println("chrome window maximized");
		driver.get("https://google.com");
		Thread.sleep(3000);
		
		WebElement ele = driver.findElement(By.id("adfa"));
		
//		ele.clear()
//		ele.click()
//		ele.getAttribute("key") returns value of attribute
//		ele.getTagName();
//		ele.isDisplayed()
//		ele.isEnabled()
//		ele.isSelected()
//		ele.getCssValue()
//		ele.getLocation() returns location of the element 
//		ele.getSize() returns width and height of the element
//		ele.getRect() returns both location and size
//		int x = ele.getRect().height;
		
	}
	
}
