package Assignment3_week3_day2_Q2;

public class LoginTestData extends TestData{
    public static void enterUsername()
    {
    	System.out.println("Enter Username--------->subclass");
    }
    public static void enterPassword()
    {
    	System.out.println("Enter password------> subclass");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LoginTestData l=new LoginTestData();
      l.enterCredentials();
      l.enterPassword();
	}

}
