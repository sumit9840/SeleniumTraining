package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Locaters {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//Enter the text inside search 
		WebElement searchfield = driver.findElement(By.name("q"));
		searchfield.sendKeys("Mobiles");
		//Click on register link
		driver.findElement(By.linkText("Register")).click();
		//Click on Login link
		driver.findElement(By.linkText("Log in")).click();
		//Click on Shopping partial link text
		driver.findElement(By.partialLinkText("Shopping")).click();
		driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).click();
		//Enter the text in subscribe text field
		driver.findElement(By.id("newsletter-email")).sendKeys("test@123.com");
	}

}
