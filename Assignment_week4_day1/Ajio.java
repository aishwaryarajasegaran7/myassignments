package Assignment_week4_day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();  //Trying to launch the chrome in the incognito mode
		options.addArguments("--incognito");  
		ChromeDriver driver=new ChromeDriver(options); //Launching the chrome driver
		driver.get("https://www.ajio.com/"); //launching the ajio url
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2)); //waiting for the website to load properly
		driver.manage().window().maximize();  //maximizing the browser window
		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("bags",Keys.ENTER); //search the ajio with bags and enter
		Thread.sleep(4000); //waiting for the website to load properly
		driver.findElement(By.xpath("//label[contains(text(),'Men')]/preceding-sibling::input")).click(); //selecting the input for men
		Thread.sleep(2000);//waiting for the websit to load properly
		driver.findElement(By.xpath("//label[contains(text(),'Fashion')]/preceding-sibling::input")).click(); //selecting the fashion as input 
		Thread.sleep(2000); //waiting for the website to load properly
		String item_text=driver.findElement(By.xpath("//div[@class='length']/strong")).getText(); //getting the count of the items
		System.out.println(item_text); //printing the item count
		List<WebElement> element=driver.findElements(By.xpath("//div[@class='brand']/strong")); //getting the list of brands
		System.out.println("Printing the brands"); 
		for (WebElement webElement : element) {
			
			System.out.println(webElement.getText()); //printing the list of brands
			
		}
		List<WebElement> element1=driver.findElements(By.xpath("//div[@class='nameCls']")); //locating the bags webelements
		System.out.println("Printing the name of the bags"); 
		for (WebElement webElement1: element1) {
			System.out.println(webElement1.getText()); //printing the list of bags
		}
		

	}

}


//====================on hold due to ajio access denied issue----------unable to do this since facing frequent interruption