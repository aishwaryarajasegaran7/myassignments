package Assignment_week4_day1;

import java.util.ArrayList;
import java.util.List;

public class comparingtwolists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1= {3,2,11,4,6,7}; //array1
		int[] array2= {1,2,8,4,9,7};//array2
		List<Integer> list1=new ArrayList<Integer>();//Declaring the empty integer list for the array 1
		List<Integer> list2=new ArrayList<Integer>();//Declare the empty integer list for the array2
		System.out.print("The mutual values are: ");
		for(int i=0;i<array1.length;i++)
		{
			list1.add(array1[i]); //addding array 1 values to the list 1
			list2.add(array2[i]); //adding array 2 values to the list 2
			if(list2.contains(list1.get(i))) //comparing the values of array 1 to array2
			{
				System.out.print(list1.get(i)+" ");//printing the mutual values 
			}
		}
		

	}


}
