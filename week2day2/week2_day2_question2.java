package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class week2_day2_question2 {
	public static void main(String[] args) {
		
		ChromeOptions optionss = new ChromeOptions();
		optionss.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(optionss);
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Aishwaryaaa");
		driver.findElement(By.name("lastname")).sendKeys("Rajassegaran");
		driver.findElement(By.name("reg_email__")).sendKeys("test1@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("11241234");
		
		WebElement date=driver.findElement(By.id("day"));
		Select selecting_date=new Select(date);
		selecting_date.selectByValue("7");
		
		WebElement month=driver.findElement(By.id("month"));
		Select selecting_month=new Select(month);
		selecting_date.selectByValue("7");
		
		WebElement year=driver.findElement(By.id("year"));
		Select selecting_year=new Select(year);
		selecting_date.selectByValue("1998");
		driver.findElement(By.id("sex")).click();//unable to locate the female gender. check with mentor
		driver.close();
		
		
		
		
}
}
