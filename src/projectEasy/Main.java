package projectEasy;

import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		int number;
		int winRatio = 0;
		int loseRatio = 0;
		Random randomNumber = new Random();
		number = randomNumber.nextInt(1, 5);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Insert the correct random number(1, 4): ");
		int input = scanner.nextInt();
		scanner.nextLine();
		
		
		System.out.println("Random number was: " + number + ", you inserted the number: " + input);
		
		if (input != number) {
			System.out.println("You lose");
			loseRatio += 1;
		} else {
			System.out.println("You win");
			winRatio += 1;
		}
		
		number = 0;
		input = 0;
		Random randomNumber1 = new Random();
		number = randomNumber1.nextInt(1, 6);
		
		System.out.print("Insert the correct random number(1, 5): ");
		input = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Random number was: " + number + ", you inserted the number: " + input);
		
		if (input != number) {
			System.out.println("You lose");
			loseRatio += 1;
		} else {
			System.out.println("You win");
			winRatio += 1;
		}
		
		number = 0;
		input = 0;
		Random randomNumber2 = new Random();
		number = randomNumber2.nextInt(1, 7);
		
		System.out.print("Insert the correct random number(1, 6): ");
		input = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Random number was: " + number + ", you inserted the number: " + input);
		
		if (input != number) {
			System.out.println("You lose");
			loseRatio += 1;
		} else {
			System.out.println("You win");
			winRatio += 1;
		}
		
		scanner.close();
		
		System.out.println("\n Win lose ratio: " + winRatio + ":" + loseRatio);
		
	}

}
