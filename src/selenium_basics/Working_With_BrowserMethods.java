package selenium_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_BrowserMethods {
	public static void main(String[] args) throws InterruptedException {
		//Launch a chrome browser
		//selenium 4.12.0
		//Create an object of ChromeDriver class
		//ChromeDriver driver=new ChromeDriver();
		//Upcasting to WebDriver
		WebDriver driver=new ChromeDriver();
		//navigate to URL 
		driver.get("https://www.google.com/");
		//Print the title of the url
		String title = driver.getTitle();
		System.out.println(title);
		
		//get current url
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		//get Page source
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		Thread.sleep(3000);
		//Close browser
//		driver.close();
		
		//Navigate to another url
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.quit();
		
	}

}
