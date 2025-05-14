package assignment_week3_string_day1;

public class reversetheoddwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester"; 
		String[] split_test=test.split(" ");//splitting the string based on space delimiter
		
		for(int i=0;i<split_test.length;i++)//iterating the string array
		{   
			if(i%2!=0)//finding the word that is present in the odd position
			{   String rev="";//declare the empty string
				char[] chararray=split_test[i].toCharArray();//converting the odd position word to the char array
				for(int z=chararray.length-1;z>=0;z--) //iterating the odd position word
				{
					rev=rev+chararray[z]; //reversing the odd position word
				}
				System.out.print(rev+ " ");//printing the odd position word
			}
			else
			{
				System.out.print(split_test[i]+" ");//printing the word that are in the even position
			}
			
		}
	
	}

}
