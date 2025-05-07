package week1.day2;
//Break out session - Day 2 session 2
public class Browser {
	public String launchBrowser(String browserName)
	{   //returning browser name to the main method upon calling this method from main using the object created
		System.out.println("Browser launched successfully");
		return browserName;
	}
	public void loadUrl()
	{   //printing url information inside the load url  method upon calling this method from main using the object created
		System.out.println("Application url loaded successfully");
	}


	public static void main(String[] args) {
		Browser br=new Browser();      //creating object for the class Browser
		String printing_browser=br.launchBrowser("Chrome"); //calling the launchBrowser method using the object and storing it in a variable
		System.out.println(printing_browser); //printing the return value of the method launchBrowser
		br.loadUrl(); //calling the loadUrl using the object created
		
	}

}
