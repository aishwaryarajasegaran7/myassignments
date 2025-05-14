package assignment3_week3_array_day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {1,4,3,2,8,7};
		//output: 5
		Arrays.sort(num);
		int length_num=num.length;
		int max_value=num[length_num-1];
		int min_value=num[0];
	    for(int i=min_value;i<=max_value;i++)//iterating from min value to max value
	    {
	    	for(int j=0;j<num.length;j++)//iterating the given array
	    	{
	    		if(i==num[j])//checking the first array value is equal to the second array value, if its equal then break out the loop and goes to the next i position
	    		{
	    			
	    			break;
	    		}
	    		else if((i>num[j]) && (i<num[j+1]))//when both i and num[j] not equal, check this condition
	    		{
	    			System.out.println(i); //print the missing value
	    		}
	    		else {
	    			
	    		}
	    		
	    	  
	    	}
	  
	    }
	}

}
