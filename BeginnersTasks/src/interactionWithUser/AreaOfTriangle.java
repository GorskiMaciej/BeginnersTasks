package interactionWithUser;

import static java.lang.Math.*;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Program, który odczytuje trzy liczby, sprawdza czy liczby te mogą stanowić boki trójkąta (np.z
2, 2 i 5 nie da się ułożyć trójkąta, prawa?), a jeśli mogą, oblicza pole powierzchni trójkąta o
takich bokach.
*/

public class AreaOfTriangle {
	
	public static double AreaOfTriangle(double a, double b, double c) {
		double area = 0;
		double halfOfCirciut = (a+b+c)/2;
		
		area = sqrt((halfOfCirciut) * (halfOfCirciut-a) * (halfOfCirciut - b) * (halfOfCirciut-c));
		
		return area;
		
		
	}

	public static void main(String[] args) {
		
		double sideA;
		double sideB;
		double sideC;
		double triangleArea;
		
		Scanner sc = new Scanner(System.in);
		boolean loopCondition = true;
		
		while (loopCondition) {
			try {
			System.out.println("Enter value for first side:");
			sideA = sc.nextDouble();
			System.out.println("Enter value for second side:");
			sideB = sc.nextDouble();
			System.out.println("Enter value for third side:");
			sideC = sc.nextDouble();
			
			if (sideA <= 0 || sideB <= 0 || sideC <= 0 || (sideA+sideB)<=sideC || (sideB+sideC)<=sideA || (sideA+sideC)<=sideB) {
				System.out.println("It is impossible to make triangle from loaded values.");
			}
			else {
				triangleArea = AreaOfTriangle(sideA, sideB, sideC);
				System.out.println("The triangle area is: " + triangleArea);
			}
			} catch (InputMismatchException e) {
				System.out.println("Please, enter correct values:");
			}
			
			System.out.println("Do you want try another values? y/n");
			
			String closeProgramReply = sc.nextLine();		
			closeProgramReply = sc.nextLine();
			if (closeProgramReply.equals("y")) {
				loopCondition = true;
			}
			else {
				loopCondition = false;
			}
		}
		System.out.println("Thank for using my program.");
		
		
		
		
		

	}

}
