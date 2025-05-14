package assignment3_week3_array_day1;

import java.util.Arrays;

public class Intersection {
	public static void main(String[] args) {
		
		
		 int a[]={3,2,11,4,6,7}; 
         int b[]={1,2,8,4,9,7}; 
         Arrays.sort(a);//sorting the a array
         Arrays.sort(b);//sorting the b array
         for(int i=0;i<a.length;i++)//iterating the first array
         {
        	 for(int j=0;j<b.length;j++)//iterating the second array
        	 {
        		 if(a[i]==b[j])//if first array value is equal to the second array value
        		 {
        			 System.out.println(a[i]);//print the mutual values
        		 }
        	 }
         }
	}
	
}
