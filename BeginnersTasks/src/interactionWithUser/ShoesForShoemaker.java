package interactionWithUser;

import java.util.Scanner;

public class ShoesForShoemaker {

	public static void main(String[] args) {
		int dayOfWeekShoesIn;
		int repairTime;
		int dayOfPickUp;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("When shoes were given to shoemaker? Choose day:"
				+ "\n1. Monday"
				+ "\n2. Tuesday"
				+ "\n3. Wednesday"
				+ "\n4. Thursday"
				+ "\n5. Friday"
				+ "\n6. Saturday"
				+ "\n7. Sunday");
		
		dayOfWeekShoesIn = sc.nextInt();
		if (dayOfWeekShoesIn >= 1 && dayOfWeekShoesIn <= 7) {
			
		} 
		else {
			System.out.println("Enter correct value");
		}
		
		System.out.println("How long will the repair take?");
		repairTime = sc.nextInt();
		
		if (repairTime>0) {
			
		} 
		else {
			System.out.println("Enter correct value");
		}
		
		
		dayOfPickUp = (dayOfWeekShoesIn + repairTime)%7;
		System.out.println("Shoes will be returned in " + repairTime + " days on " + dayOfReturn(dayOfPickUp));

	}
	
	static String dayOfReturn(int dayOfPickUp) {
		
		
		
		switch (dayOfPickUp) {
		case 0: return "Sunday";
		case 1: return "Monday";
		case 2: return "Tuesday";
		case 3: return "Wednsday";
		case 4: return "Thursday";
		case 5: return "Friday";
		case 6: return "Saturday";
		default: return  "Enter correct value.";
		}
	}
	
	

}
