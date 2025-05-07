package week1.day2;

public class Palindrome_check {
  public static void main(String[] args) {
	int inputt = 121; //input a number 
	String output=""; //declare the empty string in the output variable
	int input; //declaring the dummy input variable
	for(input=inputt;input>0;) //initialize the for loop with a condition of input and it obeys input >0
	{
	int q=input/10; //storing the quotient using the division operator
	int r=input%10; //storing the reminder using the modulo operator
    output= output+Integer.toString(r);  //Taking the reminder value and converting it to string and store it in the output variable on each iteration
    input = q; //storing the quotient value in the input variable
	}
	if(inputt==Integer.parseInt(output)) //inputt is a integer and output is a string so far, to compare both, converting output to integer data type
	{
		System.out.println("Number is palindrome"); //if input and output are same, printing it as a palindrome
	}
	else
	{
		System.out.println("Number is not a palindrome");//if both are not same , printing it as not a palindrome
	}
  
  }
}

