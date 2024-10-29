package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		
		//declare array a
		int a[]= {1,2,3,4,10,6,8};
		//array length and print
		int alen=a.length;
		System.out.println("Lenght of array a: " +alen);
		List<Integer> ls=new ArrayList<Integer>();
		for(int i=0;i<alen;i++) {
	
			ls.add(a[i]);
		}
		
		System.out.println(ls);
		Collections.sort(ls);
		System.out.println("Sorted list: " +ls);
		int fnum=ls.get(0);
		int lnum=ls.get(alen-1);
		System.out.println("First num: " +fnum);
		System.out.println("Last num: " +lnum);
		for(int i=fnum;i<lnum;i++) {
			if(!ls.contains(i)) {
				System.out.println("missing number not in list :" +i);
			}
		}
	}
}
