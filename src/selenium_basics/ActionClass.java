package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		Actions a = new Actions(driver);
		WebElement doubleclick = driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
		a.doubleClick(doubleclick).build().perform();
		driver.switchTo().alert().accept();
		//right click
		WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
		a.contextClick(rightclick).perform();
		driver.findElement(By.xpath("//span[text()='Edit']")).click();
		driver.switchTo().alert().accept();
		
		
		

	}

}
