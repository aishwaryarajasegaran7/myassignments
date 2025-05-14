package Assignment_week3_day2_Q1;

public class CheckBoxButton extends Button {
    public static void clickCheckButton()
    {
    	System.out.println("check box --------> subclass");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    CheckBoxButton cb=new CheckBoxButton();
    cb.clickCheckButton();
    cb.click();
    cb.setText(null);
	}

}
