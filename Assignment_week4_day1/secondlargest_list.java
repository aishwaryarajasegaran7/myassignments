package Assignment_week4_day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class secondlargest_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1={3, 2, 11, 4, 6, 7}; //array input
		List<Integer> list1=new ArrayList<Integer>(); //Declare the empty list of type integer
		for(int i=0;i<array1.length;i++)
		{
			list1.add(array1[i]); //adding the each integer array value to the list
			
		}
		Collections.sort(list1); //sort the list
		int size_list1=list1.size()-2;//getting the index of the second largest values upon sorting
		System.out.println("The second largest value in the list: " +list1.get(size_list1));//printing the second largest value from the list

	}

}
