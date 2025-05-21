package week4day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class windowhandles_breakouts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		Set<String> windows=driver.getWindowHandles();
	    List<String> list_windows=new ArrayList<String>(windows);
	    for(int i=1;i<list_windows.size();i++)
	    {
	    	driver.switchTo().window(list_windows.get(i));
	    	System.out.println(driver.getTitle());
	    }
	    driver.switchTo().window(list_windows.get(0));
	    driver.close();

	}

}
