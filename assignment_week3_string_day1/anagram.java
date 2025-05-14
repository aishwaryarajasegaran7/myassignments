package assignment_week3_string_day1;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1="stops";
		String text2="potss";
		int length1=text1.length();//getting the length of text1
		int length2=text2.length();//getting the length of text2
	    if(length1==length2) //checking both length are equal
	    {
	    	char[] array1=text1.toCharArray();//converting text 1 to char array1
	    	char[] array2=text2.toCharArray();//converting text2 to char array2
	    	Arrays.sort(array1);//sorting the array1
	    	Arrays.sort(array2);//sorting the array1
	    	if((Arrays.equals(array1, array2))==true)//checking if both the array are in the same order and contains same elements 
	    	{
	    		System.out.println("The given strings are Anagram");
	    	}
	    	else //if both arrays are not same 
	    	{
	    		System.out.println("The given strings are not Anagram");
	    	}
	    }
	    else//if length is not matching
	    {
	    	System.out.println("The given strings are not Anagram");
	    }
	}

}
