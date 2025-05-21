package Assignment_week4_day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class missingelements_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1={1, 2, 3, 4, 10, 6, 8}; //Declaring the array
		List<Integer> list1=new ArrayList<Integer>(); //Declaring the list
		for(int i=0;i<array1.length;i++)
		{
			list1.add(array1[i]); //add the array elements to the list1
		}
		Collections.sort(list1); //sorting the list1
		int index_max=list1.size()-1; //Finding the last index
		int max_value=list1.get(index_max);//Finding the value of the last index which is the max value of the array
		System.out.print("The duplicate values are: ");
		for(int i=1;i<max_value;i++)
		{
			if(list1.contains(i))
			{
				continue; //if list1 contains duplicate value, skip
			}
			else
			{   
				System.out.print(i +" "); //printing the missing values
			}
		}
		

	}

}
