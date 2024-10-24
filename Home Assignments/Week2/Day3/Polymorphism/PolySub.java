package week2.day3;

public class PolySub extends PolymorphismSup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolySub ob=new PolySub();
		ob.sumS(5, 6);
		
	}
	@Override
	public int sumS(int a, int b) {
		System.out.println("this is a sum method in PolySub class");
		int temp=10;
		int c=a+b+temp;
		System.out.println("Sum is: "  +c);
		return c;
	}
}
