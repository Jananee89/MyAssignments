package week2.day3;

public class APIClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		APIClient ob=new APIClient();
		ob.sendRequest("point1");
		ob.sendRequest("point2", "body", true);

	}
	public void sendRequest(String endp)
	{
		System.out.println("Inside sendRequest method of APIClient class");
		System.out.println("String is " +endp);
	}
	//overloading
	public void sendRequest(String endp, String reqb,Boolean stareq)
	{
		System.out.println("Inside sendRequest method of APIClient class");
		System.out.println("String is " +endp); 
		System.out.println("Request body is "+reqb); 
		System.out.println("Request status is " +stareq); 
		
	}
}
