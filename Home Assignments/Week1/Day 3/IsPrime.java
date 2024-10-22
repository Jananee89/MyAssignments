package week1.day3;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=13;
		int count=0;
		if(n==0||n==1) {
			System.out.println(n+" :Number is neither prime nor composite");
			return;
		}
		for(int i=2;i<=n;i++) {
			if(n%i==0)
				count++;
			
		}
		if(count<2) {
			System.out.println(n+ ":Number is Prime");
		}
		else {
			System.out.println(n+":Number is not Prime");
		}
	}

}
