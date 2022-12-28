package week1.day2;

public class LearnIf {
	public static void main(String[] args) {
		int age=12;
		if (age>=18 && age==18) {
			System.out.println("You are Eligible for Vote");		
		}
		else if(age!=18 && age<=18){
			System.out.println("You are Not Eligible for Vote");
		}
		else if(age>=18 || age<=18)
			System.out.println("You are Eligible for Vote");
		else {
		System.out.println("You are not Eligible for vote");
		
	}
	}
}

