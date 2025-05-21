package Assignment_week4_day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class window_handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	  ChromeOptions options = new ChromeOptions();
	  options.addArguments("guest");
      ChromeDriver driver=new ChromeDriver(options);
      driver.get("http://leaftaps.com/opentaps/");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
      driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
      driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
      driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	  driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();
	  driver.findElement(By.xpath("//a[text()='Contacts']")).click();
	  driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
	  driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
	  Thread.sleep(4000);
	  Set<String> windows=driver.getWindowHandles();
	    List<String> list_windows=new ArrayList<String>(windows);
	    System.out.print("The From contacts title page is: ");
	    for(int i=1;i<list_windows.size();i++)
	    {
	    	driver.switchTo().window(list_windows.get(i));
	    	System.out.println(driver.getTitle());
	    	 driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
	    	

	    }
	    driver.switchTo().window(list_windows.get(0));
	    driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	    System.out.print("The To contacts title page is: ");
	    Set<String> windowss=driver.getWindowHandles();
	    List<String> list_windowss=new ArrayList<String>(windowss);
	    for(int i=1;i<list_windowss.size();i++)
	    {
	    	driver.switchTo().window(list_windowss.get(i));
	    	
	    	Thread.sleep(2000);
	    	System.out.println(driver.getTitle());
	    	driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
	    	
	    }
        
	    driver.switchTo().window(list_windows.get(0));
	  driver.quit();
	}

}
