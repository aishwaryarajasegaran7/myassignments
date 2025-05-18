package Week4.day1_Breakouts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon_breakout {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("phones");
		driver.findElement(By.id("nav-search-submit-button")).click();
	    List<WebElement> elements= driver.findElements(By.xpath("//span[@class='a-price-whole']"));	
	    for (WebElement webElement : elements) {
	    	System.out.println("The price is:" +webElement.getText());
			
		}
	    driver.close();
	}
	

}

