package interactionWithUser;
import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HotelFee {
	
	/*Potem napisz taki program: użytkownik podaje swój wiek i ile nocy spędzi w hotelu, a program
	wylicza, ile trzeba zapłacić. Zasady są takie:
	- nieletni (poniżej 18 roku życia) płacą 100 zł za noc
	- dorośli (ci, którzy mają przynajmniej 18 lat ale mniej niż 65 lat) płacą:
	    - 200 zł za noc, jeśli nocują jedną noc
	    - 180 zł za noc, jeśli nocują przynajmniej dwie ale mniej niż pięć nocy
	    - 150 zł za noc, jeśli nocują pięć lub więcej nocy
	- emeryci (ci, którzy mają przynajmniej 65 lat), płacą jak dorośli, ale z 10% zniżki
	*/

	public static void main(String[] args) {
		
		int age =0;
		int numberOfNights = 0;
		BigDecimal Fee = new BigDecimal(0);
		Double Discount = 10.0;
		Scanner sc = new Scanner(System.in);
		BigDecimal priceForChildren = new BigDecimal(100);
		BigDecimal priceForAdultOneNight = new BigDecimal(200);
		BigDecimal priceForAdultTwoToFiveNights = new BigDecimal(180);
		BigDecimal priceForAdultOverFiveNights = new BigDecimal(150);
		
		boolean ageCondition = true;
		try {
			while (ageCondition ) {
				
				System.out.println("Enter age:");
				age = sc.nextInt();
				if (age < 1) {
					System.out.println("Enter correct value");
				}
				else {
					ageCondition = false;
				}
			}
		}catch (InputMismatchException e) {
			System.out.println("Incorrect value");
		}
		
		boolean numberOfNightsCondition = true;
		try {
			while (numberOfNightsCondition) {
				System.out.println("How many nights?");
				numberOfNights = sc.nextInt();
				if (numberOfNights < 0) {
					System.out.println("Enter correct value");
				}
				else {
					numberOfNightsCondition = false;
				}
				
			}
		} catch (InputMismatchException e) {
			System.out.println("Incorrect value");
		}
		
		if (age < 18) {
			Fee = priceForChildren.multiply(BigDecimal.valueOf(numberOfNights));
		}
		else {
			if (numberOfNights == 1) {
				Fee = priceForAdultOneNight.multiply(BigDecimal.valueOf(numberOfNights));
			}
			else if (numberOfNights > 5) {
				Fee = priceForAdultOverFiveNights.multiply(BigDecimal.valueOf(numberOfNights));
			}
			else {
				Fee = priceForAdultTwoToFiveNights.multiply(BigDecimal.valueOf(numberOfNights));
			}
		}
		
		if (age > 65) {
			Fee = Fee.subtract(Fee.multiply(BigDecimal.valueOf(Discount*0.01)));
		}
		
		
		
		System.out.println("Total cost: " + Fee);

	}

}
