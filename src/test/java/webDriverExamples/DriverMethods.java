package webDriverExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethods {

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
		
		//driver.get("") for open any web site using url as strinng
		//driver.navigate(). to, forward, backward refresh
		
//		driver.findElement() returns web element by using given locator
//		driver.findElements(null) returns list of webElements
		
		
//		driver.getCurrentUrl()  return current url
//		driver.getPageSource() returns Html Dom page score
//		driver.getTitle() returns title of the page
//		driver.getWindowHandle()  returns current window handle identifier
//		driver.getWindowHandles() returns a set which contains all the current window handles identifies 
//		window handles used to switch between the windows
		
//		driver.switchTo() we can switch to alert, frames, windows 
		
//		driver.switchTo().alert(). we are switching to alert and then accepting / rejecting
//		driver.switchTo().alert() sendkeys and getText
		
//		driver.switchTo().frame( )  input value index, name or id, element
		
//		driver.switchTo().window(null) switch to windows
		
		//Select Class for drop down
		
		// actions class
		
//		driver.manage().  can addCookie, deleteCookie deleteAllCookies getCookieNamed
//		driver.manage().timeouts().implicitlyWait(null) implicit wait
		
//		driver.quit();
		driver.close();
	}
	
}
