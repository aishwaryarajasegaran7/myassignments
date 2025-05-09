package week2day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Assignment1_createaccount_week2day2 {

	public static void main(String[] args) {
		String accountname="Aishwaryarajasegarann";
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
		driver.findElement(By.id("accountName")).sendKeys("Aishwaryarajasegareann");//giving the account name
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");//giving the description 
		WebElement industryname = driver.findElement(By.name("industryEnumId"));//getting the webelemtn of industryname
		Select selecting_industryname= new Select(industryname);//instantiate the select class by passsing the dd webelement to the select constructor
		selecting_industryname.selectByIndex(3);//selecting by index for the industry name as computer software
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select selecting_ownership= new Select(ownership);
		selecting_ownership.selectByVisibleText("S-Corporation");
		
		WebElement ownership1 = driver.findElement(By.name("ownershipEnumId"));
		Select selecting_ownership1= new Select(ownership1);
		selecting_ownership1.selectByVisibleText("S-Corporation");
		
		WebElement source = driver.findElement(By.name("dataSourceId"));
		Select source_selecting= new Select(source);
		source_selecting.selectByValue("LEAD_EMPLOYEE");
		
		WebElement marketing=driver.findElement(By.id("marketingCampaignId"));
		Select marketing_selecting= new Select(marketing);
		marketing_selecting.selectByIndex(6);
		
		WebElement state=driver.findElement(By.id("generalStateProvinceGeoId"));
		Select state_selecting=new Select(state);
		state_selecting.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		
	
		String getting_text=driver.findElement(By.xpath("//table[@class='fourColumnForm']/tbody/tr/td[2]/span")).getDomAttribute("value");
		System.out.println(getting_text);
		
		//How to check this step-- need to check with Mentor: Verify that the account name is displayed correctly.

		driver.close();
		
		
	}

}
