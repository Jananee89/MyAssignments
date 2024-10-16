package week1.day2;

public class LearnSwicthCase {

	public static void main(String[] args) {
		int day=5;
		
		if (day>0) {
				System.out.println(day + " Number is positive");
				
		}else if(day<0) {
			System.out.println(day + " Number is negative");
		}
			else {
				System.out.println(day + " Number is neutral");
			}
		
		switch (day) {
		case 1:
			System.out.println("The day is Monday");
			break;
		case 2:
			System.out.println("The day is Tuesday");
			break;	
		case 3:
			System.out.println("The day is Wednesday");
			break;
		case 4:
			System.out.println("The day is Thursday");
			break;
		case 5:
			System.out.println("The day is Friday");
			break;
		default:
			System.out.println("Its a weekend");
			break;
		}
	}

}
