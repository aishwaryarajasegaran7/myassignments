package Assignment_week3_day2_Q1;

public class TextField extends WebElement{
    public static void getText()
    {
    	System.out.println("Getting the text -----> Sub class---> Base class is webelement");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      TextField t=new TextField();
      t.getText();
      t.getClass();
      t.click();
	}

}
