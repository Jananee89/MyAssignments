package week3.day1;

public class OddIndextoUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt="changeme";
	
		int len=txt.length();
		
		for(int i=0;i<len;i++) {
			char word=txt.charAt(i);
			
			if(i%2!=0)
			{
			System.out.print(Character.toUpperCase(word));
					
			}
			else
			{
				System.out.print(Character.toLowerCase(word));
			}
			
		}
		
		
		


	}

}
