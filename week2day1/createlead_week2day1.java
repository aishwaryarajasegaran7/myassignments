package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class createlead_week2day1 {

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
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aishwarya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajasegaran");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Title of the page");
		driver.findElement(By.name("submitButton")).sendKeys("Title of the page");
		String titleofthepage = driver.getTitle();
		System.out.println(titleofthepage);
		if(titleofthepage=="View Lead | opentaps CRM")//verifying the title of the page
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}
		driver.close();
		
		
		
	}

}
