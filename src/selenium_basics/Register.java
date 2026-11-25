package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.name("FirstName")).sendKeys("sumit");
		driver.findElement(By.name("LastName")).sendKeys("soni");
		driver.findElement(By.id("Email")).sendKeys("abcd@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("secret");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("secret");
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		Thread.sleep(2000);
		driver.quit();

	}

}
