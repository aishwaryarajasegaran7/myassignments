package week1.day2;

public class IsPrimeNumber {
   
	public static void main(String[] args) {
		int count=0,number=13; //declaring count and the input number
       for(int i=1;i<=number;i++) //initializing the loop to check till the input value and iterate through all the value
       {
    	   if((number%i)==0)//checking all the divisible by the number till 13
    	   {
    		   count=count+1; //increasing the count if its divisible by the number
    	   }
    	   
       }
       if(count==2)
       {
    	   System.out.println("The number "+number+ " is prime"); //if the count is 2(the divisor is one and the number itself) it prints prime
       }
       else {
    	   System.out.println("The number "+number+ " is not prime");//if the input number is divider more than 2 number , its non prime
       }
	}

}
