package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_WebelementMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("mobiles");
        Thread.sleep(1000);
        driver.findElement(By.name("q")).clear();
        Thread.sleep(1000);
        driver.findElement(By.name("q")).sendKeys("Books");
        driver.findElement(By.xpath("//input[@type='submit']")).submit();
        //Webelement getters method
        String text = driver.findElement(By.linkText("Register")).getText();
        System.out.println(text);
        String att = driver.findElement(By.name("q")).getAttribute("value");
        System.out.println(att);
        driver.findElement(By.name("q")).sendKeys("Books");
        String att1 = driver.findElement(By.name("q")).getAttribute("value");
        System.out.println(att1);
        //get css value
        driver.findElement(By.name("q")).clear();
        String cssValue = driver.findElement(By.xpath("//input[@value='Search store']")).getCssValue("width");
        System.out.println(cssValue);
        Thread.sleep(2000);
        if(driver.findElement(By.xpath("//input[@value='Search store']")).isDisplayed()) {
        	driver.findElement(By.xpath("//input[@value='Search store']")).sendKeys("Books");
        }
        Thread.sleep(2000);
        if(driver.findElement(By.xpath("//input[@value='Search']")).isEnabled()) {
        	driver.findElement(By.xpath("//input[@value='Search']")).click();
        }
       // driver.close();
	}

}
