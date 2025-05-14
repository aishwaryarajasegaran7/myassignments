package Assignment_week3_day2_Q1;

public class Button extends WebElement {
    public static void submit()
    {
    	System.out.println("Submit in the Button subclass");
    }
    public static void main(String[] args) {
		Button b = new Button();
		b.submit();
		b.click();
		b.setText(null);
		
	}
}
