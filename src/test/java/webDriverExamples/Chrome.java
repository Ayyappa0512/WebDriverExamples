package webDriverExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Chrome {

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
		driver.close();
	}
	
	@Test
	public void openBrowser() {
		
		//from selenium 4.10 onwards webdriver manager is fully integrated no need to mentions driver path or webdriver manager anymore
		try{
		System.out.println("================Execution Started================");
		WebDriver driver = new ChromeDriver();
		System.out.println("Open the Chrome browser");
		driver.manage().window().maximize();
		System.out.println("Chrome window maximized");
		driver.get("https://google.com");
		Thread.sleep(3000);
//		driver.findElement(By.id("hello")).click();
		driver.close();
		System.out.println("================Execution Ended==================");
		}
		catch(Exception e) {
			e.printStackTrace(); // prints the stack records of the exception which includes program subroutines, subroutines are used to debug the program
			System.out.println("================================");
			System.out.println(e);
			System.out.println("================================");
			System.out.println(e.getMessage());
			System.out.println("================================");
		}
	}

}
