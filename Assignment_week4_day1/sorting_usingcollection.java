package Assignment_week4_day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sorting_usingcollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] companies={"HCL", "Wipro", "Aspire Systems", "CTS"}; //Taking the string array
		List<String> company_list=new ArrayList<String>(); //Declare the empty list
		for(int i=0;i<companies.length;i++) //iterate the string and add the string values to the list of strings
		{
			company_list.add(companies[i]);
		}
		Collections.sort(company_list); //sorting the list ascending order
		System.out.print("The reverse order of the string is : ");
		for(int j=company_list.size()-1;j>=0;j--) //iterating backwards
		{
			System.out.print(company_list.get(j)+","); //printing in the reverse order
		}
		


	}

}
