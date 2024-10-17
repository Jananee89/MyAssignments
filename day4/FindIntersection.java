
package week1.day4;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,2,11,4,6,7};
		int b[]= {1,2,8,4,9,7};
		
		int arrlen1=a.length;
		System.out.println("Lenght of first array:a is " +arrlen1);
		int arrlen2=b.length;
		System.out.println("Lenght of first array:b is " +arrlen2);
		
		for(int i=0;i<arrlen1;i++)
		{
			for(int j=0;j<arrlen2;j++)
			{
				if(a[i]==b[j]) {
					
					System.out.println(a[i]+ " of Array A matches with Array B " +b[j]);
				}
				
					}
		}
		
}

}
