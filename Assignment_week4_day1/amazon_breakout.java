package Assignment_week4_day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon_breakout {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); //maximizing the browser
		Thread.sleep(2000);
		driver.navigate().refresh(); //this code is not working, need to check with mentor
		driver.get("https://www.amazon.in/");//Launching the URL
		Thread.sleep(5000);//wait till the page loads
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("phones"); //search the phone in the search box
		driver.findElement(By.id("nav-search-submit-button")).click(); //clicking on the enter button upon giving input phone in the search box
	    List<WebElement> elements= driver.findElements(By.xpath("//span[@class='a-price-whole']"));	//Taking the list of mobile phones price
	    List<Integer> int_list=new ArrayList<Integer>(); //Declare the integer list , by default we get the string list
	    for (WebElement webElement : elements)
	    { 
	    	String string_price=webElement.getText(); //getting each string values
	    	String new_string=string_price.replaceAll(",",""); //replace the , in the string and put it in the another new string
            int int_value=Integer.parseInt(new_string); //converting the replaced value into the integer
	        int_list.add(int_value); //add the integer value to the integer list
	        
	    	
	   
		
		}
	    System.out.println(int_list); //Pricing the integer list which contains prices
	    System.out.print("The size of the list is:");
	    System.out.println(int_list.size()); //printing the size of the list
	    System.out.println("The lowest mobile price is: " + Collections.min(int_list)); //printing the minimum value in the list
	    System.out.println("The highest mobile price is: " + Collections.max(int_list)); //printing the maximum value in the list
	    Thread.sleep(5000);
	    driver.close();//closing the browser
	   
	}
	

}

