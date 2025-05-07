package week1.day2;

public class Fibseries {

	public static void main(String[] args) {
		int input_range=8; //setting the input range 
		int first_num=0,second_num,third_num; //initialize the first num to 0, second num and third num
	    second_num=1; //initialize the second number to 1
	    System.out.print("The values of fibonacci series is: ");
		for(int i=1;i<=input_range;i++) //intialize the for loop and iterate till the input range
		{
	   	third_num=first_num+second_num; //adding first and second number
		System.out.print(first_num+ " "); //printing the first number
		first_num=second_num; //assigning the second number to the first number as an input to the next iteration of the loop
		second_num=third_num; //assigning the third number to the second number as an input to the next iteration of the loop		
		}
		

	}

}
