package Week4.day1_Breakouts;

public class reportStep {
	int a=4;
	public void function1(String message, String status)
	{
		System.out.println(message);
		System.out.println(status);
	}
	public void function1(String message,String status,boolean snap)
	{
		System.out.println(message+"in method2");
		System.out.println(status+"in method2");
		System.out.println(snap+"in method2");
		
	}
	public void takeSnap()
	{   
		System.out.println("Taking the snap");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      reportStep r= new reportStep();
      r.function1("This is the message","This is the status");
      r.function1("Second method","status in method 2",true);
      r.takeSnap();
	}

}
