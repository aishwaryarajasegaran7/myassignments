package week1.day2;
//Breakout session- day2 session 2
public class EdgeBrowser {

	public static void main(String[] args) {
		
		Browser obj_browser = new Browser(); //creating the object for the different class(Browser) within the same package
		System.out.println(obj_browser.launchBrowser("Edge"));//calling and printing the return value of the launchBrowser from the different class within the same package
		obj_browser.loadUrl(); //calling the loadUrl from different class within same package using the object created in this class

	}

}
