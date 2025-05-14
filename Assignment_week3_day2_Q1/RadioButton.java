package Assignment_week3_day2_Q1;

public class RadioButton extends Button {
   public static void selectRadioButton()
   {
	   System.out.println("select radio button -------> subclass");
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    RadioButton rb=new RadioButton();
    rb.click();
    rb.selectRadioButton();
	}

}
