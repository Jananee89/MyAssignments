package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare array
		int a[]= {3,2,11,4,6,7};
		//length of array a and print
		int alen=a.length;
		System.out.println("Length is: " +alen);
		//create a list ls
		List<Integer> ls=new ArrayList<Integer>();
		//add the values of array to a list
		for(int i=0;i<alen;i++)
		{
			ls.add(a[i]);
		}
		//print the list
		System.out.println("List is: " +ls);
		//sort the list into a collection
		Collections.sort(ls);
		//print the sorted list
		System.out.println("Sorted list is: " +ls);
		//size of list
		int lsize=ls.size();
		System.out.println("List size: " +lsize);
		//print the 2nd element from last in the list
		int el=ls.get((ls.size())-2);
		System.out.println("2nd element from last is: " +el);
	
		
	}

}
