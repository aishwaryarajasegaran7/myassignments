package assignment3_week3_array_day1;

import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[] num= {2,5,7,7,5,9,2,3}; //declaring the array of type int
   Arrays.sort(num);//sort the array
   System.out.print("The duplicates are: ");
  for (int i = 0,j=1; j < num.length-1; i++,j++) { //initiate the for loop and it stops when j reaches the last element of the array
	   if(num[i]==num[j]) //comparing first and the second element 
	   {
		   System.out.print(num[i]+" ");//printing the duplicates
		  
		  
	   }
	
}
  }

	  
	

	}


