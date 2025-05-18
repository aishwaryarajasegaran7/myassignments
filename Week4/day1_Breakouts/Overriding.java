package Week4.day1_Breakouts;

public class Overriding extends reportStep{
	public void takeSnap(String s)
	{
		int a=32;
		System.out.println(super.a);
		System.out.println(a);
		
		System.out.println(s);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Overriding o=new Overriding();
      o.takeSnap("Person1");
	}

}
