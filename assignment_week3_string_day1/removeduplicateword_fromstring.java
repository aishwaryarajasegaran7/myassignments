package assignment_week3_string_day1;

public class removeduplicateword_fromstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text="we learn Java basics as part of Java sessions in Java week1";
		
        String[] textarray=text.split(" ");//splitting the string into string array based on space delimiter
        String final_text=" ";//declare the empty string
        for(int i=0;i<textarray.length;i++)//iterating the array
        {  int  count=0;//declaring the count as zero
        	for(int j=0;j<textarray.length;j++)////iterating the same array
        	{
        		if(textarray[i].equals(textarray[j]))//chekcing the value in the first array is equal to the value in the second array
        				{
        			       count=count+1;//if both are same, increment the count 
        			       
        			       
        				}
        	
        	
        	}
        	if(count>1)//if count is greater than one
        	{
              
		    	
       		    final_text=final_text+textarray[i].replace(textarray[i], " ");//replace the word with the empty string
        		//its removing all the duplicates  , need to check with mentor
		    	
        	
		       
		       }
        	else {
        	
        
        		final_text=final_text+textarray[i]+" ";//if its not the duplicate, append the word to the string
        	
        	}
        
        }
    	System.out.println(final_text);//printing the final text
        
	}
}
 