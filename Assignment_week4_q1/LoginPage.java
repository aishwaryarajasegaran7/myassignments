package Assignment_week4_q1;

public class LoginPage extends BasePage{
    @Override
    public void  performCommonTasks() //Overriding the method from the super class BasePage
    {
    	System.out.println("performCommonTasks inside the Sub class");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LoginPage lp=new LoginPage();//creating the object for the sub class LoginPage
      lp.performCommonTasks(); //calling the overridden method inside the subclass
      lp.clickElement();//calling the method from the super class
	}

}
