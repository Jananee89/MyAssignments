package week1.day3;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range=8;
		int n1=0,n2=1,n3;
		
		for(int i=0;i<range;i++)
		{
			n3=n1+n2;
			System.out.println(n1+" ");
			n1=n2;
			n2=n3;
		}
			
	}

}
