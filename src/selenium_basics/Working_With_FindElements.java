package selenium_basics;

import java.util.List;
import java.util.ListIterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_FindElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://demowebshop.tricentis.com/");
         List<WebElement> links = driver.findElements(By.xpath("//a"));
         for(int i=0;i<links.size();i++) {
        	 String linktext = links.get(i).getText();
        	 System.out.println(linktext);
         }
         //print attribute 
         for(WebElement ele:links) {
        	 String url = ele.getAttribute("href");
        	 System.out.println(url);
         }
         //click on radio button
           List<WebElement> radio_btn = driver.findElements(By.xpath("//input[@type='radio']"));
         for(WebElement element:radio_btn) {
        	 element.click();
        	 System.out.println(element.isSelected());
         }
         ListIterator<WebElement> itr = radio_btn.listIterator();
         while(itr.hasNext()) {
        	 itr.next().click();
        	 //System.out.println(itr.next().isSelected());
        	 
         }
         Thread.sleep(3000);
         driver.close();
	}

}
