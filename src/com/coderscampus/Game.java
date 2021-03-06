package com.coderscampus;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Game game = new Game();
		game.numbVerify();
	}

	private int getNumber() {
		Scanner scanner = new Scanner(System.in);
		boolean correctEntry = false;
		int convertedInput = 0;
		while (!correctEntry) {
			System.out.print("Pick a number between 1 and 100 ");
			String input = scanner.next();
			convertedInput = Integer.parseInt(input);
			if (convertedInput < 1 || convertedInput > 100) {
				System.out.println("Your guess is not between 1 and 100, please try again");
			} else {
				correctEntry = true;
			}
		}
		return convertedInput;

	}

	private void numbVerify() {
		
		double num = Math.random();
		int randomInt = (int)(num*100+1);

		for (int i = 0; i < 5; i++) {
			int guessedNumber = getNumber();
			if (guessedNumber == randomInt) {
				System.out.println("You win!!");
				i = 5;
			} else if (guessedNumber > randomInt) {
				System.out.println("Please pick a lower number");
			} else if (guessedNumber < randomInt) {
				System.out.println("Please pick a Higher number");
			}
			if (i == 4) {
				System.out.println("You loose!!");
				System.out.println("The number to guess was: " + randomInt);
			}
		}

	}
}
