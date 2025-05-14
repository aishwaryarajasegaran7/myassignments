package assignment_week3_string_day1;

public class changeoddindex_touppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String test="changeme";
       char[] array=test.toCharArray();//converting the string to char array
       for(int i=0;i<array.length;i++)//iterating the char array
       {
    	   if((i%2)!=0)//finding the odd index of the char array
    	   {
    		
    		System.out.print(Character.toUpperCase(array[i])); //converting the odd index to the uppercase using character class method toUpperCase
    		  		   
    	   }
    	   else {
    	System.out.print(array[i]);////printing the positions other than odd in the array
    	   }
    	  
       }
    
	}

}
