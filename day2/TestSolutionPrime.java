package week1.day2;

public class TestSolutionPrime {
	
		public static boolean isPrime(int num) {

			// Write your code here	
			
			//prime method with return type as boolean
	      int count=0;
	     if(num==0 || num==1)
	      {
	        System.out.println( num+ "number is neither prime nor composite");
	        return false;
	      }
	      for(int i=2;i<=num;i++)
	      {
	        if(num%i==0)
	         count++;
	      }
	      
	      if(count<2){
			
	        System.out.println(num+ "number is prime");
	        return true;
	       
	      }
	      else{
	      
	      System.out.println(num + "number is not prime");
	        return false;
	        }

		}
	  public static void main(String[] args){
	  
	    TestSolutionPrime obj=new TestSolutionPrime();
	    obj.isPrime(29);
	    
	  }
	}


