package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_Actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://demowebshop.tricentis.com/");
         //create object of action class
         Actions a = new Actions(driver);
         WebElement computer = driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));
         a.moveToElement(computer).perform();
         WebElement desktop = driver.findElement(By.xpath("(//a[contains(text(),'Desktops')])[1]"));
         a.moveToElement(desktop).click().perform();
         
	}

}
