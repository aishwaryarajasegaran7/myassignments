package Assignment_week3_day2_Q1;

public class WebElement {
    public static void click()
    {
     System.out.println("click method ------> Base class Webelement");
    }
    public static void setText(String text)
    {
    	System.out.println(text+"settext method ----------> Base class Webelement");
    }
	public static void main(String[] args) {
	
		WebElement w=new WebElement();
		w.click();
		w.setText(null);
	 
	
	}

}
