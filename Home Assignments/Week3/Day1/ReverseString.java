package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare array a
		String a[]= {"HCL","Wipro","Aspire","CTS"};
		//length of array a
		int alen=a.length;
		//create list
		List<String> ls=new ArrayList<String>();
		for(int i=0;i<alen;i++)
		{
			//add array elements to lisy
			ls.add(a[i]);
		}
		//print list
		System.out.println("Original List:" +ls);
		//sort list and print
		Collections.sort(ls);
		System.out.println("Sorted list: " +ls);
		//reverse sorted list and print
		Collections.reverse(ls);
		System.out.println("Reverse sorted list: " +ls);
	}

}
