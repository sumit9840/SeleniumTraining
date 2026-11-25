package selenium_basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_With_SelectClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://demowebshop.tricentis.com/");
         driver.findElement(By.linkText("Books")).click();
         //sort by dropdown
         WebElement sort = driver.findElement(By.id("products-orderby"));
         Select select1 = new Select(sort);
         select1.selectByVisibleText("Price: Low to High");
         Thread.sleep(1000);
         //display dropdown
         WebElement display = driver.findElement(By.name("products-pagesize"));
         Select select2 = new Select(display);
         select2.selectByIndex(2);
         Thread.sleep(1000);
         //viewAs dropdown
         WebElement view = driver.findElement(By.id("products-viewmode"));
         Select select3 = new Select(view);
         select3.selectByVisibleText("List");
         //get option in sortby
         Thread.sleep(2000);
         WebElement sort1 = driver.findElement(By.id("products-orderby"));
         Select select4 = new Select(sort1);
         List<WebElement> value1 = select4.getOptions();
         for(WebElement element:value1) {
        	 System.out.println(element.getText());
         }
         //getoptions in display
         WebElement sort2 = driver.findElement(By.id("products-pagesize"));
         Select select5 = new Select(sort2);
         List<WebElement> value2 = select5.getOptions();
         for(WebElement element:value2) {
        	 System.out.println(element.getText());
         }
           
	}

}
