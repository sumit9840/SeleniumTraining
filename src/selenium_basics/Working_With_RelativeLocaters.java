package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Working_With_RelativeLocaters {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(RelativeLocator.with(By.tagName("input"))
				.toLeftOf(By.xpath("//input[@type='submit']"))).sendKeys("Books");
		//click on search button
		driver.findElement(RelativeLocator.with(By.tagName("input"))
				.toRightOf(By.name("q"))).click();
		driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).click();
		//click on signup testfield
		driver.findElement(RelativeLocator.with(By.tagName("input"))
				.above(By.xpath("//input[@type='button']"))).sendKeys("abcd@gmail.com");
		//click on subscribe
		driver.findElement(RelativeLocator.with(By.tagName("input"))
				.below(By.id("newsletter-email"))).click();
		//click on Login link using near () locator
		driver.findElement(RelativeLocator.with(By.tagName("a"))
				.near(By.linkText("Register"))).click();
	}

}
