package week1.day2;

public class Solution {

		public static int isPrime(int num) {

			// Write your code here	
			
			//prime methos with return type as int
	      int count=0;
	     
			if(num==0 || num==1)
			{
				System.out.println(num+ " Number is neither prime not composite");
				return num;
			}
	      for(int i=2;i<=num;i++)
	      {
	        if(num%i==0)
	         count++;
	      }
	      
	      if(count<2){
			
	        
	        		System.out.println( num+ "number is prime");
	        		return num;
	      }
	      else{
	      
	      System.out.println(num+ "number is not prime");
	      return num;
	        }

		}
	  public static void main(String[] args){
	  
	    Solution obj=new Solution();
	    obj.isPrime(16);
	    
	 
	}

}
