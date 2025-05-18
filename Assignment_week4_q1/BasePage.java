package Assignment_week4_q1;

public class BasePage {

	public void findElement() //creating the method findElement inside the basepage
	{
		System.out.println("Finding the element ------>Inside the first method");
	}
	public void clickElement() //creating the method clickElement inside the basepage
	{
		System.out.println("Clicking on the element --------------> Inside the first method");
	}
	public void enterText()//creating the method enterText inside the basepage
	{
		System.out.println("Entering the text------->Inside the first method");
	}
	public void performCommonTasks()//creating the method performCommonTasks inside the basepage
	{
		System.out.println("Performing the common tasks------->Inside the super class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       BasePage bp=new BasePage();//creating the object for the class basepage
       bp.findElement(); //calling the findElement method
       bp.clickElement();//calling the clickElement method
       bp.enterText();//calling the enterText method
       bp.performCommonTasks();//calling the performCommonTasks method
       
	}

}
