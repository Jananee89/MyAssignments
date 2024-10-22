package week1.day4;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,4,3,2,8,6,7};
		int arrlen=a.length;
		System.out.println("Array length is " +arrlen);
		
		int n=arrlen+1;
		int sum=(n*(n+1))/2;
		System.out.println(sum);
		
		//Arrays.sort(a);
				
		for (int i=0;i<arrlen;i++) {
			sum=sum-a[i];	
			
			
			}
		System.out.println("Missing element is: " +sum);
		}
	}


