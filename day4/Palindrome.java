package week1.day4;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1231321, rnum=0, remainder;
		int orgNum=num;
		while(num>0) {
			remainder=num%10;
			rnum=rnum*10+remainder;
			num=num/10;
			
		}
		if(orgNum==rnum) {
			System.out.println(orgNum+ " is a palindrome");
		}
		else
		{
			System.out.println(orgNum+ "is not a palindrome");
		}
		
		
		
	}

}
