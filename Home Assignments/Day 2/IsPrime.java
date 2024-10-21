package week1.day2;

import java.util.Iterator;

public class IsPrime {

	public static void main(String[] args) {
		int n=17;
		System.out.println("The number is:" +n);
		int count=0;
		if(n==0 || n==1)
		{
			System.out.println(n+ " Number is neither prime not composite");
			return;
		}
		for(int i=1;i<=n;i++) {
			
			if (n%i==0) {
				count++;
			}
		}
			if (count>2) {
				System.out.println(n+ " Number is not a prime number");
			}
			else {
				System.out.println(n+ " Number is a prime number");
			}
		
		

	}

}
