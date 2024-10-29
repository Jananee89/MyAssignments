package week3.day1;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare the string
		String text="We learn java basics as part of java sessions in java week1";
		//store the string in an array by splitting with space
		String split[]=text.split(" ");
		//find array length and print
		int len=split.length;
		System.out.println("Lenght is : " +len);
		//initialize count
		int count=0;
		//loop to check if 2 strings are duplicate and replace duplicate with ""
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if((split[i]).equalsIgnoreCase(split[j]))
				{
					split[j]="";
					count=1;
					
				}
			}
		}
		
		//check if duplicates are replaced with "" based on count and print
			if(count==1) {
				for(int k=0;k<len;k++) {
					System.out.print(split[k] + " ");
					
				}	
		}
			
			
			}

}
