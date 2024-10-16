package week1.day3;

import java.util.Arrays;

public class PrintDuplicateValues {

	public static void main(String[] args) {
		int num[]= {2,3,2,7,5,5,7,9};
		int arrLength=num.length;
		System.out.println("array length is: "+arrLength);
		
		System.out.println("Original array is:");
		for(int a=0;a<arrLength;a++) {
			System.out.println(num[a]);
		}
		
		Arrays.sort(num);
		System.out.println("Sorted array:");
		for(int b=0;b<arrLength;b++) {
			
			System.out.println(num[b]);
		}
		//System.out.println("Sorted array " +num[0]);
		System.out.println("Duplicate values:");
		for(int i=0;i<arrLength-1;i++) {
			if(num[i]==num[i+1]) {
				System.out.println(num[i]);
			}
		}
	}

}
