package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class createaccount_week2da1 {

	public static void main(String[] args) {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("guest");
	ChromeDriver driver=new ChromeDriver(options);//Initializing chrome driver
	driver.get("http://leaftaps.com/opentaps/"); //launching the URL
	driver.manage().window().maximize();//maximizing the current browser window
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");//sending the username to the username field
	driver.findElement(By.id("password")).sendKeys("crmsfa");//sending the password to the password field
	driver.findElement(By.className("decorativeSubmit")).click();//clicking on login button
	driver.findElement(By.partialLinkText("SFA")).click();//clicking on CRM/SFM link
	driver.findElement(By.linkText("Create Account")).click();//clicking on create account
	driver.findElement(By.id("accountName")).sendKeys("Aishwarya");//giving the account name
	driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");//giving the description 
	driver.findElement(By.id("numberEmployees")).sendKeys("5");//giving the number of employees details
	driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");//giving the official site details
	driver.findElement(By.className("smallSubmit")).click();//clicking on submit
	String title = driver.getTitle();//getting the title of the current page
	System.out.println(title);//printing the current title
	if(title=="Create Account | opentaps CRM")//verifying the title of the page
	{
		System.out.println("Passed");
	}
	else
	{
		System.out.println("Failed");
	}
	//This if condition fails-- need to checks with mentor, it should be passed when it goes into the if condition

	driver.close();//closing the window

	}

}
