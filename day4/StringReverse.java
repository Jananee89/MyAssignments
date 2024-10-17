package week1.day4;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String("Jananee");
		char[] charArray=str.toCharArray();
		System.out.println(charArray);
		int len= charArray.length;
		System.out.println(len);
		for(int i=len-1;i>=0;i--)
		{
			System.out.print(charArray[i]);
		}
		

	}

}
