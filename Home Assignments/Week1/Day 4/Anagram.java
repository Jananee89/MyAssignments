package week1.day4;

import java.util.Arrays;

import net.bytebuddy.description.annotation.AnnotationValue.Sort;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str0="dormitory";
		String str1=str0.replace(" ", "");
		String str="dirty room";
		String str2=str.replace(" ", "");
		int len1= str1.length();
		System.out.println("Length of str1 is: " +len1);
		int len2= str2.length();
		System.out.println("Length of str1 is: " +len2);
		if(len1!=len2)
		{
			System.out.println("Strings length dont match");
	}
		else {
			char a[]=str1.toCharArray();
			char b[]=str2.toCharArray();
		    Arrays.sort(a);	
		    System.out.println("Sorted string1:");
		    for(int i=0;i<len1;i++)
		    {
		    	System.out.println(a[i]);
		    }
			Arrays.sort(b);
			System.out.println("Sorted string2");
			 for(int j=0;j<len2;j++)
			    {
			    	System.out.println(b[j]);
			    }
			int count=0;
			for(int k=0;k<len1;k++)
			{
				
					if(a[k]==b[k]) {
						count++;
					}
					
				}
			if(count==len1)
			{
				System.out.println("The given strings are an Anagram");
			}
			else
			{
				System.out.println("The given strings are not an Anagram");
			}
			
		}
}
}
