package week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array a
		int a[]= {3,2,11,4,6,7};
		//Length of array a
		int alength=a.length;
		System.out.println("Array a length :" +alength);
		//Sort array a and print
		Arrays.sort(a);
		System.out.println("Sorted array a:");
		for(int i=0;i<alength;i++) {
			
			System.out.println(a[i]);
		}
		
		//Array b
		int b[]= {1,2,8,4,9,7};
		//Length of array b
		int blength=b.length;
		System.out.println("Array b length :" +b.length);
		//Sort array b and print
		Arrays.sort(b);
		System.out.println("Sorted array b:");
		for(int j=0;j<blength;j++) {
			
			System.out.println(b[j]);
		}
		
		//Create a list ls to store the intersected array elements
		List<Integer> ls=new ArrayList<Integer>();
		
		for(int k=0;k<alength;k++)
		{
			for(int l=0;l<blength;l++)
			{
				//compare for intersection
				if(a[k]==b[l])
				{
					System.out.println("Array value is same " +a[k]);
					//add the intersected elements to list
					ls.add(a[k]);
					break;
				}
				else
				{
					System.out.println("Array value is not same");
					
				}
	
			}
		}
		//print the list of intersected elements
		System.out.println("Intersected numbers are: " +ls);
		
	}

}
