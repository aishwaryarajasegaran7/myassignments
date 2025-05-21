package Assignment_week4_day1;

public class APIClient {
    public void sendRequest(String  endpoint)//Creating the first method  by passing single arguments
    {
    	System.out.println("The endpoint value is: "+endpoint);
    	
    }
   
    public void sendRequest(String endpoint, String requestBody, boolean requestStatus)//creating the second method by passing three arguments
    {
    	System.out.println("The endpoint value is inside the second method: "+ endpoint);
    	System.out.println("The request body inside the second method: "+requestBody);
    	System.out.println("The request status inside the second method: "+requestStatus);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        APIClient api=new APIClient(); //creating object for the class APIClient
        api.sendRequest("amazon.in"); //passing the string values for the first methods
        api.sendRequest("PVR cinemas", "request body is having some values", false); //passing the three arguments for the second methods

}
}